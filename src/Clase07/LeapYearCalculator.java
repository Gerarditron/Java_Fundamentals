package Clase07;

import java.util.Scanner;

public class LeapYearCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the month (number): ");
        int month = in.nextInt();

        System.out.print("Enter the year (number): ");
        int year = in.nextInt();

        switch (month) { //Evaluamos el mes digitado
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("That mont has 30 days");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("That month has 31 days");
                break;
            case 2:
                if((year % 4 == 0 && year % 100 != 0) || (year % 400 != 0)){
                    System.out.println("That month has 29 days");
                }
                else {
                    System.out.println("That month has 28 days");
                }
                break;
            default:
                System.out.println("Invalid Input");
        }

    }

}
