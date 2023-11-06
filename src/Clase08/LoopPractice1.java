package Clase08;

import java.util.Scanner;

public class LoopPractice1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numInputs = 0;
        int sum = 0, input = 0;

        do {
            System.out.print("Digite un número entero ["+(numInputs+1)+"]: "); //Imprimo la cantidad de veces que se está repitiendo el ciclo
            input = in.nextInt(); //Capturamos el dato
            sum += input; //Sumamos al valor lo digitamos
            numInputs++; //Incrementamos la variable de la condicion
        } while(numInputs < 10);

        System.out.println("The sum of those ten number is: "+sum);

    }

}
