package edu.ubp.doo.modelo;

public class Vehiculo {
    private int nroSerie;
    private String color;
    Vehiculo(int nroSerie, String color){
        this.nroSerie = nroSerie;
        this.color = color;
    }
    public int getNroSerie(){
        return nroSerie;
    }
    public String getColor(){
        return color;
    }
    public void setNroSerie(int nroSerie){
        this.nroSerie = nroSerie;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String toString(){
        return "Nro Serie: " + nroSerie + "\nColor: " + color;
    }
}