
package com.aynisac.proyectoayni.logica;

import com.aynisac.proyectoainy.logica.Cliente;
import com.aynisac.proyectoayni.persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void guardar(String nombreEmp, String plano, String detalle, String visTec, String observacion) {
        //Creamos el cliente y asignamos sus valores
        Cliente cliente = new Cliente();
        cliente.setNombre(nombreEmp);
        cliente.setPlano(plano);
        cliente.setDetalle(detalle);
        cliente.setVisTec(visTec);
        cliente.setObservaciones(observacion);

        controlPersis.guardar(cliente);
    }

    public List<Cliente> traerClientes() {
        return controlPersis.traerClientes();
    }
}
