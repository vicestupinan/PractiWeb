package com.example.demo.Repositories;

import com.example.demo.Models.UsuarioRolModel;
import com.example.demo.Models.UsuarioRolPk;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRolRepository extends CrudRepository<UsuarioRolModel, UsuarioRolPk> {
    
}
