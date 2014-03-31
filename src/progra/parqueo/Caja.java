/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package progra.parqueo;

import javax.swing.JOptionPane;
import progra.parqueo.Parqueo;
import progra.parqueo.Espacio;
import progra.parqueo.Factura;
import progra.parqueo.Vehiculo;
import progra.parqueo.PrograParqueo;

/**
 *
 * @author Gato
 */
public class Caja {
    private int dineroCaja;
    private int pagoCliente;
    private int vuelto;
    private int dineroInicial;
    private int dineroAgregado;
    private int dineroRetirado;
    private String contrasenaUsuario;
    private String contrasenaCaja;
    private int minimoCaja;
    private int totalGanacia;
    private int tarifa;
    private int montoCobro;
    private int numFactura;
    //Parqueo usuario = new Parqueo(true, dineroCaja, dineroCaja, contrasena, vuelto);
    public Caja(int pTarifa,int pDineroCaja,int pPagoCliente,int pVuelto,int pDineroInicial,int pDineroAgregado,int pDineroRetirado,String pContrasenaCaja,int pMinimoCaja,int pTotalGanacias){
     dineroCaja = pDineroCaja;
     pagoCliente = pPagoCliente;
     vuelto = pVuelto;
     tarifa = pTarifa;
     dineroInicial = pDineroInicial;
     dineroAgregado = pDineroAgregado;
     dineroRetirado =pDineroRetirado;
     contrasenaCaja=pContrasenaCaja;
     minimoCaja=pMinimoCaja;
     totalGanacia=pTotalGanacias;
    }

    public int getTarifa() {
        return tarifa;
    }

    public void setTarifa(int pTarifa) {
        tarifa = pTarifa;
    }
    
    public void setMinimoCaja(int pMinimoCaja){
        minimoCaja= pMinimoCaja;
    }
    
    public int getMinimoCaja(){
        return minimoCaja;
    }
    public int getDineroCaja() {
        return dineroCaja;
    }

    public void setDineroCaja(int dineroCaja) {
        this.dineroCaja = dineroCaja;
    }
    public boolean isDineroEnCaja(){
        if(getDineroCaja()>0){
            return true;
        }
        else{
            return false;
        }
    }
    
    public int calcularTarifa(int tEstacionado){
        if(tEstacionado%15!=0){
            int n= tEstacionado/15;
            setMontoCobro((getTarifa()*n)+getTarifa());
            System.out.println("monto:" + montoCobro);
            return montoCobro;
        }
        else{
            int n= tEstacionado/15;
            setMontoCobro(getTarifa()*n);
            System.out.println("monto:" + montoCobro);
            return montoCobro;
        }
    }
    public int getPagoCliente() {
        return pagoCliente;
    }
    public void setPagoCliente(int pagoCliente) {
        this.pagoCliente = pagoCliente;
    }

    public int getVuelto() {
        return vuelto;
    }
    public void setVuelto(int vuelto) {
        this.vuelto = vuelto;
    }
    
    public void calcularVuelto(){
        
    }
    public int getDineroInicial() {
        return dineroInicial;
    }

    public void setDineroInicial(int dineroInicial) {
        this.dineroInicial = dineroInicial;
    }

    public int getGanancia() {
        return totalGanacia;
    }

    public void setGanancia(int pTotalGanancia) {
        totalGanacia = pTotalGanancia;
        totalGanacia= dineroInicial+dineroAgregado-dineroRetirado;
    }

    public int getDineroAgregado() {
        return dineroAgregado;
    }

    public void setDineroAgregado(int dineroAgregado) {
        this.dineroAgregado = dineroAgregado;
    }

    public int getDineroRetirado() {
        return dineroRetirado;
    }

    public void setDineroRetirado(int dineroRetirado) {
        this.dineroRetirado = dineroRetirado;
    }
    
    public void setContraseña(String pContrasenaCaja){
       contrasenaCaja=pContrasenaCaja;
    }
    public String getContrasena(){
        return contrasenaCaja;
    }
    
    public void agregarDinero(int dineroAgregado){
        //contrasenaUsuario = JOptionPane.showInputDialog("Digite la contraseña: ");
        //if(contrasenaUsuario==contrasenaCaja){//funciona comparacion?
            setDineroAgregado(this.dineroAgregado);
            setDineroCaja(getDineroCaja()+this.dineroAgregado);
            JOptionPane.showMessageDialog(null, "Se ha agregado:"+getDineroAgregado()+"a la caja exitosamente");
        //}
        //else{
          //  JOptionPane.showMessageDialog(null, "Contrasena Invalida");
        //}
    }
    
    public void retirarDinero(int dineroRetirado){
        //contrasenaUsuario = JOptionPane.showInputDialog("Digite la contraseña: ");
        //if(contrasenaUsuario==contrasenaCaja){
            setDineroRetirado(this.dineroRetirado);
            setDineroCaja(getDineroCaja()-this.dineroRetirado);
            JOptionPane.showMessageDialog(null, "Se ha retirado:"+getDineroRetirado()+"de la caja exitosamente");
        //}
        //else{
          //  JOptionPane.showMessageDialog(null, "Contrasena Invalida");
        //}
    }
    
    public void recibirTiquete(){
        
    }
    
    public void mostrarEfectivo(){
        JOptionPane.showMessageDialog(null, "Efectivo:"+getDineroCaja());
    }

    /**
     * @return the montoCobro
     */
    public int getMontoCobro() {
        
        return montoCobro;
    }

    /**
     * @param montoCobro the montoCobro to set
     */
    public void setMontoCobro(int montoCobro) {
        this.montoCobro = montoCobro;
    }
}
