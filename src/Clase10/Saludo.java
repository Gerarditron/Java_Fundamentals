package Clase10;

import java.util.Date;
public class Saludo {
    public static void main(String[] args) {
        if(args.length > 0){
            Date fecha = new Date();

            System.out.println("Hola " +args[0]+ "!");
            System.out.println("Hoy es " +fecha);
        }
    }
}
