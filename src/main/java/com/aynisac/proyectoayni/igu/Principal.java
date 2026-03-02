package com.aynisac.proyectoayni.igu;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JFrame;

public class Principal extends javax.swing.JFrame {
    
    public Principal() {
        initComponents();
        setLocationRelativeTo(null);
        LocalDate fechaActual = LocalDate.now();
        jLabel3.setText("Fecha: " + fechaActual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel2 = new javax.swing.JLabel();
        btnViabilidad = new javax.swing.JButton();
        btnPresupuesto = new javax.swing.JButton();
        btnOC = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        mniViabilidad = new javax.swing.JMenuItem();
        mniPresupuesto = new javax.swing.JMenuItem();
        mnuOC = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mniExit = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ayni SAC");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jDesktopPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon("D:\\ProyectoAyni\\src\\main\\java\\com\\aynisac\\proyectoayni\\imagenes\\ayni_sac_logo_cuadrado.jpg")); // NOI18N
        jDesktopPane1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 190, 190));

        btnViabilidad.setText("Nuevo Pedido");
        btnViabilidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViabilidadActionPerformed(evt);
            }
        });
        jDesktopPane1.add(btnViabilidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, 160, 50));

        btnPresupuesto.setText("Ver Presupuestos");
        btnPresupuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPresupuestoActionPerformed(evt);
            }
        });
        jDesktopPane1.add(btnPresupuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 350, 160, 50));

        btnOC.setText("Estado de OC");
        btnOC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOCActionPerformed(evt);
            }
        });
        jDesktopPane1.add(btnOC, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 420, 160, 50));

        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3);

        jDesktopPane1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 610, 140, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\ProyectoAyni\\src\\main\\java\\com\\aynisac\\proyectoayni\\imagenes\\uno.jpg")); // NOI18N
        jDesktopPane1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 650));

        getContentPane().add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 650));

        jMenu2.setText("Menú");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        mniViabilidad.setText("Viabilidad del pedido");
        mniViabilidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniViabilidadActionPerformed(evt);
            }
        });
        jMenu2.add(mniViabilidad);

        mniPresupuesto.setText("Revisar y aceptar presupuesto");
        mniPresupuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniPresupuestoActionPerformed(evt);
            }
        });
        jMenu2.add(mniPresupuesto);

        mnuOC.setText("Cumplimiento de la Orden de Compra");
        mnuOC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuOCActionPerformed(evt);
            }
        });
        jMenu2.add(mnuOC);
        jMenu2.add(jSeparator1);

        mniExit.setText("Exit");
        mniExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniExitActionPerformed(evt);
            }
        });
        jMenu2.add(mniExit);

        jMenuBar2.add(jMenu2);

        jMenu3.setText("Edit");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Help");
        jMenuBar2.add(jMenu4);

        setJMenuBar(jMenuBar2);

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mniViabilidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniViabilidadActionPerformed
        ViabilidadPedido frmViabilidad = new ViabilidadPedido();
        frmViabilidad.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frmViabilidad.setVisible(true);
        frmViabilidad.setLocationRelativeTo(null);
    }//GEN-LAST:event_mniViabilidadActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void mniPresupuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniPresupuestoActionPerformed
        RevisarAceptarPresupuesto frmPresupuesto = new RevisarAceptarPresupuesto();
        frmPresupuesto.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frmPresupuesto.setVisible(true);
        frmPresupuesto.setLocationRelativeTo(null);
    }//GEN-LAST:event_mniPresupuestoActionPerformed

    private void mnuOCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuOCActionPerformed
        CumplimientoOC frmCumplimientoOC = new CumplimientoOC();
        frmCumplimientoOC.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frmCumplimientoOC.setVisible(true);
        frmCumplimientoOC.setLocationRelativeTo(null);
    }//GEN-LAST:event_mnuOCActionPerformed

    private void mniExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mniExitActionPerformed

    private void btnViabilidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViabilidadActionPerformed
        ViabilidadPedido frmViabilidad = new ViabilidadPedido();
        frmViabilidad.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frmViabilidad.setVisible(true);
        frmViabilidad.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnViabilidadActionPerformed

    private void btnPresupuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPresupuestoActionPerformed
        RevisarAceptarPresupuesto frmPresupuesto = new RevisarAceptarPresupuesto();
        frmPresupuesto.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frmPresupuesto.setVisible(true);
        frmPresupuesto.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnPresupuestoActionPerformed

    private void btnOCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOCActionPerformed
        CumplimientoOC frmCumplimientoOC = new CumplimientoOC();
        frmCumplimientoOC.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frmCumplimientoOC.setVisible(true);
        frmCumplimientoOC.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnOCActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOC;
    private javax.swing.JButton btnPresupuesto;
    private javax.swing.JButton btnViabilidad;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem mniExit;
    private javax.swing.JMenuItem mniPresupuesto;
    private javax.swing.JMenuItem mniViabilidad;
    private javax.swing.JMenuItem mnuOC;
    // End of variables declaration//GEN-END:variables
}
