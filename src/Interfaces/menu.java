/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;
import progra.parqueo.Parqueo;
import Interfaces.*;
import java.awt.Color;
import java.awt.Container;
import javax.swing.*;
/**
 *
 * @author dani
 */
public class menu extends javax.swing.JFrame {


    /**
     * Creates new form menu
     */
    private Principal vPrincipal;
    private static menu VentanaMenu;
    //private VentanaEstadoParqueo estadoParqueo = new VentanaEstadoParqueo();

    public menu() {
        
        this.setSize(1378, 766);
        this.setVisible(rootPaneCheckingEnabled);
        initComponents();
    }
    public menu(Principal pPrincipal)
    {
        vPrincipal = pPrincipal;
        this.setSize(1378, 766);
        this.setVisible(rootPaneCheckingEnabled);
        initComponents();
    }
    
      public static menu getInstance(){
        if(VentanaMenu == null)
            VentanaMenu = new menu();
        return VentanaMenu;

    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbMeterCarro = new javax.swing.JButton();
        jbSacarCarro = new javax.swing.JButton();
        jbEntrarCaja = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jbVerParqueo = new javax.swing.JButton();
        jbConfigurar = new javax.swing.JButton();
        btnHistorialFac = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jbMeterCarro.setText("Meter Vehiculo");
        jbMeterCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMeterCarroActionPerformed(evt);
            }
        });

        jbSacarCarro.setText("Sacar Vehiculo");
        jbSacarCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSacarCarroActionPerformed(evt);
            }
        });

        jbEntrarCaja.setText("Caja");
        jbEntrarCaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEntrarCajaActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jbVerParqueo.setText("Ver Parqueo");
        jbVerParqueo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVerParqueoActionPerformed(evt);
            }
        });

        jbConfigurar.setText("Configurar");
        jbConfigurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConfigurarActionPerformed(evt);
            }
        });

        btnHistorialFac.setText("Historial");
        btnHistorialFac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistorialFacActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jbEntrarCaja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbSacarCarro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbMeterCarro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbVerParqueo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbConfigurar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnHistorialFac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(739, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jbMeterCarro)
                .addGap(18, 18, 18)
                .addComponent(jbSacarCarro)
                .addGap(12, 12, 12)
                .addComponent(jbVerParqueo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbEntrarCaja)
                .addGap(18, 18, 18)
                .addComponent(jbConfigurar)
                .addGap(14, 14, 14)
                .addComponent(jbSalir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnHistorialFac)
                .addContainerGap(211, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
       // Container ventana = Parqueo.getInstance().getEstadoParqueo().getContentPane();
        Parqueo.getInstance().getEstadoParqueo().getComponentAt(400, 500).setBackground(Color.red);
        Parqueo.getInstance().getEstadoParqueo().repaint();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbMeterCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMeterCarroActionPerformed
        //Parqueo.getInstance().llenarEspacio();
        DetallesVehiculo vDetallesVehiculo = new DetallesVehiculo();
        vDetallesVehiculo.show();
    }//GEN-LAST:event_jbMeterCarroActionPerformed

    private void jbEntrarCajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEntrarCajaActionPerformed

        VentanaCaja.getInstance().show(true);
        //JOptionPane.showInputDialog("hola");
        this.setVisible(false);  
    }//GEN-LAST:event_jbEntrarCajaActionPerformed

    private void jbSacarCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSacarCarroActionPerformed
         Parqueo.getInstance().vaciarEspacio();
         
         VentanaFactura.getInstance().show(true);
         this.hide();
         
         //Parqueo.getInstance().getVentanaFactura().show();
         
         
    }//GEN-LAST:event_jbSacarCarroActionPerformed

    private void jbVerParqueoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVerParqueoActionPerformed
        Parqueo.getInstance().setAgregarBoton();
        Parqueo.getInstance().getEstadoParqueo().show();
    }//GEN-LAST:event_jbVerParqueoActionPerformed

    private void jbConfigurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConfigurarActionPerformed
        // TODO add your handling code here:
        VentanaConfiguracion.getInstance().setVisible(true);
    }//GEN-LAST:event_jbConfigurarActionPerformed

    private void btnHistorialFacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistorialFacActionPerformed
        // TODO add your handling code here:
        VentanaHistorialFacturas.getInstance().show(true);
        this.show(false);
    }//GEN-LAST:event_btnHistorialFacActionPerformed

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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHistorialFac;
    private javax.swing.JButton jbConfigurar;
    private javax.swing.JButton jbEntrarCaja;
    private javax.swing.JButton jbMeterCarro;
    private javax.swing.JButton jbSacarCarro;
    private javax.swing.JButton jbSalir;
    private javax.swing.JButton jbVerParqueo;
    // End of variables declaration//GEN-END:variables
}
