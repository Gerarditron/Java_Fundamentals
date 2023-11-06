package Clase12;

public class Vehicle {
    //the Vehicle class has two fields
    //Variables
    private String make = "";
    private int milesPerGallon = 0;
    //Constructor
    public Vehicle(){
    }

    public Vehicle(String _make, int _milesPerGallon){
        make = _make;
        milesPerGallon = _milesPerGallon;
    }

    //Setter - Declarar valores a las variables en la clase
    public void setMake(String m){
        make = m;
    }

    public void setMilesPerGallon(int mpg){
        milesPerGallon = mpg;
    }

    //Getter - Leer los valores ya declarados en las variables de la clase
    public String getMake(){
        return make;
    }

    public int getMilesPerGallon(){
        return milesPerGallon;
    }

    //Metodos
    public void pruebaMetodo(){
        System.out.println("Metodo de prueba");
    }
}
