package Clase09;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class VehiculoTest {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String marca = "", modelo = "", tipo = "";
        int anio = 0;

        //Entrada de datos
        System.out.print("Digite la marca del vehiculo: ");
        marca = read.next();
        System.out.print("Digite el modelo del vehiculo: ");
        modelo = read.next();
        System.out.print("Digite el tipo del vehiculo: ");
        tipo = read.next();
        System.out.print("Digite el año (AAAA): ");
        anio = read.nextInt();

        //Insertamos los datos ingresasos a la clase objeto
        Vehiculo car = new Vehiculo(marca,modelo,tipo,anio);


        System.out.println(car.marca);
        System.out.println(car.modelo);
        System.out.println(car.tipo);
        System.out.println(car.anio);




    }





}
