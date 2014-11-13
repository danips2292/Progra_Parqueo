/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package progra.parqueo;

import javax.swing.JOptionPane;



public class Caja {
    private int dineroCaja;
    private int pagoCliente;
    private int vuelto;
    private int dineroInicial;
    private int dineroAgregado;
    private int dineroRetirado;
    private String contrasenaUsuario;
    private String contrasenaCaja;
    private String minimoCaja;
    private int totalGanacia;
    private int tarifa;
    private int montoCobro;
    private int numFactura;
    
    public Caja(int pTarifa,int pDineroCaja,int pPagoCliente,int pVuelto,int pDineroInicial,int pDineroAgregado,int pDineroRetirado,String pContrasenaCaja,String pMinimoCaja,int pTotalGanacias){
     dineroCaja = pDineroCaja;
     pagoCliente = pPagoCliente;
     vuelto = pVuelto;
     tarifa=pTarifa;
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
    
     public String getMinimoCaja() {
        
        return minimoCaja;
     }
    public void setMinimoCaja(String minimoCaja) {
        this.minimoCaja = minimoCaja;
    }
    public int getDineroCaja() {
        return dineroCaja;
    }

    public void setDineroCaja(int dineroCaja) {
        this.dineroCaja = dineroCaja;
    }
    
    //informa si existe dinero en la caja, no recibe parametros, salidas bool, si hay o no dinero
    public boolean isDineroEnCaja(){
        if(getDineroCaja()>0){
            return true;
        }
        else{
            return false;
        }
    }
    
    //se encarga de calcular el monto que debe pagar el ususario segun el tiempo en el parqueo, recibe el tiempo esatcionado del vehiculo, salidas retorna el valor que debe pagar
    public int calcularTarifa(int tEstacionado){
        setMontoCobro((getTarifa()*5)+getTarifa());
        
        
        if(tEstacionado%15!=0){
            
            int n= tEstacionado/15;
           
            setMontoCobro((getTarifa()*n)+getTarifa());
            
            
            return montoCobro;
        }
        else{
            
            int n= tEstacionado/15;
            setMontoCobro(getTarifa()*n);
            
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
    
    //calcula el vuelto del pago del cliente y lo que debe este pagar por el servivio, no recibe parametros, salidas retorna el vuelto
    public int calcularVuelto(){
        int calculoVuelto=getPagoCliente()-(Parqueo.getInstance().getUserCaja().
        calcularTarifa(Parqueo.getInstance().getEspacios()[Parqueo.getInstance().getNumEspacio()].getVehiculo().getTiempoEstacionado()));
        return calculoVuelto;
    }
    public int getDineroInicial() {
        return dineroInicial;
    }

    public void setDineroInicial(int dineroInicial) {
        this.dineroInicial = dineroInicial;
    }

    public int getGanancia() {
        return getTotalGanacia();
    }

    public void setGanancia(int pTotalGanancia) {
        setTotalGanacia(pTotalGanancia);
        
    }
    
    //calcula la ganacia de un dia en la caja al cerrar parqueo, no recibe parametros, salidas valor de ganancia del dia
    public int calcularGanancia(){
        int min = Integer.parseInt(minimoCaja);
        int n=getDineroCaja()-min;
        return n;
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
    
    //se encarga de agregar cierto monto al dinero que esta en la caja, recibe un monto para agregar, salidas void
    public void agregarDinero(int dineroAgregado){
        
            setDineroAgregado(this.dineroAgregado);
            setDineroCaja(getDineroCaja()+dineroAgregado);
            JOptionPane.showMessageDialog(null, "Se ha agregado:"+getDineroAgregado()+"a la caja exitosamente");
        
    }
    
    //se encarga de retirar cierto monto al dinero que esta en la caja, recibe un monto para retirar, salidas void
    public void retirarDinero(int dineroRetirado){
       
            setDineroRetirado(this.dineroRetirado);
            setDineroCaja(getDineroCaja()-this.dineroRetirado);
            JOptionPane.showMessageDialog(null, "Se ha retirado:"+getDineroRetirado()+"de la caja exitosamente");
       
    }
    
    
    //se encarga de mandar una pantalla con el dinero que existe en la caja, no recibe parametros, salidas void
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

    /**
     * @return the totalGanacia
     */
    public int getTotalGanacia() {
        return totalGanacia;
    }

    /**
     * @param totalGanacia the totalGanacia to set
     */
    public void setTotalGanacia(int totalGanacia) {
        this.totalGanacia = totalGanacia;
    }

    /**
     * @return the numFactura
     */
    
}
