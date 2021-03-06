/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfase;

import Common.Utilidades;
import Common.componente;
import Common.proveedor;
import Common.proveedorcomponente;
import Dominio.dEmpresa;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class vProveedorComponente extends javax.swing.JFrame {

    private ArrayList<proveedorcomponente> ListaProvComp = new ArrayList<proveedorcomponente>();

    /**
     * Creates new form vProveedorComponente
     */
    public vProveedorComponente() {
        initComponents();
    }

    private dEmpresa dEmpresa;

    public vProveedorComponente(dEmpresa pEmp) {
        initComponents();
        dEmpresa = pEmp;
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
        btnAgregar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jcbProv = new javax.swing.JComboBox<>();
        jcbComp = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        btnEliminar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtIdProvEli = new javax.swing.JTextField();
        txtIdComEli = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblEliProvCom = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jLabel1.setText("Id Proveedor:");

        jLabel5.setText("Id Componente:");

        jcbProv.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jcbComp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(70, 70, 70)
                        .addComponent(jcbComp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(80, 80, 80)
                        .addComponent(jcbProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAgregar)
                .addGap(105, 105, 105))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jcbProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jcbComp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAgregar)
                .addContainerGap(410, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Agregar", jPanel1);

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jLabel2.setText("Id Proveedor:");

        jLabel4.setText("Id Componente");

        txtIdProvEli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdProvEliActionPerformed(evt);
            }
        });

        tblEliProvCom.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Proveedor", "Id Componente"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblEliProvCom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEliProvComMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblEliProvCom);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnEliminar)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtIdComEli, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
                            .addComponent(txtIdProvEli))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtIdProvEli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtIdComEli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnEliminar)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(185, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Modificar/Eliminar", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        proveedorcomponente unProvComp;
        componente unCom;
        proveedor unProv;

        try {
            unCom= new componente();
            unProv=new proveedor();
            unProvComp = new proveedorcomponente();
            
            unCom = (componente) this.jcbComp.getSelectedItem();
            unProv = (proveedor) this.jcbProv.getSelectedItem();
                        
            unProvComp.setIdComponenteProveedorComponente(unCom);
            unProvComp.setIdProveedorProveedorComponente(unProv);
            if (dEmpresa.buscarProveedorComponente(unProvComp)!=null) {
                dEmpresa.agregarProveedorComponente(unProvComp);
                JOptionPane.showMessageDialog(this, "Se dado de alta correctamente", "Proveedor-Componente", JOptionPane.INFORMATION_MESSAGE);
                ReiniciarControles();
            } else {
                JOptionPane.showMessageDialog(this, "Combinacion existente", "Proveedor-Componente", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (Common.cDatosException e) {
            JOptionPane.showMessageDialog(this, e.toString(), "Proveedor", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void tblEliProvComMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEliProvComMouseClicked
        int fila = this.tblEliProvCom.getSelectedRow();

        if (fila >= 0) {
            DefaultTableModel tm = (DefaultTableModel) this.tblEliProvCom.getModel();
            int numFilas = tm.getRowCount();
            if ((fila < numFilas) && (fila >= 0)) {

                // tomo los datos de los clientes existentes
                String prov = String.valueOf(tm.getValueAt(fila, 0));
                String comp = String.valueOf(tm.getValueAt(fila, 1));

                this.txtIdProvEli.setText(prov);
                this.txtIdComEli.setText(comp);

            }
        }
    }//GEN-LAST:event_tblEliProvComMouseClicked

    private void txtIdProvEliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdProvEliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdProvEliActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        proveedorcomponente unProvComp = new proveedorcomponente();
        componente unCom = new componente();
        proveedor unProv = new proveedor();
        try {
            unCom.setIdComp(Integer.parseInt(this.txtIdComEli.getText()));
            unProvComp.setIdComponenteProveedorComponente(unCom);
            
            unProv.setIdProveedor(Integer.parseInt(this.txtIdProvEli.getText()));
            unProvComp.setIdProveedorProveedorComponente(unProv);

            dEmpresa.eliminarProveedorComponente(unProvComp);
            JOptionPane.showMessageDialog(this, "Se dado eliminado correctamente", "Proveedor-Componente", JOptionPane.INFORMATION_MESSAGE);
            ReiniciarControles();

        } catch (Common.cDatosException e) {
            JOptionPane.showMessageDialog(this, e.toString(), "Proveedor-Componente", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.txtIdComEli.setEditable(false);
        this.txtIdProvEli.setEditable(false);
        ReiniciarControles();
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(vProveedorComponente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vProveedorComponente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vProveedorComponente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vProveedorComponente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vProveedorComponente().setVisible(true);
            }
        });
    }

    private void ReiniciarControles() {
        this.LimpiarCampos();
        this.LimpiarList();
        this.CargarDatosList();
        this.CargarComboProveedor();
        this.CargarComboComponente();
    }

    public void LimpiarList() {
        DefaultTableModel dm = (DefaultTableModel) this.tblEliProvCom.getModel();
        dm.setRowCount(0);
        this.tblEliProvCom.setModel(dm);//limpia el jtable
    }

    public void CargarDatosList() {
        ArrayList<proveedorcomponente> coleccion = new ArrayList<proveedorcomponente>();
        try {
            coleccion = dEmpresa.buscarTodosProveedoresComponentesSinEliminados();
            ListaProvComp = coleccion;

            Iterator<proveedorcomponente> it = coleccion.iterator();
            while (it.hasNext()) {
                proveedorcomponente unProvComp = it.next();
                DefaultTableModel tm = (DefaultTableModel) tblEliProvCom.getModel();
                tm.addRow(new Object[]{new Integer(unProvComp.getIdProveedorProveedorComponente().getIdProveedor()),
                    new Integer(unProvComp.getIdComponenteProveedorComponente().getIdComp())});
                tblEliProvCom.setModel(tm);
            }
        } catch (Common.cDatosException e) {
            JOptionPane.showMessageDialog(this, e.toString(), "Proveedro Componente", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void LimpiarCampos() {
        this.txtIdComEli.setText("");
        this.txtIdProvEli.setText("");
    }

    public void CargarComboComponente() {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        jcbComp.setModel(modelo);
        this.jcbComp.removeAllItems();
        ArrayList<componente> coleccion = new ArrayList<componente>();
        try {
            coleccion = dEmpresa.buscarTodosComponentesSinEliminados();
            for (componente com : coleccion) {
                modelo.addElement(com);
            }
        } catch (Common.cDatosException e) {
            JOptionPane.showMessageDialog(this, e.toString(), "Componente", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void CargarComboProveedor() {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        jcbProv.setModel(modelo);
        this.jcbProv.removeAllItems();
        ArrayList<proveedor> coleccion = new ArrayList<proveedor>();
        try {
            coleccion = dEmpresa.buscarTodosProveedorSinEliminados();
            for (proveedor prov : coleccion) {
                modelo.addElement(prov);
            }
        } catch (Common.cDatosException e) {
            JOptionPane.showMessageDialog(this, e.toString(), "Proveedor", JOptionPane.ERROR_MESSAGE);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JComboBox<String> jcbComp;
    private javax.swing.JComboBox<String> jcbProv;
    private javax.swing.JTable tblEliProvCom;
    private javax.swing.JTextField txtIdComEli;
    private javax.swing.JTextField txtIdProvEli;
    // End of variables declaration//GEN-END:variables
}
