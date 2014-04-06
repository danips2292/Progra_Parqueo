/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;
import javax.swing.JOptionPane;
import progra.parqueo.*;

/**
 *
 * @author Gato
 */
public class VentanaFactura extends javax.swing.JFrame {
    
    /**
     * Creates new form VentanaFactura
     */
    public VentanaFactura() {
        initComponents();
        lblCedulaJuridica.setText(Parqueo.getInstance().getFactura().getCedulaJuridicaCompleto());
        lblDireccion.setText(Parqueo.getInstance().getFactura().getDireccionCompleto());
        lblFecha.setText(Parqueo.getInstance().getFactura().getFechaComplato());
        lblHorario.setText(Parqueo.getInstance().getFactura().getHorario());
        String n=String.valueOf(Parqueo.getInstance().getFactura().getNumFactura());
        lblNumFactura.setText(n);
        lblTelefono.setText(Parqueo.getInstance().getFactura().getMsjTelefono());
        lblTitulo.setText(Parqueo.getInstance().getFactura().getTitulo());
        String x= String.valueOf(Parqueo.getInstance().getUserCaja().calcularTarifa(Parqueo.getInstance().getVehiculo().getTiempoEstacionado()));
        lblTotalNum.setText(x);
        int y=Integer.parseInt(txtPagacon.getText());
        Parqueo.getInstance().getUserCaja().setPagoCliente(y);
        String w=String.valueOf(Parqueo.getInstance().getUserCaja().calcularTarifa(Parqueo.getInstance().getVehiculo().getTiempoEstacionado())-y);
        JOptionPane.showMessageDialog(null,"Su vuelto es de:"+w+",gracias por su visita");
        Factura factura= new Factura(Parqueo.getInstance().getFactura().getNumFactura(),Parqueo.getInstance().getFactura().getTitulo(),Parqueo.getInstance().getFactura().getSlogan(),Parqueo.getInstance().getFactura().getNumTelefono(),Parqueo.getInstance().getFactura().getCedulaJuridica(),Parqueo.getInstance().getFactura().getDireccion(),Parqueo.getInstance().getFactura().getHorario());
        Parqueo.getInstance().setHistorialFacturas(factura);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblHorario = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        lblCedulaJuridica = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        lblNumFactura = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        lblTotalNum = new javax.swing.JLabel();
        lblPagacon = new javax.swing.JLabel();
        txtPagacon = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setText("Parqueo LiCaSa");

        lblHorario.setText("Abierto de 7 a.m. a 7 p.m.");

        lblTelefono.setText("Tel: 86667777");

        lblCedulaJuridica.setText("Cédula Jurídica: 1-6942-8181");

        lblDireccion.setText("Dirección: Del mercado 100 metros norte,Cartago ");

        lblFecha.setText("Fecha: 31/02/2014");

        lblNumFactura.setText("Número Factura: 0000001");

        lblTotal.setText("Total:");

        lblTotalNum.setText("60000");

        lblPagacon.setText("Paga con:");

        txtPagacon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPagaconActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTitulo)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFecha)
                            .addComponent(lblDireccion)
                            .addComponent(lblCedulaJuridica)
                            .addComponent(lblHorario))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblTelefono)
                            .addComponent(lblNumFactura)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPagacon)
                                .addGap(18, 18, 18)
                                .addComponent(txtPagacon)))
                        .addGap(152, 152, 152))))
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(lblTotal)
                .addGap(56, 56, 56)
                .addComponent(lblTotalNum)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblTitulo)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHorario)
                    .addComponent(lblTelefono))
                .addGap(31, 31, 31)
                .addComponent(lblCedulaJuridica)
                .addGap(27, 27, 27)
                .addComponent(lblDireccion)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFecha)
                    .addComponent(lblNumFactura))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTotal)
                    .addComponent(lblTotalNum)
                    .addComponent(lblPagacon)
                    .addComponent(txtPagacon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPagaconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPagaconActionPerformed
        
    }//GEN-LAST:event_txtPagaconActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaFactura().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblCedulaJuridica;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblHorario;
    private javax.swing.JLabel lblNumFactura;
    private javax.swing.JLabel lblPagacon;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblTotalNum;
    private javax.swing.JTextField txtPagacon;
    // End of variables declaration//GEN-END:variables
}
