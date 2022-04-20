package edu.ubp.doo.modelo;

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