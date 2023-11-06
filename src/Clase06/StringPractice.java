package clase06;
import java.util.Scanner;
public class StringPractice {
    public static void main(String[] args) {
        //Ambos objetos están creando lo mismo
        /*
        String s1 = new String("abc"); //New Operator //Esto se puede hacer porque String es un objeto
        String s2 = "abc"; //String literals
        */

        //Ejemplo 1
        /*
        String name, name2;
        name = "Mya";
        name2 = "Mya";
        */

        //Ejemplo 2 - Solicitamos al usuario la informacion
        /*
        Scanner in = new Scanner(System.in);
        String name, name2;
        System.out.println("Digite su nombre: ");
        name = in.next(); //Se usa la funcion de la clase de Scanner para solicitar información al usuario
        System.out.println("Digite su apellido: ");
        name2 = in.next();
        System.out.println("name: "+name);
        System.out.println("name2: "+name2);
        */

        //Concatenar dos Strings
        String s1, s2, s3, s4, s5, s6;
        s1 = "This is a ";
        s2 = "string";
        s3 = s1 + s2;
        s4 = "This is a " + s2;
        System.out.println("s1: "+ s1);
        System.out.println("s2: "+ s2);
        System.out.println("s3: "+ s3);
        System.out.println("s4: "+ s4);
        s1 += s2; //Otra manera de concatenar c:
        System.out.println("s1 upd.: "+ s1);

        s5 = "Prueba1";
        s6 = s5;
        System.out.println("s5: "+s5);
        System.out.println("s6: "+s6);
        s5 = "Prueba2";
        System.out.println("s5: "+s5);
        System.out.println("s6: "+s6); //Como podemos notar, este no se actualiza en las lineas anteriores


    }//End Method Main
}//End class StringPractice
