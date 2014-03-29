//CAT CODE
package progra.parqueo;

import Interfaces.DetallesVehiculo;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author Gato
 */
public class Parqueo {
    private static Parqueo parqueoInstance;
    private boolean abierto;
    //private String nombreLocal;
    //private String eslogan;
    //private String telefono;
    //private String cedulaJuridica;
    //private String horaAtencion;
    private int tarifaHora;
    private int numeroFactura;
    //private int minimoCaja;
    private String contrasenaEncriptada;
    private String contrasena;
    //private int lugaresDisponibles;
    private int hora;
    private Calendar fecha;
    //private String direccion;
    //private int cantidadLugares;
    private int cantEspacios;
    private Espacio espacios[];//chequear el for
    private int espaciosLibres; // siempre que se inicie el programa se asume que el parqueo esta vacio
    //Espacio userEspacio= new Espacio(abierto, tarifaHora, tarifaHora);
    private int numEspacio;//numero de espacio con el cual se trabajara
    Caja userCaja = new Caja(0, 0, 0,0,0, 0, "hola", 0, 0);
    
    

    public Parqueo(boolean pAbierto,int pTarifaHora,String pContrasena,int pCantEspacios) {
        abierto=pAbierto;
        tarifaHora = pTarifaHora;
        contrasena = pContrasena;
        cantEspacios = pCantEspacios;
        espacios= new Espacio[cantEspacios];
        espaciosLibres = cantEspacios;
        setEspacios();
    }
    public static Parqueo getInstance(){
        if (parqueoInstance == null)
            parqueoInstance = new Parqueo(false,1000,"hola",15);
        return parqueoInstance;
    }
    public boolean isAbierto() {
        return abierto;
    }
    public void setAbierto(boolean abierto) {
        this.abierto = abierto;
    }

    public void setEspacios() {
        int i = 0;
        for (i=0;i<cantEspacios;i=i+1){        
            espacios[i]=new Espacio(false);
        }
    }
    
    /*public String getNombreLocal() {
        return nombreLocal;
    }

    public void setNombreLocal(String nombreLocal) {
        this.nombreLocal = nombreLocal;
    }

    public String getEslogan() {
        return eslogan;
    }

    public void setEslogan(String eslogan) {
        this.eslogan = eslogan;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCedulaJuridica() {
        return cedulaJuridica;
    }

    public void setCedulaJuridica(String cedulaJuridica) {
        this.cedulaJuridica = cedulaJuridica;
    }

    public String getHoraAtencion() {
        return horaAtencion;
    }

    public void setHoraAtencion(String horaAtencion) {
        this.horaAtencion = horaAtencion;
    }*/

    public int getTarifaHora() {
        return tarifaHora;
    }

    public void setTarifaHora(int pTarifaHora) {
        tarifaHora = pTarifaHora;
    }

    public int getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(int pNumeroFactura) {
        numeroFactura = pNumeroFactura;
    }

    /*public int getMinimoCaja() {
        return minimoCaja;
    }

    public void setMinimoCaja(int minimoCaja) {
        this.minimoCaja = minimoCaja;
    }*/
    public String getContrasenaEncriptada() {
        return contrasenaEncriptada;
    }

    public void setContrasenaEncriptada(String contrasenaEncriptada) {
        this.contrasenaEncriptada = contrasenaEncriptada;
    }
    
    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String pContrasena) {
        contrasena = pContrasena;
    }

    /*public int getLugaresDisponibles() {
        return lugaresDisponibles;
    }

    public void setLugaresDisponibles(int lugaresDisponibles) {
        this.lugaresDisponibles = lugaresDisponibles;
    }*/

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public void setUserCaja(Caja userCaja) {
        this.userCaja = userCaja;
    }

    public Caja getUserCaja() {
        return userCaja;
    }
    //Terminar esta funcio falta ponerle el else
    public void llenarEspacio(Vehiculo vehiculo)
    {
       // numEspacio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de espacio"));
        if (espacios[vehiculo.getEspacioOcupado()].isOcupado()==false)
        {
            espacios[vehiculo.getEspacioOcupado()].setOcupado(true);
            //espacios[numEspacio].setVehiculo(new Vehiculo());
            espacios[vehiculo.getEspacioOcupado()].setVehiculo(vehiculo);
            espaciosLibres-=1;//comprobar que siempre sea mayor a cero
            System.out.println(espaciosLibres);
            System.out.println(espacios[vehiculo.getEspacioOcupado()].getVehiculo().getColor());
        }
        else
        {
            JOptionPane.showMessageDialog(null,"El espacio esta ocupado");
        }
    }
    /*public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCantidadLugares() {
        return cantidadLugares;
    }

    public void setCantidadLugares(int cantidadLugares) {
        this.cantidadLugares = cantidadLugares;
    }*/
    
    public void abrirParqueo(){
        //cargarParametrosIniciales();
        if(espacios.length > 0){
            if(userCaja.getDineroCaja()>=userCaja.getMinimoCaja()){
                setAbierto(true);
                JOptionPane.showMessageDialog(null, "El parqueo ha sido abierto");
            }
            else{
                JOptionPane.showMessageDialog(null, "La caja debe contar con un monto minimo");
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "La cantidad de lugares del parqueo deben ser asignados");
        }
    }
    
    public void cerrarParqueo(){
        JOptionPane.showInputDialog(null, "Seguro que desea cerrar el parqueo??");
        if((espaciosLibres==0)||(espacios.length==espaciosLibres)){
            setAbierto(false);
            JOptionPane.showMessageDialog(null, "El parqueo esta cerrado ahora");
            userCaja.getGanancia();
            JOptionPane.showMessageDialog(null, "El dinero en caja es:"+userCaja.getDineroCaja()+",y su ganancia fue de:"+userCaja.getGanancia()); 
        }
        else{
            JOptionPane.showMessageDialog(null, "El parqueo debe estar vacio");
        }
    }
    
    public void encriptarContrasena(){
        
    }
    
    /*public void cambiarContrasena(String contrasena,String nuevaContrasena,String copiaNuevaContrasena){
        if(this.contrasena==getContrasena()){
            if(this.nuevaContrasena==this.copiaNuevaContrasena){
                setContrasena(this.nuevaContrasena);
            }
            else{
                JOptionPane.showMessageDialog(null, "La nueva contraseña y su repetición no coinciden");
            }
        }
    }*/
    
    /*public void cargarParametrosIniciales(){
        
    }*/

    /*public void configurarParametros(String nombreLocal,String eslogan, String telefono, String cedulaJuridica,String horaAtencion,int tarifaHora, int numeroFactura, int minimoCaja,String contrasena ){
        setNombreLocal(this.nombreLocal);
        setEslogan(this.eslogan);
        setTelefono(this.telefono);
        setCedulaJuridica(this.cedulaJuridica);
        setHoraAtencion(this.horaAtencion);
        setTarifaHora(this.tarifaHora);
        setNumeroFactura(this.numeroFactura);
        setMinimoCaja(this.minimoCaja);
        setContrasena(this.contrasena);
    }*/ //que es esto??
    
    /*public void salir(){
        if(getDineroCaja()==0){
            ventana.close();
        }
        else{
            JOptionPane.showMessageDialog(null, "Debe retirar el dinero de la caja");                
        }
    }*/ //no se q hace

    
}
