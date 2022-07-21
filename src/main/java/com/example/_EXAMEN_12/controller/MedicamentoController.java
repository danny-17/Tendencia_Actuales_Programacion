/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example._EXAMEN_12.controller;

import com.example._EXAMEN_12.model.Medicamentos;
import com.example._EXAMEN_12.service.MedicamentosServiceImp;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Usuario Estandar
 */
@RestController
@RequestMapping("/api/medicamento")
public class MedicamentoController {

    @Autowired
    MedicamentosServiceImp medicamentoS;

    @GetMapping("/listar")
    public ResponseEntity<List<Medicamentos>> listar() {
        return new ResponseEntity<>(medicamentoS.findbyAll(), HttpStatus.OK);
    }

    @PostMapping("/crear")
    public ResponseEntity<Medicamentos> crearMedicamento(@RequestBody Medicamentos m) {
        
        return new ResponseEntity<>(medicamentoS.create(m), HttpStatus.CREATED);
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Medicamentos> eliminarMedicamento(@PathVariable Integer id) {
        medicamentoS.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Medicamentos> actualizarMedicamento(@PathVariable Integer id, @RequestBody Medicamentos m) {
        Medicamentos medicamento = medicamentoS.findById(id);
        if (medicamento == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                medicamento.setNombre(m.getNombre());
                medicamento.setTipo(m.getTipo());
                medicamento.setDistribuidor(m.getDistribuidor());
                medicamento.setCantidad(m.getCantidad());
                medicamento.setSucursal(m.getSucursal());
                return new ResponseEntity<>(medicamentoS.create(m), HttpStatus.CREATED);
            } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }
    
    @GetMapping("/listar/{nombre}")
    public ResponseEntity<ArrayList<Medicamentos>>listarNombre_Medicamento(@PathVariable String nombre){
        return new ResponseEntity<>(medicamentoS.findByNombre(nombre),HttpStatus.OK);
    }
}
