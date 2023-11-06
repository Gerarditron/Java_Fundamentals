package pruebaPaquete;

public class IncrementDecrement {
    public static void main(String[] args) {
        int x = 5;
        increment(x);
        decrement(x);
    }

    //Metodo para incrementar
    public static void increment(Integer x){
        int a = x;
        int b = x;
        int totalIncremento = 0;

        //Pre-incremento
        ++a; //a=6
        totalIncremento = ++a; //total=7
        System.out.println("Pre-Incremento: " + totalIncremento);

        //Post-incremento
        b++; //b=6
        totalIncremento = b++; //total=6
        System.out.println("Post-Incremento: " + totalIncremento);

    }

    //Metodo para decrementar
    public static void decrement(Integer x){
        int a = x;
        int b = x;
        int totalDecrement = 0;

        //Pre-incremento
        --a; //a=4
        totalDecrement = --a; //total=3
        System.out.println("Pre-Decremento:" + totalDecrement);

        //Post-incremento
        b--; //b=4
        totalDecrement = b--; //total=4
        System.out.println("Post-Decremento:" + totalDecrement);

    }



}
