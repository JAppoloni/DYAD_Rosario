/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfase;

/**
 *
 * @author Felipe
 */
public class vMotor extends javax.swing.JFrame {

    /**
     * Creates new form vMotor
     */
    public vMotor() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtNomMot = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEliMot = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtIdEli = new javax.swing.JTextField();
        txtNomEli = new javax.swing.JTextField();
        btnModificar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setText("Nombre:");

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(74, 74, 74)
                        .addComponent(txtNomMot, javax.swing.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAgregar)))
                .addGap(37, 37, 37))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNomMot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAgregar)
                .addContainerGap(376, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Agregar", jPanel1);

        tblEliMot.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Descripción"
            }
        ));
        tblEliMot.setSelectionMode();
        tblEliMot.addHierarchyListener(new java.awt.event.HierarchyListener() {
            public void hierarchyChanged(java.awt.event.HierarchyEvent evt) {
                tblEliMotHierarchyChanged(evt);
            }
        });
        tblEliMot.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tblEliMotFocusGained(evt);
            }
        });
        tblEliMot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEliMotMouseClicked(evt);
            }
        });
        tblEliMot.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                tblEliMotCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        tblEliMot.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tblEliMotPropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(tblEliMot);

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jLabel2.setText("Id:");

        jLabel4.setText("Nombre:");

        txtIdEli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdEliActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 619, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addGap(22, 22, 22)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNomEli)
                                    .addComponent(txtIdEli))))))
                .addGap(42, 42, 42))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtIdEli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNomEli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar)
                    .addComponent(btnModificar))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Modificar/Eliminar", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        cTipo unTipo;
        int num;

        try {
            //Verifica el ingreso de los datos requeridos
            if (this.txtNomMot.getText().length() > 0 && this.txtDesc.getText().length() > 0) {
                String ID = this.txtNomMot.getText().toString();
                //Verifico que hayan ingresado un número
                if (Utilidades.isNumeric(ID) == true) {
                    //Busco si el tipo ya no ha sido ingresado
                    unTipo = new cTipo();
                    num = Integer.parseInt(this.txtNomMot.getText());
                    unTipo.setId(num);
                    unTipo = empresa.buscarTipo(unTipo);
                    ////////////////////////////////////////////////////////////////////////////////////

                    if (unTipo == null) {
                        //Si el tipo no ha sido ingresado lo crea y le pasa los datos para ingresarlo
                        unTipo = new cTipo();
                        unTipo.setId(num);
                        unTipo.setDesc(this.txtDesc.getText());
                        empresa.agregarTipo(unTipo);
                        JOptionPane.showMessageDialog(this, "Se dado de alta correctamente", "Tipo", JOptionPane.INFORMATION_MESSAGE);

                        ReiniciarControles();

                    } else {
                        JOptionPane.showMessageDialog(this, "Id tipo ya existe", "Accion", JOptionPane.INFORMATION_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "El número del código del tipo debe ser un número", "Tipo", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Datos ingresados incorrectamente", "Accion", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Common.cDatosException e) {
            JOptionPane.showMessageDialog(this, e.toString(), "Tipo", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void tblEliMotMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEliMotMouseClicked
        int fila = this.tblEliMot.getSelectedRow();

        if (fila >= 0) {
            DefaultTableModel tm = (DefaultTableModel) this.tblEliMot.getModel();
            int numFilas = tm.getRowCount();
            if ((fila < numFilas) && (fila >= 0)) {

                // tomo los datos de los tipos existentes
                String id = String.valueOf(tm.getValueAt(fila, 0));
                String desc = (String) tm.getValueAt(fila, 1);

                this.txtIdEli.setText(id);
                this.txtNomEli.setText(desc);

            }
        }
    }//GEN-LAST:event_tblEliMotMouseClicked

    private void tblEliMotFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tblEliMotFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_tblEliMotFocusGained

    private void tblEliMotHierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_tblEliMotHierarchyChanged

    }//GEN-LAST:event_tblEliMotHierarchyChanged

    private void tblEliMotCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_tblEliMotCaretPositionChanged

    }//GEN-LAST:event_tblEliMotCaretPositionChanged

    private void tblEliMotPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tblEliMotPropertyChange

    }//GEN-LAST:event_tblEliMotPropertyChange

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        cTipo unTipo = new cTipo();
        int num;
        try {
            if (!this.txtIdEli.getText().equals("")) {
                num = Integer.parseInt(this.txtIdEli.getText());
                unTipo.setId(num);
                empresa.eliminarTipo(unTipo);
                JOptionPane.showMessageDialog(this, "Se dado eliminado correctamente", "Tipo", JOptionPane.INFORMATION_MESSAGE);
                ReiniciarControles();
            } else {
                JOptionPane.showMessageDialog(this, "Debe seleccionar un registro", "Tipo", JOptionPane.ERROR_MESSAGE);
            }

        } catch (Common.cDatosException e) {
            JOptionPane.showMessageDialog(this, e.toString(), "Tipo", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtIdEliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdEliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdEliActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        if (!this.txtNomEli.getText().equals("")
            && !this.txtIdEli.getText().equals("")) {

            try {

                Integer num;
                String desc;
                cTipo unTipo = new cTipo();

                num = Integer.parseInt(this.txtIdEli.getText());
                desc = this.txtNomEli.getText();
                unTipo.setId(num);
                unTipo.setDesc(desc);
                empresa.modificarTipo(unTipo);
                ReiniciarControles();
                JOptionPane.showMessageDialog(this, "Se ha modificado correctamente", "Tipo", JOptionPane.INFORMATION_MESSAGE);

            } catch (cDatosException e) {
                JOptionPane.showMessageDialog(this, e.toString(), "Tipo", JOptionPane.ERROR_MESSAGE);
            }

        } else {
            JOptionPane.showMessageDialog(this, "Datos ingresados incorrectamente", "Accion", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(vMotor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vMotor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vMotor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vMotor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vMotor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tblEliMot;
    private javax.swing.JTextField txtIdEli;
    private javax.swing.JTextField txtNomEli;
    private javax.swing.JTextField txtNomMot;
    // End of variables declaration//GEN-END:variables
}
