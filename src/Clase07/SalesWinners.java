package Clase07;

import java.util.Scanner;
public class SalesWinners {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("How many memberships did you sell?: ");
        int sales = in.nextInt();

        switch (sales) {
            case 6:
                System.out.println("You win $1,000");
            case 5:
                System.out.println("You win a Samsung Galaxy");
            case 4:
                System.out.println("You win a Laptop");
            case 3:
                System.out.println("You win an iPod");
            case 2:
                System.out.println("You win a Stapler");
            case 1:
                System.out.println("You win a Stapler Remover");
                break;
            default:
                System.out.println("No gift :(");
        }
        //Como podemos ver, si no se le pone un "break", ejecuta los cases despues de la opcion que hemos seleccionado

    }
}
