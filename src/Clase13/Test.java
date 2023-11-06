package Clase13;

public class Test {

    public static void main(String[] args) {


        //Le podemos enviar valores distintos, sin la necesidad de tener la misma cantidad de datos
        System.out.println("--- Ejemplo 1 ---");
        System.out.println(total(1,5,3,4));
        System.out.println(total(2,6,8,7,10,16,25));
        //Le podemos enviar hasta arreglos con cantidades distintas de datos
        System.out.println("--- Ejemplo 2 ---");

        int[] numbers = {1,2,3,4,5,6};
        System.out.println(total(numbers));

        int[] numbers2 = {10,20,30,40,50,60,70,80,90,100};
        System.out.println(total(numbers2));

    }

    //Creamos metodos con argumentos variables
    public static int total(int ... nums){
        //El "..." permite enviarle una cantidad de datos (del mismo tipo), sin limitar la cantidad de datos que
        //se le pueden enviar
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
        }
        return sum;
    }

    //Metodo estático

}
