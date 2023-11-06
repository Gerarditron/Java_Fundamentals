package Clase12;

import java.util.Vector;

public class VehicleTester {
    public static void main(String[] args) {
        //EJEMPLO 1 - Sin Constructor
        //Invocando la Clase Objeto
        //Creando una INSTANCIA de la CLASE VEHICLE
        Vehicle myCar = new Vehicle();

        //Actualizando Valores - myCar
        myCar.setMake("Kia");
        myCar.setMilesPerGallon(35);
        System.out.println(myCar.getMake());
        System.out.println(myCar.getMilesPerGallon());

        //EJEMPLO 2 - Con Constructor
        Vehicle myCar2 = new Vehicle("Toyota",30);

        //Imprimiendo los datos - usamos los GETTER
        System.out.println(myCar2.getMake());
        System.out.println(myCar2.getMilesPerGallon());

        //Actualizando Valores - myCar2
        myCar2.setMake("Nissan");
        myCar2.setMilesPerGallon(25);
        System.out.println(myCar2.getMake());
        System.out.println(myCar2.getMilesPerGallon());

        //EJEMPLO 3 - Con Constructor
        Vehicle myCar3 = new Vehicle();
        myCar3.setMake("Hyundai");
        myCar3.setMilesPerGallon(40);
        System.out.println(myCar3.getMake());
        System.out.println(myCar3.getMilesPerGallon());
        //myCar3.pruebaMetodo();

    }
}
