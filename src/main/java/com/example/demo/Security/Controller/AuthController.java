package com.example.demo.Security.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import com.example.demo.Security.Dto.JwtDto;
import com.example.demo.Security.Dto.LoginUsuario;
import com.example.demo.Security.Dto.NuevoUsuario;
import com.example.demo.Security.Enums.RolNombre;
import com.example.demo.Security.Jwt.JwtProvider;
import com.example.demo.Security.Models.Rol;
import com.example.demo.Security.Models.Usuario;
import com.example.demo.Security.Services.RolService;
import com.example.demo.Security.Services.UsuarioService;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping("/auth")
@CrossOrigin
public class AuthController {

    @Autowired(required = false)
    PasswordEncoder passwordEncoder;

    @Autowired(required = false)
    AuthenticationManager authenticationManager;

    @Autowired
    UsuarioService usuarioService;

    @Autowired
    RolService rolService;

    @Autowired
    JwtProvider jwtProvider;

    @PostMapping("/new")
    public ResponseEntity<?> nuevo(@RequestBody NuevoUsuario nuevoUsuario, BindingResult bindingResult){
        if(bindingResult.hasErrors())
            return new ResponseEntity<>("Campos incorrectos", HttpStatus.BAD_REQUEST);
        if(usuarioService.existsByEmail(nuevoUsuario.getEmail()))
            return new ResponseEntity<>("Este email ya existe", HttpStatus.BAD_REQUEST);
    
        Usuario usuario =
                new Usuario(nuevoUsuario.getNombre(), nuevoUsuario.getApellido(), nuevoUsuario.getCodigo(), nuevoUsuario.getEmail(), nuevoUsuario.getTelefono(),
                        passwordEncoder.encode(nuevoUsuario.getPassword()));
        Set<Rol> roles = new HashSet<>();
        if(nuevoUsuario.getRoles().contains("admin"))
            roles.add(rolService.getByRolNombre(RolNombre.ROLE_ADMIN).get());
        if(nuevoUsuario.getRoles().contains("coord"))
            roles.add(rolService.getByRolNombre(RolNombre.ROLE_COORD).get());
        if(nuevoUsuario.getRoles().contains("superv"))
            roles.add(rolService.getByRolNombre(RolNombre.ROLE_SUPERV).get());
        usuario.setRoles(roles);
        usuarioService.save(usuario);
        return new ResponseEntity<>("usuario guardado", HttpStatus.CREATED);
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginUsuario loginUsuario, BindingResult bindingResult){
        if(bindingResult.hasErrors())
        return new ResponseEntity<>("Campos mal puestos", HttpStatus.BAD_REQUEST);
        Authentication authentication =
                authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(loginUsuario.getEmail(), loginUsuario.getPassword()));
        SecurityContextHolder.getContext().setAuthentication(authentication);
        String jwt = jwtProvider.generateToken(authentication);
        UserDetails userDetails = (UserDetails)authentication.getPrincipal();
        JwtDto jwtDto = new JwtDto(jwt, userDetails.getUsername(), userDetails.getAuthorities());
        return new ResponseEntity<JwtDto>(jwtDto, HttpStatus.OK);
    }

    @GetMapping("/rol")
    public ArrayList<Rol> obtenerRoles(){
        return rolService.obtenerRoles();
    }
}
