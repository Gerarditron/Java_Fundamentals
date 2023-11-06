package clase06;

public class StringCompare {
    public static void main(String[] args) {
        //Comparacion de string
        String s1, s2, s3, s4, s5;
        s1 =  "This is a String.";
        s2 = new String("This is a String.");
        s3 = "String.";
        s4 = "This is a " + s3;
        s5 = s1;

        System.out.println("s1: \""+s1+ "\" == s2: \"" +s2+"\"");
        System.out.println(s1 == s2);
        System.out.println("\n");

        System.out.println("s1: \""+s1+ "\" == s4: \"" +s4+"\"");
        System.out.println(s1 == s4);
        System.out.println("\n");

        System.out.println("s1: \""+s1+ "\" == s5: \"" +s5+"\"");
        System.out.println(s1 == s5);


    }
}
