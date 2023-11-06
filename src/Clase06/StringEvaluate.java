package clase06;

public class StringEvaluate {
    public static void main(String[] args) {
        String s1, s2, s3;

        //Compare To - devuelve "int"
        s1 = "abc";
        s2 = "cde";
        s3 = "ABC";
        System.out.println(s1.compareTo(s2)); //Son diferentes por los caracteres
        System.out.println(s1.compareTo(s3)); //Son diferentes por Minusc. y Mayusc.

        //Equals - devuelve "boolean"
        s1 = "abc";
        s2 = "ABC";
        s3 = "abc";
        System.out.println(s1.equals(s2)); //Son diferentes por Minusc. y Mayusc.
        System.out.println(s1.equals(s3)); //Son iguales

    }
}
