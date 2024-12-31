package com.aynisac.proyectoayni.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ClienteOrdenCompra implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int num_cliente;
    private String nombreEmp;
    private String tiempo;
    private String atraso;
    private String observacion;

    public ClienteOrdenCompra() {
    }

    public ClienteOrdenCompra(int num_cliente, String nombreEmp, String tiempo, String atraso, String observacion) {
        this.num_cliente = num_cliente;
        this.nombreEmp = nombreEmp;
        this.tiempo = tiempo;
        this.atraso = atraso;
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

    public String getAtraso() {
        return atraso;
    }

    public void setAtraso(String atraso) {
        this.atraso = atraso;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

}
