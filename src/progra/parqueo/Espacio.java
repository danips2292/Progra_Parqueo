/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package progra.parqueo;

/**
 *
 * @author Gato
 */
public class Espacio {
    private boolean ocupado;
    //private int cantidadLugares;
    //private int cantidadLugaresDisponibles;
    
    public Espacio(boolean pOcupado){
        ocupado=pOcupado;
        //cantidadLugares=pCantidadLugares;
        //cantidadLugaresDisponibles=pCantidadLugaresDisponibles;
    }
    
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
}
