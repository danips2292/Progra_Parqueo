/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package progra.parqueo;

public class Factura {
    
    private String titulo = "Parqueo Morazan";
    private String slogan = "Abierto las 24 horas.";
    private String numTelefono = "48657348";
    private String msjTelefono = "Tel:"+ getNumTelefono();
    private String cedulaJuridica = "1-1111-1112";
    private String cedulaJuridicaCompleto= "Cédula Jurídica:"+getCedulaJuridica();
    private String direccion= "Costado norte del Parque Morazán, San José";
    private String direccionCompleto= "Dirección:"+getDireccion();
    private String fechaComplato= "Fecha:"+Reloj.getInstance().getFecha();
    private String horario="Abierto de 7 a.m. a 7 p.m.";
    private int numFactura;
    
    public Factura(int pNumFactura,String pTitulo,String pSlogan,String pNumTelefono,String pCedulaJuridica,String pDireccion,String pHorario ){
        titulo=pTitulo;
        slogan=pSlogan;
        numTelefono=pNumTelefono;
        cedulaJuridica=pCedulaJuridica;
        direccion=pDireccion;
        horario=pHorario;
        numFactura=pNumFactura;
    }
    
    public int getNumFactura() {
        return numFactura;
    }

    /**
     * @param numFactura the numFactura to set
     */
    public void setNumFactura(int numFactura) {
        this.numFactura = numFactura;
    }
    
    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the slogan
     */
    public String getSlogan() {
        return slogan;
    }

    /**
     * @param slogan the slogan to set
     */
    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    /**
     * @return the numTelefono
     */
    public String getNumTelefono() {
        return numTelefono;
    }

    /**
     * @param numTelefono the numTelefono to set
     */
    public void setNumTelefono(String numTelefono) {
        this.numTelefono = numTelefono;
    }

    /**
     * @return the msjTelefono
     */
    public String getMsjTelefono() {
        return msjTelefono;
    }

    /**
     * @param msjTelefono the msjTelefono to set
     */
    public void setMsjTelefono(String msjTelefono) {
        this.msjTelefono = msjTelefono;
    }

    /**
     * @return the cedulaJuridica
     */
    public String getCedulaJuridica() {
        return cedulaJuridica;
    }

    /**
     * @param cedulaJuridica the cedulaJuridica to set
     */
    public void setCedulaJuridica(String cedulaJuridica) {
        this.cedulaJuridica = cedulaJuridica;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the cedulaJuridicaCompleto
     */
    public String getCedulaJuridicaCompleto() {
        return cedulaJuridicaCompleto;
    }

    /**
     * @param cedulaJuridicaCompleto the cedulaJuridicaCompleto to set
     */
    public void setCedulaJuridicaCompleto(String cedulaJuridicaCompleto) {
        this.cedulaJuridicaCompleto = cedulaJuridicaCompleto;
    }

    /**
     * @return the direccionCompleto
     */
    public String getDireccionCompleto() {
        return direccionCompleto;
    }

    /**
     * @param direccionCompleto the direccionCompleto to set
     */
    public void setDireccionCompleto(String direccionCompleto) {
        this.direccionCompleto = direccionCompleto;
    }

    /**
     * @return the fechaComplato
     */
    public String getFechaComplato() {
        return fechaComplato;
    }

    /**
     * @param fechaComplato the fechaComplato to set
     */
    public void setFechaComplato(String fechaComplato) {
        this.fechaComplato = fechaComplato;
    }

    /**
     * @return the horario
     */
    public String getHorario() {
        return horario;
    }

    /**
     * @param horario the horario to set
     */
    public void setHorario(String horario) {
        this.horario = horario;
    }
   
}
