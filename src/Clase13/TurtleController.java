package Clase13;

public class TurtleController {
    public static void main(String[] args) {

        Turtle tortuga1 = new Turtle(5);
        Turtle tortuga2 = new Turtle(3);

        System.out.println(tortuga1);
        System.out.println(tortuga2);

        //Mando a llamar el nombre de la clase directamente, no necesito crear una nueva instancia
        //Viene directo del nombre de la clase "Turtle"
        System.out.println("I feed '" + Turtle.food + "' to all of my Turtles!"); //FORMA CORRECTA DE IMPRIMIR VARIABLES ESTATICAS FUERA DE LA CLASE
        System.out.println("I feed '" + tortuga1.food + "' to all of my Turtles!"); //FORMA INCORRECTA DE IMPRIMIR VARIABLES ESTATICAS FUERA DE LA CLASE

        //Fuera de la clase, para llamar un valor estatico, se usa EL NOMBRE DE LA CLASE
        //Dentro de la clase, para llamar un valor estatico, se usa THIS.

    }

}
