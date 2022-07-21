/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example._EXAMEN_12.service;

import com.example._EXAMEN_12.model.Medicamentos;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario Estandar
 */
public interface MedicamentosService {
    public Medicamentos create(Medicamentos m);
    public Medicamentos findById(Integer id);
    public List<Medicamentos> findbyAll();
    public void delete(Integer id);
    ArrayList<Medicamentos>findByNombre(String nombre);

}
