package Clase11;

import java.io.FileReader;
import java.io.IOException;

public class IOExceptionTest {
    public static void main(String[] args) {
        try{
            FileReader reader= new FileReader("text.txt");
            System.out.println("File found");
        } catch (IOException e){
            System.out.println("File not found");
        }
        //El IOException debe ser importado al código de programación

    }
}
