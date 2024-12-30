package com.aynisac.proyectoayni.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ClientePresupuesto implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int num_cliente;
    
    private String nombreEmp;
    private String tiempo;
    private String condicion;
    private String precio;
    private String observacion;

    public ClientePresupuesto() {
    }

    public ClientePresupuesto(int num_cliente, String nombreEmp, String tiempo, String condicion, String precio, String observacion) {
        this.num_cliente = num_cliente;
        this.nombreEmp = nombreEmp;
        this.tiempo = tiempo;
        this.condicion = condicion;
        this.precio = precio;
        this.observacion = observacion;
    }

    public int getNum_cliente() {
        return num_cliente;
    }

    public void setNum_cliente(int num_cliente) {
        this.num_cliente = num_cliente;
    }

    public String getNombreEmp() {
        return nombreEmp;
    }

    public void setNombreEmp(String nombreEmp) {
        this.nombreEmp = nombreEmp;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

}
