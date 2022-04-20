package edu.ubp.doo.modelo;

public class Barco extends Vehiculo{
    private float largoProa;
    private float largoPopa;

    Barco(int nroSerie, String color, float largoProa, float largoPopa){
        super(nroSerie, color);
        this.largoProa = largoProa;
        this.largoPopa = largoPopa;
    }
    public float getLargoProa(){
        return largoProa;
    }
    public float getLargoPopa(){
        return largoPopa;
    }
    public void setLargoProa(float largoProa){
        this.largoProa = largoProa;
    }
    public void setLargoPopa(float largoPopa){
        this.largoPopa = largoPopa;
    }
    public String toString(){
        return super.toString() + "\nLargo Proa: " + largoProa + "\nLargo Popa: " + largoPopa;
    }
}