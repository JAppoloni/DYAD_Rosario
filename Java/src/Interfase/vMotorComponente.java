/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfase;

import Common.componente;
import Common.motorcomponente;
import Common.motores;
import static Main.main.empresa;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Common.cDatosException;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class vMotorComponente extends javax.swing.JFrame {

    private int idMot=-1;
    private int idComp=-1;
    private int idMotMC=-1;
    private int idCompMC=-1;
    private ArrayList<motores> ListaMotores = new ArrayList<motores>();
    private ArrayList<componente> ListaComponente = new ArrayList<componente>();
    private ArrayList<motorcomponente> ListaMotorComponente = new ArrayList<motorcomponente>();

    /**
     * Creates new form vMotorComponente
     */
    public vMotorComponente() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblComponente = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMotorComponente = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblMotores = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        tblComponente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Descripcion", "Stock"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblComponente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblComponenteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblComponente);

        tblMotorComponente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Motor", "Id Componente"
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
        tblMotorComponente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMotorComponenteMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblMotorComponente);

        tblMotores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblMotores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMotoresMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblMotores);

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnAgregar.setText("<");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(btnAgregar)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
            .addGroup(layout.createSequentialGroup()
                .addGap(213, 213, 213)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEliminar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAgregar)
                        .addGap(106, 106, 106)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.CargarDatosComponente();
        this.CargarDatosMotor();
        this.CargarDatosMotorComponente();
    }//GEN-LAST:event_formWindowOpened

    private void tblMotoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMotoresMouseClicked
        int fila = this.tblMotores.getSelectedRow();

        if (fila >= 0) {
            DefaultTableModel tm = (DefaultTableModel) this.tblMotores.getModel();
            int numFilas = tm.getRowCount();
            if ((fila < numFilas) && (fila >= 0)) {

                // tomo los datos de los clientes existentes
                idMot = (int) tm.getValueAt(fila, 0);
            }
        }    }//GEN-LAST:event_tblMotoresMouseClicked

    private void tblComponenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblComponenteMouseClicked
        int fila = this.tblComponente.getSelectedRow();

        if (fila >= 0) {
            DefaultTableModel tm = (DefaultTableModel) this.tblComponente.getModel();
            int numFilas = tm.getRowCount();
            if ((fila < numFilas) && (fila >= 0)) {

                // tomo los datos de los clientes existentes
                idComp = (int) tm.getValueAt(fila, 0);
            }
        }
    }//GEN-LAST:event_tblComponenteMouseClicked

    private void tblMotorComponenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMotorComponenteMouseClicked
 int fila = this.tblMotorComponente.getSelectedRow();

        if (fila >= 0) {
            DefaultTableModel tm = (DefaultTableModel) this.tblMotorComponente.getModel();
            int numFilas = tm.getRowCount();
            if ((fila < numFilas) && (fila >= 0)) {

                // tomo los datos de los clientes existentes
                idMotMC = (int) tm.getValueAt(fila, 0);
                idCompMC = (int) tm.getValueAt(fila, 1);
            }
        }    }//GEN-LAST:event_tblMotorComponenteMouseClicked

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
            java.util.logging.Logger.getLogger(vMotorComponente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vMotorComponente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vMotorComponente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vMotorComponente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vMotorComponente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblComponente;
    private javax.swing.JTable tblMotorComponente;
    private javax.swing.JTable tblMotores;
    // End of variables declaration//GEN-END:variables

    public void CargarDatosMotor() {
        ArrayList<motores> coleccion = new ArrayList<motores>();
        try {
            coleccion = empresa.buscarTodosMotores();
            ListaMotores = coleccion;
            Iterator<motores> it = coleccion.iterator();
            while (it.hasNext()) {
                motores unMotor = it.next();
                DefaultTableModel tm = (DefaultTableModel) tblMotores.getModel();
                tm.addRow(new Object[]{new Integer(unMotor.getIdMotor()), new String(unMotor.getNombreMotor())});
                tblMotores.setModel(tm);
            }
        } catch (Common.cDatosException e) {
            JOptionPane.showMessageDialog(this, e.toString(), "Motor Componente", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void CargarDatosComponente() {
        ArrayList<componente> coleccion = new ArrayList<componente>();
        try {
            coleccion = empresa.buscarTodosComponente();
            ListaComponente = coleccion;
            Iterator<componente> it = coleccion.iterator();
            while (it.hasNext()) {
                componente unComponente = it.next();
                DefaultTableModel tm = (DefaultTableModel) tblComponente.getModel();
                tm.addRow(new Object[]{new Integer(unComponente.getIdComp()), new String(unComponente.getDescripcionComp()), new Integer(unComponente.getCantStockComp())});
                tblMotores.setModel(tm);
            }
        } catch (Common.cDatosException e) {
            JOptionPane.showMessageDialog(this, e.toString(), "Motor Componente", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void CargarDatosMotorComponente() {
        ArrayList<motorcomponente> coleccion = new ArrayList<motorcomponente>();
        try {
            coleccion = empresa.buscarTodosMotoresComponentes();
            ListaMotorComponente = coleccion;
            Iterator<motorcomponente> it = coleccion.iterator();
            while (it.hasNext()) {
                motorcomponente unMotorComponente = it.next();
                DefaultTableModel tm = (DefaultTableModel) tblComponente.getModel();
                tm.addRow(new Object[]{new Integer(unMotorComponente.getIdMotorMotorComponente()), new Integer(unMotorComponente.getIdComponenteMotorComponente())});
                tblMotores.setModel(tm);
            }
        } catch (Common.cDatosException e) {
            JOptionPane.showMessageDialog(this, e.toString(), "Motor Componente", JOptionPane.ERROR_MESSAGE);
        }
    }

}
