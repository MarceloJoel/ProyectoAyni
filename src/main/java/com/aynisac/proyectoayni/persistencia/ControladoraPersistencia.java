package com.aynisac.proyectoayni.persistencia;

import com.aynisac.proyectoainy.logica.Cliente;
import java.util.List;

public class ControladoraPersistencia {

    ClienteJpaController clienteJpa = new ClienteJpaController();

    public void guardar(Cliente cliente) {
        //Creamos el cliente en la BD
        clienteJpa.create(cliente);
    }

    public List<Cliente> traerClientes() {
        return clienteJpa.findClienteEntities();
    }
}
