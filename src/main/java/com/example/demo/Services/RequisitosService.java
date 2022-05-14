package com.example.demo.Services;

import java.util.ArrayList;

import com.example.demo.Models.RequisitosModel;
import com.example.demo.Repositories.RequisitosRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RequisitosService {
    @Autowired
    RequisitosRepository requisitosRepository;

    public ArrayList<RequisitosModel> obtenerFacultad(){
        return (ArrayList<RequisitosModel>)requisitosRepository.findAll();
    }

    public RequisitosModel guardarFacultad(RequisitosModel requisito){
        return requisitosRepository.save(requisito);
    }
}
