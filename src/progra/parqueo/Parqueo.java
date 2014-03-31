//CAT CODE
package progra.parqueo;

import Interfaces.DetallesVehiculo;
import com.sun.jmx.snmp.BerDecoder;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

/**
 *
 * @author Gato
 */
public class Parqueo {
    private static Parqueo parqueoInstance;
    private boolean abierto;
    private String encriptado;
    private String contrasenaEncriptada;
    private String contrasena;
    private int hora;
    private Calendar fecha;   
    private int cantEspacios;
    private Espacio espacios[];//chequear el for
    private int espaciosLibres; // siempre que se inicie el programa se asume que el parqueo esta vacio
    private int numEspacio;//numero de espacio con el cual se trabajara
    Caja userCaja = new Caja(10, 0, 0,0,0,0,0, "hola", 0, 0);
    JPasswordField jpf= new JPasswordField();
    


    //comment
    public Parqueo(boolean pAbierto,String pContrasena,int pCantEspacios) {


        abierto=pAbierto;
        contrasena = pContrasena; 
        cantEspacios = pCantEspacios;
        espacios= new Espacio[cantEspacios];
        espaciosLibres = cantEspacios;
        setEspacios();
    }
    
    public static Parqueo getInstance(){
        if(parqueoInstance == null)
            parqueoInstance = new Parqueo(true,"hola",15);
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

    

    /*public int getMinimoCaja() {
        return minimoCaja;
    }

    public void setMinimoCaja(int minimoCaja) {
        this.minimoCaja = minimoCaja;
    }*/
    public String getContrasenaEncriptada() {
        return encriptado;
    }

    public void setContrasenaEncriptada(String pEncriptado) {
        encriptado=pEncriptado;
        JOptionPane.showConfirmDialog (null, new Object[]{"Digite la contrasena", jpf}, "Inicio de sesión", JOptionPane.OK_CANCEL_OPTION);
        pEncriptado=jpf.getText();
        char array[]= pEncriptado.toCharArray();
        for(int i=0;i<array.length;i++){
            array[i]=(char)(array[i]+(char)5);
        }
        encriptado =  String.valueOf(array);
        JOptionPane.showMessageDialog(null,encriptado);
        
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
            vehiculo.setHoraIngreso(Integer.parseInt(Reloj.getInstance().getHora())*100 + Integer.parseInt(Reloj.getInstance().getMinutos()));
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
    public void vaciarEspacio()
    {
        numEspacio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de espacio a vaciar"));
        if (espacios[numEspacio].isOcupado()== true)
        {
            espacios[numEspacio].getVehiculo().setHoraSalida(Integer.parseInt(Reloj.getInstance().getHora())*100 + Integer.parseInt(Reloj.getInstance().getMinutos()));
            espacios[numEspacio].setOcupado(false);
            espaciosLibres+=1;
            espacios[numEspacio].getVehiculo().setTiempoEstacionado(espacios[numEspacio].getVehiculo().getHoraSalida() -
                                                                    espacios[numEspacio].getVehiculo().getHoraIngreso());
            userCaja.calcularTarifa(espacios[numEspacio].getVehiculo().getTiempoEstacionado());
        }
        else
        {
            
            JOptionPane.showMessageDialog(null,"El espacio ya está vacío");
        }
    } 
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
}
