package Clase10;

public class Test2 {
    public static void main(String[] args) {
        String[][] myBouqet = {
            {"Red","Peach","Yellow"},
            {"Yellow","White","Blue"},
            {"Green","Blue","Purple"},
            {"White","White","White"},
            {"Purple","Pink","Violet"},
            {"Pink","Orange","White"}
        };

        System.out.println(myBouqet[0][1] + " Rose.");
        System.out.println(myBouqet[5][2] + " Lilly.");

        //Prueba de sintaxis
        String[] one = new String[7];
        int[][] two = new int[5][3];
        double[][] three = new double[3][2];
        People[] four = new People[5];
        System.out.println(one.length); //7
        System.out.println(two.length); //5
        System.out.println(three.length); //3
        System.out.println(two[0].length); //3
        System.out.println(three[0].length); //2
        System.out.println(four.length); //5




    }
}
