/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package progra.parqueo;

/**
 *
 * @author Gato
 */
public class Vehiculo {
    
    private String placa;
    private String marca;
    private String color;
    private String modelo;
    private int horaIngreso;
    private int horaSalida;
    private int tiempoEstacionado;
    private int espacioOcupado;
    private int costoTotal;

    /**
     * @return the placa
     */
    
    public Vehiculo(String pPlaca, String pMarca, String pColor, String pModelo, int pTiempoEstacionado, int pEspacioOcupado) {
        placa = pPlaca;
        marca = pMarca;
        color = pColor;
        modelo = pModelo;
        tiempoEstacionado = pTiempoEstacionado;
        espacioOcupado = pEspacioOcupado;
    }
    
    
    
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the horaIngreso
     */
    public int getHoraIngreso() {
        return horaIngreso;
    }

    /**
     * @param horaIngreso the horaIngreso to set
     */
    public void setHoraIngreso(int pHoraIngreso) {
        horaIngreso = pHoraIngreso;
    }

    /**
     * @return the horaSalida
     */
    public int getHoraSalida() {
        return horaSalida;
    }

    /**
     * @param horaSalida the horaSalida to set
     */
    public void setHoraSalida(int horaSalida) {
        this.horaSalida = horaSalida;
    }

    /**
     * @return the tiempoEstacionado
     */
    public int getTiempoEstacionado() {
        return tiempoEstacionado;
    }

    /**
     * @param tiempoEstacionado the tiempoEstacionado to set
     */
    public void setTiempoEstacionado(int tiempoEstacionado) {
        this.tiempoEstacionado = tiempoEstacionado;
    }

    /**
     * @return the espacioOcupado
     */
    public int getEspacioOcupado() {
        return espacioOcupado;
    }

    /**
     * @param espacioOcupado the espacioOcupado to set
     */
    public void setEspacioOcupado(int espacioOcupado) {
        this.espacioOcupado = espacioOcupado;
    }

    /**
     * @return the costoTotal
     */
    public int getCostoTotal() {
        return costoTotal;
    }

    /**
     * @param costoTotal the costoTotal to set
     */
    public void setCostoTotal(int costoTotal) {
        this.costoTotal = costoTotal;
    }
}
