package Clase08;

import java.util.Scanner;

public class ContinueExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numInputs = 5, input = 0;

        for (int i = 0; i < numInputs; i++){
            System.out.print("Digite un número: ");
            input = in.nextInt();
            if(input % 2 == 0){
                continue;
            }
            System.out.println("That number was odd"); //El numero es impar
        }
    }
    //Solicitamos un numero, hasta que se digite un impar.
}
