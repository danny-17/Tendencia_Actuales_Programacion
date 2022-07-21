/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example._EXAMEN_12.service;

import com.example._EXAMEN_12.model.Medicamentos;
import com.example._EXAMEN_12.repository.MedicamentoRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Usuario Estandar
 */
@Service
public class MedicamentosServiceImp implements MedicamentosService {

    @Autowired
    MedicamentoRepository medicamentoR;

    @Override
    public Medicamentos create(Medicamentos m) {
        return medicamentoR.save(m);
    }

    @Override
    public Medicamentos findById(Integer id) {
        return medicamentoR.findById(id).orElse(new Medicamentos());
    }

    @Override
    public List<Medicamentos> findbyAll() {
        return medicamentoR.findAll();
    }

    @Override
    public void delete(Integer id) {
        medicamentoR.deleteById(id);
    }

    @Override
    public ArrayList<Medicamentos> findByNombre(String nombre) {
        return (ArrayList<Medicamentos>) medicamentoR.findByNombre(nombre);

    }

}
