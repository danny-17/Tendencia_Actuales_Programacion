/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example._EXAMEN_12.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Usuario Estandar
 */
@Entity
@Table(name = "medicamentos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Medicamentos.findAll", query = "SELECT m FROM Medicamentos m"),
    @NamedQuery(name = "Medicamentos.findByIdmedicamentos", query = "SELECT m FROM Medicamentos m WHERE m.idmedicamentos = :idmedicamentos"),
    @NamedQuery(name = "Medicamentos.findByNombre", query = "SELECT m FROM Medicamentos m WHERE m.nombre = :nombre"),
    @NamedQuery(name = "Medicamentos.findByTipo", query = "SELECT m FROM Medicamentos m WHERE m.tipo = :tipo"),
    @NamedQuery(name = "Medicamentos.findByCantidad", query = "SELECT m FROM Medicamentos m WHERE m.cantidad = :cantidad"),
    @NamedQuery(name = "Medicamentos.findByDistribuidor", query = "SELECT m FROM Medicamentos m WHERE m.distribuidor = :distribuidor"),
    @NamedQuery(name = "Medicamentos.findBySucursal", query = "SELECT m FROM Medicamentos m WHERE m.sucursal = :sucursal")})
public class Medicamentos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idmedicamentos")
    private Integer idmedicamentos;
    @Size(max = 45)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 45)
    @Column(name = "tipo")
    private String tipo;
    @Column(name = "cantidad")
    private Integer cantidad;
    @Size(max = 45)
    @Column(name = "distribuidor")
    private String distribuidor;
    @Size(max = 45)
    @Column(name = "sucursal")
    private String sucursal;

    public Medicamentos() {
    }

    public Medicamentos(Integer idmedicamentos) {
        this.idmedicamentos = idmedicamentos;
    }

    public Integer getIdmedicamentos() {
        return idmedicamentos;
    }

    public void setIdmedicamentos(Integer idmedicamentos) {
        this.idmedicamentos = idmedicamentos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public String getDistribuidor() {
        return distribuidor;
    }

    public void setDistribuidor(String distribuidor) {
        this.distribuidor = distribuidor;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idmedicamentos != null ? idmedicamentos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Medicamentos)) {
            return false;
        }
        Medicamentos other = (Medicamentos) object;
        if ((this.idmedicamentos == null && other.idmedicamentos != null) || (this.idmedicamentos != null && !this.idmedicamentos.equals(other.idmedicamentos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.example._EXAMEN_12.model.Medicamentos[ idmedicamentos=" + idmedicamentos + " ]";
    }
    
}
