package clase06;

public class StringOperations {
    public static void main(String[] args) {
        String string1 = "Hello";
        String string2 = "Lisa";
        String string3 = ""; //Solo declara la variable, string vacio o NULL //Inicializando la variable
        string3 = "";
        string3 = "How are you ".concat(string2);
        System.out.println("String3: "+ string3);
        //get length
        System.out.println("Length: "+string1.length());
        //get substring beginning with character 0, up to, not including character 5
        System.out.println("Sub1: "+string3.substring(0,5)); //Empieza en el caracter 0 y NO agarra el caracter 5
        System.out.println("Sub2: "+string3.substring(5,10)); //Empieza en el caracter 5 y NO agarra el caracter 10
        //uppercase
        System.out.println("Upper: "+string3.toUpperCase());
        //lowercase
        System.out.println("Lower: "+string3.toLowerCase());

    } //End Method Main
} //End Class "StringOperations"
