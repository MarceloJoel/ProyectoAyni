package com.aynisac.proyectoayni.igu;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mniViabilidad = new javax.swing.JMenuItem();
        mniPresupuesto = new javax.swing.JMenuItem();
        mniOC = new javax.swing.JMenuItem();
        mniExit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ayni SAC");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\NetBeansProject\\ProyectoAyni\\src\\main\\java\\com\\aynisac\\proyectoayni\\icono\\portada.jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\NetBeansProject\\ProyectoAyni\\src\\main\\java\\com\\aynisac\\proyectoayni\\icono\\logoAyni_horizontal.png")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, -1, -1));

        jMenu1.setIcon(new javax.swing.ImageIcon("C:\\NetBeansProject\\recursos\\BotonMenu.png")); // NOI18N

        mniViabilidad.setIcon(new javax.swing.ImageIcon("C:\\NetBeansProject\\recursos\\plus.png")); // NOI18N
        mniViabilidad.setText("Viabilidad del pedido");
        mniViabilidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniViabilidadActionPerformed(evt);
            }
        });
        jMenu1.add(mniViabilidad);

        mniPresupuesto.setIcon(new javax.swing.ImageIcon("C:\\NetBeansProject\\recursos\\plus.png")); // NOI18N
        mniPresupuesto.setText("Revisar y aceptar presupuesto");
        mniPresupuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniPresupuestoActionPerformed(evt);
            }
        });
        jMenu1.add(mniPresupuesto);

        mniOC.setIcon(new javax.swing.ImageIcon("C:\\NetBeansProject\\recursos\\plus.png")); // NOI18N
        mniOC.setText("Cumplimiento de la Orden de Compra");
        mniOC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniOCActionPerformed(evt);
            }
        });
        jMenu1.add(mniOC);

        mniExit.setIcon(new javax.swing.ImageIcon("C:\\NetBeansProject\\recursos\\plus.png")); // NOI18N
        mniExit.setText("Exit");
        mniExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniExitActionPerformed(evt);
            }
        });
        jMenu1.add(mniExit);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mniViabilidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniViabilidadActionPerformed
        ViabilidadPedido frmViabilidad = new ViabilidadPedido();
        frmViabilidad.setVisible(true);
        frmViabilidad.setLocationRelativeTo(null);
    }//GEN-LAST:event_mniViabilidadActionPerformed

    private void mniPresupuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniPresupuestoActionPerformed

    }//GEN-LAST:event_mniPresupuestoActionPerformed

    private void mniOCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniOCActionPerformed
        CumplimientoOC frmCumplimientoOC = new CumplimientoOC();
        frmCumplimientoOC.setVisible(true);
        frmCumplimientoOC.setLocationRelativeTo(null);
    }//GEN-LAST:event_mniOCActionPerformed

    private void mniExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mniExitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mniExit;
    private javax.swing.JMenuItem mniOC;
    private javax.swing.JMenuItem mniPresupuesto;
    private javax.swing.JMenuItem mniViabilidad;
    // End of variables declaration//GEN-END:variables
}
