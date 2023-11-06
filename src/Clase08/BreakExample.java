package Clase08;

import java.util.Scanner;

public class BreakExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numInputs = 10, input = 0, sum = 0, stopLoop = 999;

        for(int i = 0; i < numInputs; i++){
            System.out.print("Enter a number: ");
            input = in.nextInt();
            if(input == 999){
                break; //Si se digita el numero 999, se va a finalizar el ciclo
            } else {
                sum += input;
            }
        }
        System.out.println("The sum of the numbers entered is: "+sum);
    }
}
