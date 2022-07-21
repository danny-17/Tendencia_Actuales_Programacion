/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example._EXAMEN_12.errores;

import java.util.Arrays;
import java.util.List;
import org.springframework.http.HttpStatus;

/**
 *
 * @author Usuario Estandar
 */
public class MensajeError {
    
    private HttpStatus status;
    private String mensaje;
    private List<String> errores;

    public MensajeError(HttpStatus status, String mensaje, List<String> errores) {
        super();
        this.status = status;
        this.mensaje = mensaje;
        this.errores = errores;
    }
    
    public MensajeError(HttpStatus status, String mensaje, String error) {
        super();
        this.status = status;
        this.mensaje = mensaje;
        errores = Arrays.asList(error);
    }
}
