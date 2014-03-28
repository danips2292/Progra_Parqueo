
package Interfaces;
import java.awt.Dimension;
import javax.swing.JOptionPane;
import progra.parqueo.*;
import javax.swing.JOptionPane.*;

public class Principal extends javax.swing.JFrame {
  Parqueo userParqueo= new Parqueo(true,0,0,"",0,15);
  //Caja userCaja= new Caja(0,0,0,0,0,0,"hola",0,0);
  //Espacio userEspacio = new Espacio();*/
  menu Ventana_Menu = new menu();
    private String contrasena;
        
    public Principal() {
        initComponents();
        this.setVisible(rootPaneCheckingEnabled);
        this.setSize(1378, 766);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbAbrirParqueo = new javax.swing.JButton();
        jbCerrarParqueo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jbAbrirParqueo.setText("Abrir Parqueo");
        jbAbrirParqueo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAbrirParqueoActionPerformed(evt);
            }
        });

        jbCerrarParqueo.setText("Cerrar Parqueo");
        jbCerrarParqueo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCerrarParqueoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(441, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbCerrarParqueo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbAbrirParqueo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(445, 445, 445))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jbAbrirParqueo)
                .addGap(33, 33, 33)
                .addComponent(jbCerrarParqueo)
                .addContainerGap(373, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbAbrirParqueoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAbrirParqueoActionPerformed
        contrasena=JOptionPane.showInputDialog("Digite la contrasena de Usuario: ");
        if(userParqueo.getUserCaja().getContrasena().equals(contrasena)){
            JOptionPane.showMessageDialog(rootPane,"Contrasena correcta.");
            Ventana_Menu.setVisible(true);
            this.setVisible(false);
        }
        else{
            JOptionPane.showMessageDialog(rootPane,userParqueo.getUserCaja().getContrasena());
            JOptionPane.showMessageDialog(rootPane,"Contrasena incorrecta.");
        }
    }//GEN-LAST:event_jbAbrirParqueoActionPerformed

    private void jbCerrarParqueoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCerrarParqueoActionPerformed
        userParqueo.cerrarParqueo();
    }//GEN-LAST:event_jbCerrarParqueoActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbAbrirParqueo;
    private javax.swing.JButton jbCerrarParqueo;
    // End of variables declaration//GEN-END:variables
}
