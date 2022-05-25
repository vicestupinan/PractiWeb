package com.example.demo.Repositories;

import com.example.demo.Models.TrackingArchivosModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrackingArchivosRepository extends CrudRepository<TrackingArchivosModel, Long> { 
    
}
