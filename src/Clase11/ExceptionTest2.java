package Clase11;

public class ExceptionTest2 {

    public static void main(String[] args) {
        //Este ejemplo es un loop infinito
        int[] arreglo = {0,1,2,3,4,5,6,7,8,9};

        for(int i = 0; i < 11; i++){
            System.out.println(i);
            try {
                //i is the index of an array with length 10
                if(i > 9 || i < 0){
                    //System.out.println("Index " + i + " is out of bounds");
                    throw new Exception("Index " + i + " is out of bounds"); //Guardamos en la variable "e" el mensaje
                    //Me redirige directamente al CATCH y al error de la excepción
                }
            }catch (Exception e){
                System.out.println(e.toString()); //Imprimimos el error
                //Este codigo arregla el error
                if(i > 9)
                    i-=9;
                else
                    i+=9;
            }
        }
    }
}
