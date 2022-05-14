package com.example.demo.Repositories;

import com.example.demo.Models.PensumModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PensumRepository extends CrudRepository<PensumModel,Long>{
    
}
