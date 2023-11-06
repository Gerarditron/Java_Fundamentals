package Clase07;

import java.util.Scanner;

public class IfElseChar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int answer = 0;

        System.out.println("Enter a number: ");
        int num1 = in.nextInt();

        System.out.println("Enter another number: ");
        int num2 = in.nextInt();

        System.out.println("Enter the operand (* / % + -): ");
        char input = in.next().charAt(0); //Agarrar el primer digito de lo que escriba el usuario, por eso el charAt(0)

        if(input == '*'){
            answer = num1 * num2;
        } else if (input == '/') {
            answer = num1 / num2;
        } else if (input == '%') {
            answer = num1 % num2;
        } else if (input == '+') {
            answer = num1 + num2;
        } else if (input == '-'){
            answer = num1 - num2;
        } else {
            System.out.println("Invalid Command");
        }
        System.out.println("Answer: " + answer);
    }

}
