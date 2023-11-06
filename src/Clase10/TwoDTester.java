package Clase10;

import java.util.Scanner;

public class TwoDTester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //array[rows][columns]
        int [][] nums = new int[3][3];

        //Ingresando datos
        for(int i = 0; i < nums.length; i++){
            for(int j= 0; j < nums[i].length; j++){
                System.out.print("Enter a value for row["+i+"], column["+j+"]: ");
                nums[i][j] = in.nextInt();
            }
        }

        //Imprimiendo datos
        for(int i = 0; i < nums.length; i++){
            System.out.print("row: "+i+" [");
            for(int j= 0; j < nums[i].length; j++){
                if (j<1){
                    System.out.print("col"+j+ ": "+nums[i][j]);
                } else {
                    System.out.print(", col"+j+": "+nums[i][j]);
                }
            }
            System.out.println("]");
        }

        //Imprimiendo datos 2
        for(int i = 0; i < nums.length; i++){ //Este for evalua la cantidad de filas que existan
            System.out.print(i+"- {");
            for(int j= 0; j < nums[i].length; j++){ //Este for evalual la cantidad de columnas que existan
                System.out.print("["+nums[i][j]+"]");
            }
            System.out.println("}");
        }

    }

}
