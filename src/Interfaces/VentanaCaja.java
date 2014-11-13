package Interfaces;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import progra.parqueo.*;
import Interfaces.*;

public class VentanaCaja extends javax.swing.JFrame {
    private static VentanaCaja VenCaja;
    private String contrasena2;
    private String montoAgregar;
    private String montoRetirar;
    public VentanaCaja() {
        Reloj.getInstance().setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Reloj.getInstance().setFont(new java.awt.Font("Arial",1,18));
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setBounds(0,0,200,100);
        this.getContentPane().add(Reloj.getInstance());
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        DateFormat df = new SimpleDateFormat("HHmm");//si se pone : o espacio falla pues no es lo q espera el programa
        Date today= Calendar.getInstance().getTime();
        String reportDate = df.format(today);
        int horaActual = Integer.valueOf(reportDate);//hora actual ya es un int
        initComponents();
    }
    
    public static VentanaCaja getInstance(){
        if(VenCaja == null)
            VenCaja = new VentanaCaja();
        return VenCaja;

    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbAgregarDinero = new javax.swing.JButton();
        jbRetirarDinero = new javax.swing.JButton();
        jbVerDinero = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jbAgregarDinero.setText("Agregar Dinero");
        jbAgregarDinero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarDineroActionPerformed(evt);
            }
        });

        jbRetirarDinero.setText("Retirar Dinero");
        jbRetirarDinero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRetirarDineroActionPerformed(evt);
            }
        });

        jbVerDinero.setText("Ver Dinero");
        jbVerDinero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVerDineroActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbAgregarDinero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbRetirarDinero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbVerDinero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(153, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jbAgregarDinero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbRetirarDinero)
                .addGap(18, 18, 18)
                .addComponent(jbVerDinero)
                .addGap(18, 18, 18)
                .addComponent(jbSalir)
                .addContainerGap(130, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbAgregarDineroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarDineroActionPerformed
        // TODO add your handling code here:
        contrasena2=JOptionPane.showInputDialog("Digite la contrasena de Usuario: ");
        
        Parqueo.getInstance().setContrasenaEncriptada(contrasena2);
        //
        if(Parqueo.getInstance().getUserCaja().getContrasena().equals(Parqueo.getInstance().getContrasena())){
            JOptionPane.showMessageDialog(rootPane,"Contrasena correcta.");
            montoAgregar=JOptionPane.showInputDialog("Ingrese el monto a agregar: ");
            int monto2 = Integer.parseInt(montoAgregar);
            Parqueo.getInstance().getUserCaja().setDineroAgregado(monto2);
            Parqueo.getInstance().getUserCaja().agregarDinero( monto2);
            
            
        }
        else{
           JOptionPane.showMessageDialog(rootPane,"Contrasena incorrecta.");
        }
    }//GEN-LAST:event_jbAgregarDineroActionPerformed

    private void jbRetirarDineroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRetirarDineroActionPerformed
        // TODO add your handling code here:
        contrasena2=JOptionPane.showInputDialog("Digite la contrasena de Usuario: ");
        Parqueo.getInstance().setContrasenaEncriptada(contrasena2);
        if(Parqueo.getInstance().getUserCaja().getContrasena().equals(Parqueo.getInstance().getContrasena())){
            JOptionPane.showMessageDialog(rootPane,"Contrasena correcta.");
            montoRetirar=JOptionPane.showInputDialog("Ingrese el monto a retirar: ");
            int monto3 = Integer.parseInt(montoRetirar);
            Parqueo.getInstance().getUserCaja().setDineroRetirado(monto3);
            Parqueo.getInstance().getUserCaja().retirarDinero( monto3);
            
            
        }
        else{
            JOptionPane.showMessageDialog(rootPane,"Contrasena incorrecta.");
        }
    }//GEN-LAST:event_jbRetirarDineroActionPerformed

    private void jbVerDineroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVerDineroActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(rootPane,"$"+ Parqueo.getInstance().getUserCaja().getDineroCaja());
    }//GEN-LAST:event_jbVerDineroActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        // TODO add your handling code here:
        //venMenu.setVisible(true);
        //this.dispose();
        menu.getInstance().show(true);
        
          
    }//GEN-LAST:event_jbSalirActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaCaja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaCaja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaCaja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaCaja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaCaja().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbAgregarDinero;
    private javax.swing.JButton jbRetirarDinero;
    private javax.swing.JButton jbSalir;
    private javax.swing.JButton jbVerDinero;
    // End of variables declaration//GEN-END:variables
}
