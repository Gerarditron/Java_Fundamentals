package Clase08;

import java.util.Scanner;

public class LoopPractice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numInputs = 0;
        int sum = 0;

        while(numInputs < 10){
            System.out.print("Digite un número entero ["+(numInputs+1)+"]: "); //Imprimo la cantidad de veces que se está repitiendo el ciclo
            int input = in.nextInt(); //Capturamos el dato
            sum += input; //Sumamos al valor lo digitamos
            numInputs++; //Incrementamos la variable de la condicion
        }

        System.out.println("The sum of those ten number is: "+sum);

    }
}
