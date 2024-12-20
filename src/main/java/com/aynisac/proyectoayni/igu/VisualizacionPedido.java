package com.aynisac.proyectoayni.igu;

import com.aynisac.proyectoainy.logica.Cliente;
import com.aynisac.proyectoayni.logica.Controladora;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class VisualizacionPedido extends javax.swing.JFrame {

    //Se inicializa la clase en null xq es buena práctica
    Controladora control = null;
    
    public VisualizacionPedido() {
        control = new Controladora();
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaClientes = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnEditar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel1.setText("Visualización de Pedidos");

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaClientes);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Datos de empresa:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        btnEditar.setIcon(new javax.swing.ImageIcon("C:\\NetBeansProject\\recursos\\editar.png")); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon("C:\\NetBeansProject\\recursos\\limpiar.png")); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnEditar1.setIcon(new javax.swing.ImageIcon("C:\\NetBeansProject\\recursos\\Excel.jpg")); // NOI18N
        btnEditar1.setText("Excel");
        btnEditar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEditar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnEditar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(106, 106, 106))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditar1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cargarTabla();
    }//GEN-LAST:event_formWindowOpened

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
//        //Controlo que la tabla no este vacia
//        if (tablaMascotas.getRowCount() > 0) {
//            //Controlo que se haya seleccionado a una mascota
//            if (tablaMascotas.getSelectedRow() != -1) {
//                //Obtengo id de la mascota eliminar
//                int num_cliente = Integer.parseInt(String.valueOf(tablaMascotas.getValueAt(tablaMascotas.getSelectedRow(), 0)));
//                //Llamo al método eliminar
//                control.borrarMascota(num_cliente);
//                //Aviso al usuario que borró correctamente
//                mostrarMensaje("Mascota eliminada correctamente", "Info", "Borrado de Mascota");
//                cargarTabla();
//            } else {
//                mostrarMensaje("No selecciono ninguna mascota", "Error", "Error al eliminar");
//            }
//        } else {
//            mostrarMensaje("No hay nada para eliminar en la tabla", "Error", "Error al eliminar");
//        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
//        //Controlo que la tabla no este vacia
//        if (tablaMascotas.getRowCount() > 0) {
//            //Controlo que se haya seleccionado a una mascota
//            if (tablaMascotas.getSelectedRow() != -1) {
//                //Obtengo id de la mascota eliminar
//                int num_cliente = Integer.parseInt(String.valueOf(tablaMascotas.getValueAt(tablaMascotas.getSelectedRow(), 0)));
//
//                ModificarDatos pantallaModif = new ModificarDatos(num_cliente);
//                pantallaModif.setVisible(true);
//                pantallaModif.setLocationRelativeTo(null);
//                
//                this.dispose();
//                
//            } else {
//                mostrarMensaje("No selecciono ninguna mascota", "Error", "Error al eliminar");
//            }
//        } else {
//            mostrarMensaje("No hay nada para eliminar en la tabla", "Error", "Error al eliminar");
//        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEditar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditar1ActionPerformed
    
    public void mostrarMensaje(String mensaje, String tipo, String titulo) {
//        JOptionPane optionPane = new JOptionPane(mensaje);
//        if (tipo.equals("Info")) {
//            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
//        } else if (tipo.equals("Error")) {
//            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
//        }
//        JDialog dialog = optionPane.createDialog(titulo);
//        dialog.setAlwaysOnTop(true);
//        dialog.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEditar1;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaClientes;
    // End of variables declaration//GEN-END:variables

    private void cargarTabla() {
        DefaultTableModel modeloTabla = new DefaultTableModel() {
            //filas y columnas no tienen que ser editables
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        //Establecer nombres en las columnas
        String titulos[] = {"Num", "Cliente", "Plano", "Detalle", "Vis. Técnica", "Observación"};
        modeloTabla.setColumnIdentifiers(titulos);

        //Carga los datos de la BD
        List<Cliente> listaClientes = control.traerClientes();

        //Recorrer la lista y mostrar cada uno de los elementos en la tabla
        if (listaClientes != null) {
            for (Cliente cliente : listaClientes) {
                Object[] objeto = {cliente.getNum_cliente(), cliente.getNombre(), cliente.getPlano(),
                    cliente.getDetalle(), cliente.getVisTec(), cliente.getObservaciones()};
                
                modeloTabla.addRow(objeto);
            }
        }

        //Todos los valores se asignan a la tabla de la interfaz
        tablaClientes.setModel(modeloTabla);
        
    }

//    private void cargarTabla() {
//
//        //Carga de los datos desde la base de datos
//        List<Mascota> listaMascotas = control.traerMascotas();
//
//        //Recorrer la lista y mostrar cada uno de los elementos en la tabla
//        if (listaMascotas != null) {
//            for (Mascota masco : listaMascotas) {
//                Object[] objeto = {masco.getNum_cliente(), masco.getNombre(), masco.getColor(), masco.getRaza(),
//                    masco.getAlergico(), masco.getAtencion_especial(),
//                    masco.getUnDuenio().getNombre(), masco.getUnDuenio().getCelDuenio()};
//
//                modeloTabla.addRow(objeto);
//            }
//        }
//
//        //Todos los valores se asignan a la tu JTable tablaMascotas:
//        tablaMascotas.setModel(modeloTabla);
//    }
}