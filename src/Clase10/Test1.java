package Clase10;

public class Test1 {

    public static void main(String[] args) {
        //Ejemplo para almacenar valores sin solicitarselos al usuario
        //Declaración de Arrays BiDimensional - Metodo 1
        int[][] myArray = new int[3][2];
        myArray[0][0] = 7;
        myArray[0][1] = 24;
        myArray[1][0] = 352;
        myArray[1][1] = 2;
        myArray[2][0] = 37;
        myArray[2][1] = 65;

        System.out.println("---EJEMPLO 1-------------");
        for(int i = 0; i < myArray.length; i++){
            System.out.print("{");
            for(int j = 0; j <myArray[i].length; j++){
                System.out.print("["+myArray[i][j]+"]");
            }
            System.out.println("}");
        }

        //Declaración de Arrays BiDimensional - Metodo 2
        int[][] myArray1 = {{7,24},{352,2},{37,65}};

        System.out.println("---EJEMPLO 2-------------");
        for(int i = 0; i < myArray1.length; i++){
            System.out.print("{");
            for(int j = 0; j <myArray1[i].length; j++){
                System.out.print("["+myArray1[i][j]+"]");
            }
            System.out.println("}");
        }

    }




}
