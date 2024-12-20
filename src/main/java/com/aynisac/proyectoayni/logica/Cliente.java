package com.aynisac.proyectoainy.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cliente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int num_cliente;
    private String nombre;
    private String plano;
    private String detalle;
    private String visTec;
    private String observaciones;

    public Cliente() {
    }

    public Cliente(int num_cliente, String nombre, String plano, String detalle, String visTec, String observaciones) {
        this.num_cliente = num_cliente;
        this.nombre = nombre;
        this.plano = plano;
        this.detalle = detalle;
        this.visTec = visTec;
        this.observaciones = observaciones;
    }

    public int getNum_cliente() {
        return num_cliente;
    }

    public void setNum_cliente(int num_cliente) {
        this.num_cliente = num_cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPlano() {
        return plano;
    }

    public void setPlano(String plano) {
        this.plano = plano;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public String getVisTec() {
        return visTec;
    }

    public void setVisTec(String visTec) {
        this.visTec = visTec;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

}
