/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfase;

import Dominio.dEmpresa;

/**
 *
 * @author ezio
 */
public class vPrincipal extends javax.swing.JFrame {

    private dEmpresa empresa;
    private observer obser;
    /**
     * Creates new form vPrincipal
     */
    public vPrincipal() {
        initComponents();
    }
   
     public vPrincipal(dEmpresa pEmp, observer pObs) {
        empresa = pEmp;
        obser=pObs;
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

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        Cliente = new javax.swing.JMenuItem();
        jmComponente = new javax.swing.JMenuItem();
        jmMotor = new javax.swing.JMenuItem();
        jmMotorComponente = new javax.swing.JMenuItem();
        jmProveedor = new javax.swing.JMenuItem();
        jmFactura = new javax.swing.JMenuItem();
        jmPedido = new javax.swing.JMenuItem();
        jmProveedorCompnente = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenu1.setText("jMenu1");

        jMenu2.setText("File");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Edit");
        jMenuBar1.add(jMenu3);

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fileMenu.setMnemonic('f');
        fileMenu.setText("ABM");

        Cliente.setText("Cliente");
        Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClienteActionPerformed(evt);
            }
        });
        fileMenu.add(Cliente);

        jmComponente.setText("Componente");
        jmComponente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmComponenteActionPerformed(evt);
            }
        });
        fileMenu.add(jmComponente);

        jmMotor.setText("Motor");
        jmMotor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmMotorActionPerformed(evt);
            }
        });
        fileMenu.add(jmMotor);

        jmMotorComponente.setText("MotorComponente");
        jmMotorComponente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmMotorComponenteActionPerformed(evt);
            }
        });
        fileMenu.add(jmMotorComponente);

        jmProveedor.setText("Proveedor");
        jmProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmProveedorActionPerformed(evt);
            }
        });
        fileMenu.add(jmProveedor);

        jmFactura.setText("Factura");
        jmFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmFacturaActionPerformed(evt);
            }
        });
        fileMenu.add(jmFactura);

        jmPedido.setText("Pedido");
        jmPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmPedidoActionPerformed(evt);
            }
        });
        fileMenu.add(jmPedido);

        jmProveedorCompnente.setText("Proveedor Componente");
        jmProveedorCompnente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmProveedorCompnenteActionPerformed(evt);
            }
        });
        fileMenu.add(jmProveedorCompnente);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Salir");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void jmComponenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmComponenteActionPerformed
        vComponente ventanaComponente = new vComponente(empresa);
        //centra la ventana en la pantalla
        ventanaComponente.setLocationRelativeTo(null);
        ventanaComponente.setVisible(true);
    }//GEN-LAST:event_jmComponenteActionPerformed

    private void jmFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmFacturaActionPerformed
        vFactura ventanaFactura = new vFactura(empresa);
        //centra la ventana en la pantalla
        ventanaFactura.setLocationRelativeTo(null);
        ventanaFactura.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jmFacturaActionPerformed

    private void jmMotorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmMotorActionPerformed
         vMotor ventanaMotor = new vMotor(empresa);
        //centra la ventana en la pantalla
        ventanaMotor.setLocationRelativeTo(null);
        ventanaMotor.setVisible(true);
    }//GEN-LAST:event_jmMotorActionPerformed

    private void jmMotorComponenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmMotorComponenteActionPerformed
       vMotorComponente ventanaMotorComponente = new vMotorComponente(empresa);
        //centra la ventana en la pantalla
        ventanaMotorComponente.setLocationRelativeTo(null);
        ventanaMotorComponente.setVisible(true);
    }//GEN-LAST:event_jmMotorComponenteActionPerformed

    private void jmPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmPedidoActionPerformed
        vPedido ventnaPedido = new vPedido(empresa, obser);
        //centra la ventana en la pantalla
        ventnaPedido.setLocationRelativeTo(null);
        ventnaPedido.setVisible(true);
    }//GEN-LAST:event_jmPedidoActionPerformed

    private void jmProveedorCompnenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmProveedorCompnenteActionPerformed
        vProveedorComponente ventnaProveedorComponente = new vProveedorComponente(empresa);
        //centra la ventana en la pantalla
        ventnaProveedorComponente.setLocationRelativeTo(null);
        ventnaProveedorComponente.setVisible(true); 
    }//GEN-LAST:event_jmProveedorCompnenteActionPerformed

    private void ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClienteActionPerformed
        vCliente ventanaCliente = new vCliente(empresa);
        //centra la ventana en la pantalla
        ventanaCliente.setLocationRelativeTo(null);
        ventanaCliente.setVisible(true);    }//GEN-LAST:event_ClienteActionPerformed

    private void jmProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmProveedorActionPerformed
        vProveedor ventnaProveedor = new vProveedor(empresa);
        //centra la ventana en la pantalla
        ventnaProveedor.setLocationRelativeTo(null);
        ventnaProveedor.setVisible(true);
    }//GEN-LAST:event_jmProveedorActionPerformed

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
            java.util.logging.Logger.getLogger(vPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vPrincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Cliente;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jmComponente;
    private javax.swing.JMenuItem jmFactura;
    private javax.swing.JMenuItem jmMotor;
    private javax.swing.JMenuItem jmMotorComponente;
    private javax.swing.JMenuItem jmPedido;
    private javax.swing.JMenuItem jmProveedor;
    private javax.swing.JMenuItem jmProveedorCompnente;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables
}
