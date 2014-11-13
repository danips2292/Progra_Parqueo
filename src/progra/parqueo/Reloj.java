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
private static Reloj relojInstance;
private String dia, mes, año, hora, minutos, segundos, fecha,HorMin; 
private Calendar calendario = new GregorianCalendar(); 
Thread hilo; 


    public Reloj( int x, int y, int p, int p1) { //Constructor 
    setBounds(x, y, p, p1); 
    hilo = new Thread(this); 
    hilo.start(); 

} //fin constructor 

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
    //se encarga de dar una insatncai de reloj o crearla en su defecto, no recibe parametros, salidas instancia de reloj
    public static  Reloj getInstance(){
        if(relojInstance == null)
            relojInstance = new Reloj(0,0,0,0);
        return relojInstance;
    }
    
    //se encarga de dar valores a las variables respecto a fecha y hora, no recibe parametros, salidas void
    public void actualiza() { 

    Date fechaHoraActual = new Date(); 
    calendario.setTime(fechaHoraActual); 

    hora = String.valueOf(calendario.get(Calendar.HOUR_OF_DAY)); 
    minutos = calendario.get(Calendar.MINUTE) > 9 ? "" + calendario.get(Calendar.MINUTE) : "0" + calendario.get(Calendar.MINUTE); 
//segundos = calendario.get(Calendar.SECOND) > 9 ? "" + calendario.get(Calendar.SECOND) : "0" + calendario.get(Calendar.SECOND); 
    setDia(calendario.get(Calendar.DATE) > 9 ? "" + calendario.get(Calendar.DATE) : "0" + calendario.get(Calendar.DATE)); 
    setMes(calendario.get(Calendar.MONTH) > 9 ? "" + calendario.get(Calendar.MONTH) : "0" + calendario.get(Calendar.MONTH)); 
    setAño(calendario.get(Calendar.YEAR) > 9 ? "" + calendario.get(Calendar.YEAR) : "0" + calendario.get(Calendar.YEAR)); 
    int hora2 = Integer.parseInt(hora);
    String horMinVar =String.valueOf((hora2*100)+minutos);
    setHorMin(horMinVar);
    setFecha(getDia()+"/"+getMes()+"/"+getAño());
    } 

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getMinutos() {
        return minutos;
    }

    public void setMinutos(String minutos) {
        this.minutos = minutos;
    }
    
    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }
    
    
    
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the HorMin
     */
    public String getHorMin() {
        return HorMin;
    }

    /**
     * @param HorMin the HorMin to set
     */
    public void setHorMin(String HorMin) {
        this.HorMin = HorMin;
    }
    
} 
