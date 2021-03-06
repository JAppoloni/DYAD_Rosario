package Interfase;

import Common.Utilidades;
import Common.cliente;
import Dominio.dEmpresa;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Common.cDatosException;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class vCliente extends javax.swing.JFrame {

    private ArrayList<cliente> ListaClientes = new ArrayList<cliente>();
    /**
     * Creates new form vCliente
     */
    private dEmpresa dEmpresa;

    public vCliente(dEmpresa pEmp) {
        initComponents();
        dEmpresa = pEmp;
    }

    private vCliente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane3 = new javax.swing.JTabbedPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtIdCli = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtNomEmpCli = new javax.swing.JTextField();
        txtNomFanCli = new javax.swing.JTextField();
        txtPaisCli = new javax.swing.JTextField();
        txtDirCli = new javax.swing.JTextField();
        txtTelCli = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtIdCli1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtNomEmpCli1 = new javax.swing.JTextField();
        txtNomFanCli1 = new javax.swing.JTextField();
        txtPaisCli1 = new javax.swing.JTextField();
        txtDirCli1 = new javax.swing.JTextField();
        txtTelCli1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEliCli = new javax.swing.JTable();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel3.setText("Id:");

        jLabel1.setText("Nombre Empresa:");

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jLabel5.setText("Nombre Fantasía:");

        jLabel7.setText("País de origen:");

        jLabel8.setText("Direccion:");

        jLabel9.setText("Telefono:");

        txtNomFanCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomFanCliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAgregar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNomFanCli)
                            .addComponent(txtIdCli, javax.swing.GroupLayout.DEFAULT_SIZE, 723, Short.MAX_VALUE)
                            .addComponent(txtNomEmpCli)
                            .addComponent(txtPaisCli)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDirCli)
                            .addComponent(txtTelCli))))
                .addGap(37, 37, 37))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtIdCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNomEmpCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtNomFanCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPaisCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDirCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(27, 27, 27)
                .addComponent(btnAgregar)
                .addContainerGap(247, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Agregar", jPanel1);

        jLabel10.setText("Id:");

        jLabel11.setText("Nombre Empresa:");

        jLabel12.setText("Nombre Fantasía:");

        jLabel13.setText("País de origen:");

        jLabel14.setText("Direccion:");

        jLabel15.setText("Telefono:");

        txtNomFanCli1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomFanCli1ActionPerformed(evt);
            }
        });

        tblEliCli.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Empresa", "Nombre Fantasía", "País", "Dirección", "Teléfono"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblEliCli.addHierarchyListener(new java.awt.event.HierarchyListener() {
            public void hierarchyChanged(java.awt.event.HierarchyEvent evt) {
                tblEliCliHierarchyChanged(evt);
            }
        });
        tblEliCli.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tblEliCliFocusGained(evt);
            }
        });
        tblEliCli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEliCliMouseClicked(evt);
            }
        });
        tblEliCli.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                tblEliCliCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        tblEliCli.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tblEliCliPropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(tblEliCli);

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnModificar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar))
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPaisCli1)
                            .addComponent(txtNomFanCli1)
                            .addComponent(txtIdCli1, javax.swing.GroupLayout.DEFAULT_SIZE, 699, Short.MAX_VALUE)
                            .addComponent(txtNomEmpCli1)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15))
                        .addGap(55, 55, 55)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTelCli1)
                            .addComponent(txtDirCli1))))
                .addGap(37, 37, 37))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtIdCli1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtNomEmpCli1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtNomFanCli1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPaisCli1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDirCli1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelCli1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Modificar/Eliminar", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        cliente unCliente;
        int num;

        try {
            //Verifica el ingreso de los datos requeridos
            if (this.txtIdCli.getText().length() > 0 && this.txtNomEmpCli.getText().length() > 0 && this.txtNomFanCli.getText().length() > 0 && this.txtPaisCli.getText().length() > 0 && this.txtDirCli.getText().length() > 0 && this.txtTelCli.getText().length() > 0
                && !Utilidades.isNumeric(this.txtNomEmpCli.getText()) && !Utilidades.isNumeric(this.txtNomFanCli.getText()) && !Utilidades.isNumeric(this.txtPaisCli.getText())) {

                String ID = this.txtIdCli.getText().toString();
                //Verifico que hayan ingresado un número
                if (Utilidades.isNumeric(ID) == true ) {
                    //Busco si el cliente ya no ha sido ingresado
                    unCliente = new cliente();
                    num = Integer.parseInt(this.txtIdCli.getText());
                    unCliente.setIdClie(num);
                    unCliente = dEmpresa.buscarCliente(unCliente);
                    ////////////////////////////////////////////////////////////////////////////////////

                    if (unCliente == null) {
                        //Si el cliente no ha sido ingresado lo crea y le pasa los datos para ingresarlo
                        unCliente = new cliente();
                        unCliente.setIdClie(num);
                        unCliente.setNombreEmpresaClie(this.txtNomEmpCli.getText());
                        unCliente.setNombreFantasiaClie(this.txtNomFanCli.getText());
                        unCliente.setPaisClie(this.txtPaisCli.getText());
                        unCliente.setDireccionClie(this.txtDirCli.getText());
                        unCliente.setContactoClie(this.txtTelCli.getText());
                        dEmpresa.agregarCliente(unCliente);
                        JOptionPane.showMessageDialog(this, "Se ha dado de alta correctamente", "Cliente", JOptionPane.INFORMATION_MESSAGE);

                        ReiniciarControles();

                    } else {
                        JOptionPane.showMessageDialog(this, "Id cliente ya existe", "Accion", JOptionPane.INFORMATION_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "El número del código del cliente debe ser un número", "Cliente", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Error al ingresar campos", "Cliente", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (Common.cDatosException e) {
            JOptionPane.showMessageDialog(this, e.toString(), "Cliente", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void tblEliCliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEliCliMouseClicked
        int fila = this.tblEliCli.getSelectedRow();

        if (fila >= 0) {
            DefaultTableModel tm = (DefaultTableModel) this.tblEliCli.getModel();
            int numFilas = tm.getRowCount();
            if ((fila < numFilas) && (fila >= 0)) {

                // tomo los datos de los clientes existentes
                String id = String.valueOf(tm.getValueAt(fila, 0));
                String NomEmp = (String) tm.getValueAt(fila, 1);
                String NomFan = (String) tm.getValueAt(fila, 2);
                String Pais = (String) tm.getValueAt(fila, 3);
                String Dir = (String) tm.getValueAt(fila, 4);
                String Tel = (String) tm.getValueAt(fila, 5);

                this.txtIdCli1.setText(id);
                this.txtNomEmpCli1.setText(NomEmp);
                this.txtNomFanCli1.setText(NomFan);
                this.txtPaisCli1.setText(Pais);
                this.txtDirCli1.setText(Dir);
                this.txtTelCli1.setText(Tel);

            }
        }
    }//GEN-LAST:event_tblEliCliMouseClicked

    private void tblEliCliFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tblEliCliFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_tblEliCliFocusGained

    private void tblEliCliHierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_tblEliCliHierarchyChanged

    }//GEN-LAST:event_tblEliCliHierarchyChanged

    private void tblEliCliCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_tblEliCliCaretPositionChanged

    }//GEN-LAST:event_tblEliCliCaretPositionChanged

    private void tblEliCliPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tblEliCliPropertyChange

    }//GEN-LAST:event_tblEliCliPropertyChange

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        cliente unCliente = new cliente();
        int num;
        try {
            if (!this.txtIdCli1.getText().equals("")) {
                num = Integer.parseInt(this.txtIdCli1.getText());
                unCliente.setIdClie(num);
                dEmpresa.eliminarCliente(unCliente);
                JOptionPane.showMessageDialog(this, "Se ha eliminado correctamente", "Tipo", JOptionPane.INFORMATION_MESSAGE);
                ReiniciarControles();
            } else {
                JOptionPane.showMessageDialog(this, "Debe seleccionar un registro", "Tipo", JOptionPane.ERROR_MESSAGE);
            }

        } catch (Common.cDatosException e) {
            JOptionPane.showMessageDialog(this, e.toString(), "Tipo", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        if (!this.txtIdCli1.getText().equals("")&& !this.txtNomEmpCli1.getText().equals("")&& !this.txtNomFanCli1.getText().equals("")&& !this.txtPaisCli1.getText().equals("")&& !this.txtDirCli1.getText().equals("") && !this.txtTelCli1.getText().equals("")
                && !Utilidades.isNumeric(this.txtNomEmpCli1.getText()) && !Utilidades.isNumeric(this.txtNomFanCli1.getText()) && !Utilidades.isNumeric(this.txtPaisCli1.getText())) {

            try {

                Integer num;
                String NomEmp;
                String NomFan;
                String Pais;
                String Dir;
                String Tel;
                cliente unCliente = new cliente();

                num = Integer.parseInt(this.txtIdCli1.getText());
                NomEmp = this.txtNomEmpCli1.getText();
                NomFan = this.txtNomFanCli1.getText();
                Pais = this.txtPaisCli1.getText();
                Dir = this.txtDirCli1.getText();
                Tel = this.txtTelCli1.getText();

                unCliente.setIdClie(num);
                unCliente.setNombreEmpresaClie(NomEmp);
                unCliente.setNombreFantasiaClie(NomFan);
                unCliente.setPaisClie(Pais);
                unCliente.setDireccionClie(Dir);
                unCliente.setContactoClie(Tel);
                dEmpresa.modificarCliente(unCliente);
                ReiniciarControles();
                JOptionPane.showMessageDialog(this, "Se ha modificado correctamente", "Tipo", JOptionPane.INFORMATION_MESSAGE);

            } catch (cDatosException e) {
                JOptionPane.showMessageDialog(this, e.toString(), "Tipo", JOptionPane.ERROR_MESSAGE);
            }

        } else {
            JOptionPane.showMessageDialog(this, "Datos ingresados incorrectamente", "Accion", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void txtNomFanCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomFanCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomFanCliActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.txtIdCli1.setEditable(false);
        ReiniciarControles();
    }//GEN-LAST:event_formWindowOpened

    private void txtNomFanCli1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomFanCli1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomFanCli1ActionPerformed

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
            java.util.logging.Logger.getLogger(vCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vCliente().setVisible(true);
            }
        });
    }

    private void ReiniciarControles() {
        this.LimpiarCampos();
        this.LimpiarList();
        this.CargarDatosList();
    }

    public void LimpiarList() {
        DefaultTableModel dm = (DefaultTableModel) this.tblEliCli.getModel();
        dm.setRowCount(0);
        this.tblEliCli.setModel(dm);//limpia el jtable
    }

    public void CargarDatosList() {
        ArrayList<cliente> coleccion = new ArrayList<cliente>();
        try {
            coleccion = dEmpresa.buscarTodosClientes();
            ListaClientes = coleccion;
            Iterator<cliente> it = coleccion.iterator();
            while (it.hasNext()) {
                cliente unCliente = it.next();
                DefaultTableModel tm = (DefaultTableModel) tblEliCli.getModel();
                tm.addRow(new Object[]{new Integer(unCliente.getIdClie()),
                    new String(unCliente.getNombreEmpresaClie()),
                    new String(unCliente.getNombreFantasiaClie()),
                    new String(unCliente.getPaisClie()),
                    new String(unCliente.getDireccionClie()),
                    new String(unCliente.getContactoClie()),});
                tblEliCli.setModel(tm);
            }
        } catch (Common.cDatosException e) {
            JOptionPane.showMessageDialog(this, e.toString(), "Tipo", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void LimpiarCampos() {
        this.txtIdCli.setText("");
        this.txtNomFanCli.setText("");
        this.txtPaisCli.setText("");
        this.txtDirCli.setText("");
        this.txtTelCli.setText("");
        this.txtNomEmpCli1.setText("");
        this.txtIdCli1.setText("");
        this.txtNomFanCli1.setText("");
        this.txtPaisCli1.setText("");
        this.txtDirCli1.setText("");
        this.txtTelCli1.setText("");
        this.txtNomEmpCli.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTable tblEliCli;
    private javax.swing.JTextField txtDirCli;
    private javax.swing.JTextField txtDirCli1;
    private javax.swing.JTextField txtIdCli;
    private javax.swing.JTextField txtIdCli1;
    private javax.swing.JTextField txtNomEmpCli;
    private javax.swing.JTextField txtNomEmpCli1;
    private javax.swing.JTextField txtNomFanCli;
    private javax.swing.JTextField txtNomFanCli1;
    private javax.swing.JTextField txtPaisCli;
    private javax.swing.JTextField txtPaisCli1;
    private javax.swing.JTextField txtTelCli;
    private javax.swing.JTextField txtTelCli1;
    // End of variables declaration//GEN-END:variables
}
