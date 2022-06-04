package com.example.demo.Security.Util;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.Security.Enums.RolNombre;
import com.example.demo.Security.Models.Rol;
import com.example.demo.Security.Services.RolService;


/**
 * MUY IMPORTANTE: ESTA CLASE SÓLO SE EJECUTARÁ UNA VEZ PARA CREAR LOS ROLES.
 * UNA VEZ CREADOS SE DEBERÁ ELIMINAR O BIEN COMENTAR EL CÓDIGO
 *
 */

@Component
public class CreateRoles implements CommandLineRunner {

    @Autowired
    RolService rolService;

    @Override
    public void run(String... args) throws Exception {
        /**Rol rolAdmin = new Rol(RolNombre.ROLE_ADMIN);
        Rol rolUser = new Rol(RolNombre.ROLE_COORD);
        Rol rolUser2 = new Rol(RolNombre.ROLE_SUPERV);
        rolService.save(rolAdmin);
        rolService.save(rolUser);
        rolService.save(rolUser2);
        **/
    }
}