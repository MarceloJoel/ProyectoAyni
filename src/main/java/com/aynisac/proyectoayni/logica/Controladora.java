package com.aynisac.proyectoayni.logica;

import com.aynisac.proyectoainy.logica.Cliente;
import com.aynisac.proyectoayni.persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    //Codigo para Viabilidad de Pedido
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

    public void borrarCliente(int idCliente) {
        controlPersis.borrarCliente(idCliente);
    }

    public void modificarCliente(Cliente cliente, String nombreEmp, String plano, String detalle,
            String visTec, String observacion) {

        cliente.setNombre(nombreEmp);
        cliente.setPlano(plano);
        cliente.setDetalle(detalle);
        cliente.setVisTec(visTec);
        cliente.setObservaciones(observacion);

        //Mandar a persis para que modifique
        controlPersis.modificarCliente(cliente);

    }

    public Cliente traerCliente(int idCliente) {
        return controlPersis.traerCliente(idCliente);
    }

    //Codigo para Revisar y Aceptar Presupuesto
    public void guardarPresupuesto(String nombreEmp, String tiempo, String condicion, String precio, String observacion) {

        ClientePresupuesto cliente = new ClientePresupuesto();
        cliente.setNombreEmp(nombreEmp);
        cliente.setTiempo(tiempo);
        cliente.setCondicion(condicion);
        cliente.setPrecio(precio);
        cliente.setPrecio(precio);
        cliente.setObservacion(observacion);

        controlPersis.guardarPresupuesto(cliente);
    }

    public List<ClientePresupuesto> traerClientesPresupuesto() {
        return controlPersis.traerClientesPresupuesto();
    }

    public void borrarClientePresupuesto(int idCliente) {
        controlPersis.borrarClientePresupuesto(idCliente);
    }

    public ClientePresupuesto traerClientePresupuesto(int idCliente) {
        return controlPersis.traerClientePresupuesto(idCliente);
    }

    public void modificarClientePresupuesto(ClientePresupuesto clienteP, String nombreEmp, String tiempo, String condicion, String precio, String observacion) {
        ClientePresupuesto cliente = new ClientePresupuesto();
        cliente.setNombreEmp(nombreEmp);
        cliente.setTiempo(tiempo);
        cliente.setCondicion(condicion);
        cliente.setPrecio(precio);
        cliente.setObservacion(observacion);
        
        controlPersis.modificarClientePresupuesto(cliente);
    }
}
