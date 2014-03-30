/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package progra.parqueo;

import java.util.Calendar; 
import java.util.Date; 
import java.util.GregorianCalendar; 
import javax.swing.JLabel; 

public class Reloj extends JLabel implements Runnable { 

private String dia, mes, año, hora, minutos, segundos,fecha; 
private Calendar calendario = new GregorianCalendar(); 
Thread hilo; 


    public Reloj( int x, int y, int p, int p1) { //Constructor 
    setBounds(x, y, p, p1); 
    hilo = new Thread(this); 
    hilo.start(); 

} //fin constructor 
    
public String getFecha(){
      return fecha; 
   }

public void setFecha(String pFecha){
    fecha=pFecha;
}
@ Override 
    public void run() { 
    Thread ct = Thread.currentThread(); 
    while (ct == hilo) { 
    try { 
    actualiza(); 
    int mesE; 
//    mesE = Integer.valueOf(mes) + 1; 

    setText("<html><center>" + "<br>" + hora + ":" + minutos ); 

    Thread.sleep(1000); 
    } catch (InterruptedException ex) { 
    System.out.println(ex.getMessage()); 
    } 

    } 

} 


    public void actualiza() { 

    Date fechaHoraActual = new Date(); 
    calendario.setTime(fechaHoraActual); 

    hora = String.valueOf(calendario.get(Calendar.HOUR_OF_DAY)); 
    minutos = calendario.get(Calendar.MINUTE) > 9 ? "" + calendario.get(Calendar.MINUTE) : "0" + calendario.get(Calendar.MINUTE); 
//segundos = calendario.get(Calendar.SECOND) > 9 ? "" + calendario.get(Calendar.SECOND) : "0" + calendario.get(Calendar.SECOND); 
        setDia(calendario.get(Calendar.DATE) > 9 ? "" + calendario.get(Calendar.DATE) : "0" + calendario.get(Calendar.DATE)); 
        setMes(calendario.get(Calendar.MONTH) > 9 ? "" + calendario.get(Calendar.MONTH) : "0" + calendario.get(Calendar.MONTH)); 
        setAño(calendario.get(Calendar.YEAR) > 9 ? "" + calendario.get(Calendar.YEAR) : "0" + calendario.get(Calendar.YEAR)); 
   setFecha(getDia()+"/"+getMes()+"/"+getAño());
   
    } 

    /**
     * @return the dia
     */
    public String getDia() {
        return dia;
    }

    /**
     * @param dia the dia to set
     */
    public void setDia(String dia) {
        this.dia = dia;
    }

    /**
     * @return the mes
     */
    public String getMes() {
        return mes;
    }

    /**
     * @param mes the mes to set
     */
    public void setMes(String mes) {
        this.mes = mes;
    }

    /**
     * @return the año
     */
    public String getAño() {
        return año;
    }

    /**
     * @param año the año to set
     */
    public void setAño(String año) {
        this.año = año;
    }
} 
