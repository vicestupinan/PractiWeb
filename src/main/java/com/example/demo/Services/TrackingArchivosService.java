package com.example.demo.Services;

import java.util.ArrayList;

import com.example.demo.Models.TrackingArchivosModel;
import com.example.demo.Repositories.TrackingArchivosRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrackingArchivosService {

    @Autowired
    TrackingArchivosRepository trackingArchivosRepository;

    public ArrayList<TrackingArchivosModel> obtenerSeguimiento(){
        return (ArrayList<TrackingArchivosModel>)trackingArchivosRepository.findAll();
    }

    public TrackingArchivosModel guardarSeguimiento(TrackingArchivosModel tracking){
        return trackingArchivosRepository.save(tracking);
    }
}
