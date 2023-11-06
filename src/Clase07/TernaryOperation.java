package Clase07;

import java.util.Scanner;

public class TernaryOperation {
    public static void main(String[] args) {
        String s1, s2;
        s1 = "Hello";
        s2 = "Goodbye";

        //Ejemplo de "Operador Ternario"
        //Tipo de Variable | Nombre de Variable | = | Condición | ? | Condicion Correcta | Condicion Falsa | ;
        String answer = s1.equals(s2) ? "Yes" : "No";
        System.out.println("answer: " + answer);

        //Ejemplo de evaluar un valor recien ingresado al sistema
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = in.nextLine(); //Guardar variable
        name = name.equals("") ? "[No se digito nombre]" : name; //Evaluando el valor que no venga vacio
        System.out.println("name: "+name);



    }
}
