package Clase10;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int[] allTwos = new int[10];

        //Ejemplo 1
        System.out.println("---Ejemplo 1---");
        for(int index = 0; index < allTwos.length; index++){
            allTwos[index] = 2;
        }

        for(int i = 0; i < allTwos.length; i++){
            //Imprimimos el valor espacio del arreglo
            System.out.println("allTwos["+ i +"]: " + allTwos[i]);
        }

        //Ejemplo 2
        System.out.println("---Ejemplo 2---");
        Scanner read = new Scanner(System.in);
        int[] numbers = new int[5];
        //Insertando los datos
        for(int j = 0; j < numbers.length; j++){
            System.out.print("Digite el numero para la posición ["+ j +"]: ");
            numbers[j] = read.nextInt();
        }

        //Imprimiendo los datos
        for(int k = 0; k < numbers.length; k++){
            System.out.println("numbers["+k+"]: "+numbers[k]);
        }

        //Ejemplo 3
        System.out.println("---Ejemplo 3---");
        int[] indexs = new int[10];
        for(int index = 0; index < indexs.length; index++){
            indexs[index] = index;
            System.out.println("allTwos["+ index +"]: " + indexs[index]);
        }

    }

}
