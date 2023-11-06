package pruebaPaquete;

public class Counting {

    public static int counter = 5; //Variable generica publica para toda la clase

    public static void main(String[] args) {
        System.out.println("At the start of this program, counter is "+ counter);
        count(); //Funcion mas adelante
        System.out.println("At the end of this program, counter is "+counter);
    } //End method main

    public static void count(){
        int counter = 10;
        System.out.println("At the end of this method, counter is "+counter);
    } //End method count


} //End class Counting
