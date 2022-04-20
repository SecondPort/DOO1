//clase vehiculo
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
    }
}

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

public class Registro{
    private List<Vehiculo> listadoVehiculos;
    Registro(){
        listadoVehiculos = new ArrayList<Vehiculo>();
    }
    public void agregarVehiculo(Vehiculo vehiculo){
        listadoVehiculos.add(vehiculo);
    }
    public void eliminarVehiculo(Vehiculo vehiculo){
        listadoVehiculos.remove(vehiculo);
    }
    public void mostrarVehiculos(){
        for(Vehiculo vehiculo : listadoVehiculos){
            System.out.println(vehiculo);
        }
    }
}