package edu.ubp.doo.modelo;

public class Auto extends Vehiculo{
    private int cilindrada;
    Auto(int nroSerie, String color, int cilindrada){
        super(nroSerie, color);
        this.cilindrada = cilindrada;
    }
    public int getCilindrada(){
        return cilindrada;
    }
    public void setCilindrada(int cilindrada){
        this.cilindrada = cilindrada;
    }
    public String toString(){
        return super.toString() + "\nCilindrada: " + cilindrada;
