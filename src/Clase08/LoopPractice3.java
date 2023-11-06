package Clase08;

import java.util.Scanner;

public class LoopPractice3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numInputs = 10, sum = 0, input = 0;

        for(int i=0; i < numInputs; i++){
            System.out.print("Enter a number: ");
            input = in.nextInt();
            sum += input;
        }
        System.out.println("The sum of those ten number es: " + sum);
    }
}
