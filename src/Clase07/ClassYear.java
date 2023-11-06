package Clase07;

import java.util.Scanner;

public class ClassYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("What grade are you in? ");
        int grade = in.nextInt();

        switch (grade){
            case 9 -> System.out.println("You are a freshman");
            case 10 -> System.out.println("You are a Sophomore");
            case 11 -> System.out.println("You are a Junior");
            case 12 -> System.out.println("You are a Senior");
            default -> System.out.println("Invalid grade");
        }

        //Con este metodo de sintaxis para los "cases" nos evitamos el poner breaks, pero solo funciona
        //para una linea de codigo
    }
}
