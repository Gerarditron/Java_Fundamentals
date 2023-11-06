package Clase07;

import java.util.Scanner;
public class StringChecker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = "";
        System.out.print("Enter your name: ");
        name = in.nextLine(); //con el "nextLine()" capturas el texto, independientemente tenga espacios o no

        //Las variables "String" no se comparan con ==, se hace con "EqualsTo"
        if(name.equals("Elvis")){
            System.out.println("You are the king of Rock an Roll!");
        }
        else if (name.equals("Michael Jackson")) {
            System.out.println("You are the king of Pop!");
        }
        else {
            System.out.println(name + ", You are not the king!");
        }

    }

}
