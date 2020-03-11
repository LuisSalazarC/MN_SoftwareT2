
package tema2;

public class frmPrincipal extends javax.swing.JFrame {

    public frmPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        smnuBiseccion = new javax.swing.JMenuItem();
        smnuPuntoFijo = new javax.swing.JMenuItem();
        smnuNewton = new javax.swing.JMenuItem();
        smnuSecante = new javax.swing.JMenuItem();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Metodos Numericos");

        jMenu1.setText("Tema 2");

        smnuBiseccion.setText("Biseccion");
        smnuBiseccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smnuBiseccionActionPerformed(evt);
            }
        });
        jMenu1.add(smnuBiseccion);

        smnuPuntoFijo.setText("Punto Fijo");
        smnuPuntoFijo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smnuPuntoFijoActionPerformed(evt);
            }
        });
        jMenu1.add(smnuPuntoFijo);

        smnuNewton.setText("Newton");
        smnuNewton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smnuNewtonActionPerformed(evt);
            }
        });
        jMenu1.add(smnuNewton);

        smnuSecante.setText("Secante");
        smnuSecante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smnuSecanteActionPerformed(evt);
            }
        });
        jMenu1.add(smnuSecante);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(147, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(323, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void smnuNewtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnuNewtonActionPerformed
        /*dlgNewton newton = new dlgNewton(this, true);
        newton.setLocationRelativeTo(null);
        newton.setTitle("Biseccion");
        newton.setVisible(true);*/
    }//GEN-LAST:event_smnuNewtonActionPerformed

    private void smnuPuntoFijoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnuPuntoFijoActionPerformed
        /*dlgPuntoFijo puntoFijo = new dlgPuntoFijo(this, true);
        puntoFijo.setLocationRelativeTo(null);
        puntoFijo.setTitle("Biseccion");
        puntoFijo.setVisible(true);*/
    }//GEN-LAST:event_smnuPuntoFijoActionPerformed

    private void smnuSecanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnuSecanteActionPerformed
        /*dlgSecante secante = new dlgSecante(this, true);
        secante.setLocationRelativeTo(null);
        secante.setTitle("Biseccion");
        secante.setVisible(true);*/
    }//GEN-LAST:event_smnuSecanteActionPerformed

    private void smnuBiseccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnuBiseccionActionPerformed
        /*dlgBiseccion biseccion = new dlgBiseccion(this, true);
        biseccion.setLocationRelativeTo(null);
        biseccion.setTitle("Biseccion");
        biseccion.setVisible(true);*/
    }//GEN-LAST:event_smnuBiseccionActionPerformed

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JMenuItem smnuBiseccion;
    private javax.swing.JMenuItem smnuNewton;
    private javax.swing.JMenuItem smnuPuntoFijo;
    private javax.swing.JMenuItem smnuSecante;
    // End of variables declaration//GEN-END:variables
}
