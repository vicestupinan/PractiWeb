package com.example.demo.Controller;

import java.util.ArrayList;
import java.util.Optional;

import com.example.demo.Models.RolModel;
import com.example.demo.Models.UsuarioModel;
import com.example.demo.Models.UsuarioRolModel;
import com.example.demo.Services.RolService;
import com.example.demo.Services.UsuarioRolService;
import com.example.demo.Services.UsuarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usradmin")
public class UsuarioController {
    @Autowired
    UsuarioService usuarioService;

    @Autowired
    RolService rolService;

    @Autowired
    UsuarioRolService usuarioRolService;

    @GetMapping("/roles")
    public ArrayList<RolModel> obtenerRoles() {
        return rolService.obtenerRol();
    }

    @PostMapping("/nuevorol")
    public RolModel guardarRol(@RequestBody RolModel rol) {
        return this.rolService.guardarRol(rol);
    }

    @GetMapping("/usuarios")
    public ArrayList<UsuarioModel> obtenerUsuarios() {
        return usuarioService.obtenerUsuario();
    }

    @PostMapping("/nuevousuario")
    public UsuarioModel guardarUsuario(@RequestBody UsuarioModel usuario) {
        Long programa = (long) 1;
        Long rol = (long) 1;
        String id = usuario.getCodigo();
        UsuarioRolModel usrRol = new UsuarioRolModel(id, programa, rol, true);
        usuarioRolService.guardarUsuarioRol(usrRol);
        return this.usuarioService.guardarUsuario(usuario);
    }

    @GetMapping(path = "/{codigo}")
    public Optional<UsuarioModel> obtenerUsuarioPorId(@PathVariable("codigo") String codigo) {
        return this.usuarioService.obtenerPorCodigo(codigo);
    }
}
