package com.example.demo.Repositories;

import com.example.demo.Models.RequisitosModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RequisitosRepository extends CrudRepository<RequisitosModel, Long> {
    
}
