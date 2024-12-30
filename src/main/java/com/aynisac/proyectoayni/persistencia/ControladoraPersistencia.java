package com.aynisac.proyectoayni.persistencia;

import com.aynisac.proyectoainy.logica.Cliente;
import com.aynisac.proyectoayni.logica.ClientePresupuesto;
import com.aynisac.proyectoayni.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {

    ClienteJpaController clienteJpa = new ClienteJpaController();
    ClientePresupuestoJpaController clientePresupuestoJpa = new ClientePresupuestoJpaController();

    public void guardar(Cliente cliente) {
        //Creamos el cliente en la BD
        clienteJpa.create(cliente);
    }

    public List<Cliente> traerClientes() {
        return clienteJpa.findClienteEntities();
    }

    public void borrarCliente(int idCliente) {
        try {
            clienteJpa.destroy(idCliente);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void modificarCliente(Cliente cliente) {
        try {
            clienteJpa.edit(cliente);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Cliente traerCliente(int idCliente) {
        return clienteJpa.findCliente(idCliente);
    }

    //Codigo para Revisar y Aceptar Presupuesto
    
    public void guardarPresupuesto(ClientePresupuesto cliente) {
        clientePresupuestoJpa.create(cliente);
    }

    public List<ClientePresupuesto> traerClientesPresupuesto() {
        return clientePresupuestoJpa.findClientePresupuestoEntities();
    }

    public void borrarClientePresupuesto(int idCliente) {
        try {
            clientePresupuestoJpa.destroy(idCliente);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ClientePresupuesto traerClientePresupuesto(int idCliente) {
        return clientePresupuestoJpa.findClientePresupuesto(idCliente);
    }

    public void modificarClientePresupuesto(ClientePresupuesto cliente) {
        try {
            clientePresupuestoJpa.edit(cliente);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
