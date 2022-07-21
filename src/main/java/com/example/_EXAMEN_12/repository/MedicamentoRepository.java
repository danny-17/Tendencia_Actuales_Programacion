/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example._EXAMEN_12.repository;

import com.example._EXAMEN_12.model.Medicamentos;
import java.util.ArrayList;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Usuario Estandar
 */
public interface MedicamentoRepository extends JpaRepository<Medicamentos, Integer>{
    ArrayList<Medicamentos>findByNombre(String nombre);
}
