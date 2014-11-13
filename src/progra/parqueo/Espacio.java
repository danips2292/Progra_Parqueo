/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package progra.parqueo;


public class Espacio {
    private boolean ocupado;
    private Vehiculo vehiculo;
    //private int cantidadLugares;
    //private int cantidadLugaresDisponibles;
    
    public Espacio(boolean pOcupado){
        ocupado=pOcupado;
        //cantidadLugares=pCantidadLugares;
        //cantidadLugaresDisponibles=pCantidadLugaresDisponibles;
    }
    
    //se encarga de decir si esta ocupado o no por medio de un true o false, no recibe parametros, salidas bool para ocupado o no
    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean pOcupado) {
        ocupado = pOcupado;
    }
    
     /*public int getCantidadLugaresDisponibles(){
        if(ocupado==true){
            cantidadLugaresDisponibles=cantidadLugares--;
        }
        return cantidadLugaresDisponibles;
    }
    
    public void setCantidadLugares(int pCantidadEspacios){
        cantidadLugares=pCantidadEspacios;
    }
    
    public int getCantidadLugares(){
        return cantidadLugares;
    }
   
    public void eliminarEspacio(){
        setCantidadLugares(getCantidadLugares()-1);
        //ventanaEspacio #. delete();
    }
    
    public void mostrarPlaca(){
        
    }*/

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo pVehiculo) {
        vehiculo = pVehiculo;
    }
}
