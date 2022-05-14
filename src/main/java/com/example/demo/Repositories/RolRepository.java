package com.example.demo.Repositories;

import com.example.demo.Models.RolModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepository extends CrudRepository<RolModel,Long>{
    
}
