package Clase07;

import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name:"); //Solicitud de datos al usuario
        String name = in.next(); //Lectura de datos del usuario, hasta donde haya un espacio (no usar espacios)

        System.out.println("Enter a number:");
        int answer = in.nextInt(); //Lectura de un dato tipo INT

        System.out.println(name + ", the number you entered is: " + answer);
    }
}
