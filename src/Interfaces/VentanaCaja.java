/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import progra.parqueo.*;
import Interfaces.*;

/**
 *
 * @author Gato
 */
public class VentanaCaja extends javax.swing.JFrame {
    Caja caja = new Caja(0,0,0,0,0,0,"hola",0,0);
    Parqueo userParqueo2 =new Parqueo(true,0,0,"",0,15);
    Reloj reloj=new Reloj(0, 0, 0, 0);
    Vehiculo vehiculo = new Vehiculo();
    private String contrasena2;
    private String montoAgregar;
    private String montoRetirar;
    public VentanaCaja() {
        reloj.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reloj.setFont(new java.awt.Font("Arial",1,18));
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setBounds(0,0,200,100);
        this.getContentPane().add(reloj);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        //se convierte en int la hora
        DateFormat df = new SimpleDateFormat("HHmm");//si se pone : o espacio falla pues no es lo q espera el programa
        //Date date = df.parse(String.valueOf(reloj));
        Date today= Calendar.getInstance().getTime();
        String reportDate = df.format(today);
        int horaActual = Integer.valueOf(reportDate);//hora actual ya es un int
        //JOptionPane.showInputDialog(output-30);
        //vehiculo.setHoraSalida(reloj);
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

        btnAgregarDinero = new javax.swing.JButton();
        btnRetirarDinero = new javax.swing.JButton();
        btnVerDinero = new javax.swing.JButton();
        btnCobrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAgregarDinero.setText("Agergar Dinero");
        btnAgregarDinero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarDineroActionPerformed(evt);
            }
        });

        btnRetirarDinero.setText("Retirar Dinero");
        btnRetirarDinero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetirarDineroActionPerformed(evt);
            }
        });

        btnVerDinero.setText("Ver Dinero");

        btnCobrar.setText("Cobrar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAgregarDinero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRetirarDinero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVerDinero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCobrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(139, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(btnAgregarDinero)
                .addGap(18, 18, 18)
                .addComponent(btnRetirarDinero)
                .addGap(18, 18, 18)
                .addComponent(btnVerDinero)
                .addGap(18, 18, 18)
                .addComponent(btnCobrar)
                .addContainerGap(128, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarDineroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarDineroActionPerformed
        contrasena2=JOptionPane.showInputDialog("Digite la contrasena de Usuario: ");
        if(userParqueo2.getUserCaja().getContrasena().equals(contrasena2)){
            JOptionPane.showMessageDialog(rootPane,"Contrasena correcta.");
            montoAgregar=JOptionPane.showInputDialog("Ingrese el monto a ingresar: ");
            int monto2 = Integer.parseInt(montoAgregar);
            caja.agregarDinero( monto2);
            //setCaja
            
        }
        else{
            JOptionPane.showMessageDialog(rootPane,userParqueo2.getUserCaja().getContrasena());
            JOptionPane.showMessageDialog(rootPane,"Contrasena incorrecta.");
        }
    }//GEN-LAST:event_btnAgregarDineroActionPerformed

    private void btnRetirarDineroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetirarDineroActionPerformed
        contrasena2=JOptionPane.showInputDialog("Digite la contrasena de Usuario: ");
        if(userParqueo2.getUserCaja().getContrasena().equals(contrasena2)){
            JOptionPane.showMessageDialog(rootPane,"Contrasena correcta.");
            montoRetirar=JOptionPane.showInputDialog("Ingrese el monto a retirar: ");
            int monto3 = Integer.parseInt(montoRetirar);
            caja.retirarDinero( monto3);
            
            //setCaja
        }
        else{
            JOptionPane.showMessageDialog(rootPane,userParqueo2.getUserCaja().getContrasena());
            JOptionPane.showMessageDialog(rootPane,"Contrasena incorrecta.");
        }
    }//GEN-LAST:event_btnRetirarDineroActionPerformed

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
    private javax.swing.JButton btnAgregarDinero;
    private javax.swing.JButton btnCobrar;
    private javax.swing.JButton btnRetirarDinero;
    private javax.swing.JButton btnVerDinero;
    // End of variables declaration//GEN-END:variables
}
