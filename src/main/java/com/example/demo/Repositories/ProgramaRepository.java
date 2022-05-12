package com.example.demo.Repositories;

import com.example.demo.Models.ProgramaModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgramaRepository extends CrudRepository<ProgramaModel, Long>{
    
}
