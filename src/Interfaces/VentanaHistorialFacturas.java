
package Interfaces;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import progra.parqueo.*;


public class VentanaHistorialFacturas extends javax.swing.JFrame {
    private static VentanaHistorialFacturas VentanaHistorial;
    
    
     

    public VentanaHistorialFacturas() {
        
        initComponents();
        this.setSize(1378, 766);
        this.setVisible(rootPaneCheckingEnabled);
        
        /*if(Parqueo.getInstance().getHistorialFacturas()[Parqueo.getInstance().getI()]!= null){
        String cedJuridica = "Cedula Juridica: "+Parqueo.getInstance().getHistorialFacturas()[Parqueo.getInstance().getI()].getCedulaJuridica();
        String direccion = "Direccion: "+Parqueo.getInstance().getHistorialFacturas()[Parqueo.getInstance().getI()].getDireccion();
        String fecha="Fecha: "+Parqueo.getInstance().getHistorialFacturas()[Parqueo.getInstance().getI()].getFechaComplato();
        String horario="Horario: "+Parqueo.getInstance().getHistorialFacturas()[Parqueo.getInstance().getI()].getHorario();
        String numeroFact=String.valueOf(Parqueo.getInstance().getHistorialFacturas()[Parqueo.getInstance().getI()].getNumFactura());
        String numfactur="Numero de factura: "+numeroFact;
        String telefono="Telefono: "+Parqueo.getInstance().getHistorialFacturas()[Parqueo.getInstance().getI()].getNumTelefono();
        String titulo="Titulo: "+Parqueo.getInstance().getHistorialFacturas()[Parqueo.getInstance().getI()].getTitulo();
        String cobro= String.valueOf(Parqueo.getInstance().getHistorialFacturas()[Parqueo.getInstance().getI()].getCobro());
        String cobroPlata=cobro;
        this.setVentana(cedJuridica, direccion, horario, numfactur, telefono, titulo, cobroPlata);
        lblFecha.setText("Fecha: "+Parqueo.getInstance().getHistorialFacturas()[Parqueo.getInstance().getI()].getFechaComplato());
        }*/
        
        
    }
    public static VentanaHistorialFacturas getInstance(){
        if(VentanaHistorial == null)
            VentanaHistorial = new VentanaHistorialFacturas();
        return VentanaHistorial;

    }
   
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
        btnVolver = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setText("Parqueo ");

        lblHorario.setText("Abierto ");

        lblTelefono.setText("Tel: ");

        lblCedulaJuridica.setText("Cédula Jurídica: ");

        lblDireccion.setText("Dirección: ");

        lblFecha.setText("Fecha: ");

        lblNumFactura.setText("Número Factura:");

        lblTotal.setText("Total:");

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        btnSiguiente.setText("Siguiente");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitulo)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFecha)
                            .addComponent(lblDireccion)
                            .addComponent(lblCedulaJuridica)
                            .addComponent(lblHorario))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNumFactura)
                            .addComponent(lblTelefono))
                        .addGap(217, 217, 217))))
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(lblTotal)
                .addGap(56, 56, 56)
                .addComponent(lblTotalNum)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSiguiente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVolver)
                .addGap(152, 152, 152))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTotal)
                    .addComponent(lblTotalNum)
                    .addComponent(btnVolver)
                    .addComponent(btnSiguiente))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // TODO add your handling code here:
        this.hide();
        menu.getInstance().show(true);
        
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        // TODO add your handling code here:
        
        //while(factura[i]!=null){
        
        
        System.out.println("I: "+Parqueo.getInstance().getI());
        int i = Parqueo.getInstance().getI();
        while(i<Parqueo.getInstance().getHistorialFacturas().length)   
        {
            if (Parqueo.getInstance().getHistorialFacturas()[i]!= null)
                break;
            else
            {
             
               i++;
            }
        }
        String cedJuridica = "Cedula Juridica: "+Parqueo.getInstance().getHistorialFacturas()[i].getCedulaJuridica();
        String direccion = "Direccion: "+Parqueo.getInstance().getHistorialFacturas()[i].getDireccion();
        String fecha="Fecha: "+Parqueo.getInstance().getHistorialFacturas()[i].getFechaComplato();
        String horario="Horario: "+Parqueo.getInstance().getHistorialFacturas()[i].getHorario();
        String numeroFact=String.valueOf(i);
        String numfactur="Numero de factura: "+numeroFact;
        String telefono="Telefono: "+Parqueo.getInstance().getHistorialFacturas()[i].getNumTelefono();
        String titulo="Titulo: "+Parqueo.getInstance().getHistorialFacturas()[i].getTitulo();
        String cobro= String.valueOf(Parqueo.getInstance().getHistorialFacturas()[i].getCobro());
        String cobroPlata=cobro;
        Parqueo.getInstance().setI(Parqueo.getInstance().getI()+1);
        this.setVentana(cedJuridica, direccion, horario, numfactur, telefono, titulo, cobroPlata);
        this.repaint();
        //VentanaHistorialFacturas.getInstance().show(true);
       // this.show(false);
        //}
        
    }//GEN-LAST:event_btnSiguienteActionPerformed
    private void setVentana(String pCedJuridica,String pDireccion,String pHorario,String pNumFact,
                            String pTelefono,String pTitulo,String pTotalNum)
    {
        lblCedulaJuridica.setText(pCedJuridica);
        lblDireccion.setText(pDireccion);
        lblHorario.setText(pHorario);
        lblNumFactura.setText(pNumFact);
        lblTelefono.setText(pTelefono);
        lblTitulo.setText(pTitulo);
        lblTotalNum.setText(pTotalNum);
    }
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
                new VentanaHistorialFacturas().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel lblCedulaJuridica;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblHorario;
    private javax.swing.JLabel lblNumFactura;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblTotalNum;
    // End of variables declaration//GEN-END:variables
}
