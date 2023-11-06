package clase06;

public class StringIndex {
    public static void main(String[] args) {
        String email = "john@oracle.com";
        String domain = "";
        //Buscando la cantidad de posiciones hasta llegar al @, contando el caracter del @
        int position = email.indexOf('@');
        domain = email.substring(position+1); //El +1 porque deseo lo que esta despues del @, no incluirlo
        System.out.println(domain);
    }
}
