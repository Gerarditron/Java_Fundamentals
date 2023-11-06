package pruebaPaquete;

public class Volume {

    public static void main(String[] args) {
        double height = 4, radius = 10, volume = 0;
        circleVolume(height, radius, volume);
        numberTest();
        charSaveObject();
    }

    public static void circleVolume(Double h, Double r, Double total){
        //total = 1/3*3.1416*r*r*h; //Este valor da error porque el numeral en la division es "Entero"
        total = 1.0/3*3.1416*r*r*h; //Ahora no dara error porque el numeral en la division tambien es "Decimal"
        System.out.println("The volume is: "+total+".");
    }

    public static void numberTest(){
        //Intenger number
        //number = Math.random()*10; //Este da error porque la variables es "Integer"
        double number1, number2, number3;
        number1 = Math.random()*10.0; //Este no da error porque la variable ahora es "Double"
        number2 = Math.random();//*10.0; //El Math.random() regresa solo valores de numeros entre 0 y 0.99
        System.out.println("The random number1 is: " + number1);
        System.out.println("The random number2 is: " + number2);
        //Convirtiendo de "double" a "int"
        number3 = (int)(Math.random()*10);
        System.out.println(number3); //No aproxima, trunca solo el valor antes del .
    }

    public static void charSaveObject(){
        int number;
        Object o;
        char firstInitial = 'A';
        number = (int)firstInitial;
        o = (Object) firstInitial;
        System.out.println("char: "+ firstInitial);
        System.out.println("number: "+ number);
        System.out.println("Object: "+ o); /*Cuando convierto la variable a un objeto,
        puedo hacer uso de muchas funciones que tienen los objetos*/
        System.out.println("Object Length: "+o.toString().length());
    }


}
