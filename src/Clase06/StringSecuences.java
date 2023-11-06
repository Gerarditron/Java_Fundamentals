package clase06;

public class StringSecuences {
    public static void main(String[] args) {

        //Uso de la pleca \ para hacer que lo malinterprete el compilador
        String s1 = "This is an example of an escape. \n And now we're on a new line. \n \t This is a tab.";
        String s2 = "\"This is a quote \"";
        String s3 = "\"This is a quote \"";
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        //Metodo compareTo (el metodo compareTo, siempre regresara un entero)
        int s1Compare = s1.compareTo(s2);
        int s2Compare = s2.compareTo(s1);
        int s3Compare = s3.compareTo(s2);
        System.out.println("Comparación: " + s1Compare);
        System.out.println("Comparación2: " + s2Compare);
        System.out.println("Comparación3: " + s3Compare);

        //Metodo equalsTo (el metodo equalsTo, siempre regresara un boolean)
        boolean s1Equals = s1.equals(s2);
        boolean s2Equals = s1.equals(s3);
        boolean s3Equals = s2.equals(s3);
        System.out.println("Equals: " + s1Equals);
        System.out.println("Equals2: " + s2Equals);
        System.out.println("Equals3: " + s3Equals);




    }
}
