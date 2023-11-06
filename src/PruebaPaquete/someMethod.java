package pruebaPaquete;

public class someMethod {
    public static void main(String[]args) {
        //someMethod1();
        someMethod2();

    }

    //Ejemplo 1 en el ambito de las variables
    public void someMethod1(){
        Integer gameOver = 0;
        Integer score = 0;
        Integer highScore = 10;

        if(gameOver + score > highScore){
            String name;    //Point A
            System.out.println("Please enter your name:");
            //name = reader.next();

        } //end if          //Point B


        //System.out.println("Thank you " + name + ", "); //Da error porque la variable se creo dentro del IF
        System.out.println("Your high score has been saved.");

        } //End Method, someMethod1()


    //Ejemplo 2 en el ambito de las variables
    public static void someMethod2() {
        Integer gameOver = 0;
        Integer score = 0;
        Integer highScore = 10;

        String name;    //Point A
        name = "Gerardo";
        if (gameOver + score > highScore) {

            System.out.println("Please enter your name:");
            //name = reader.next();

        } //end if          //Point B

        System.out.println("Thank you " + name + ", "); //Da error porque la variable no se ha declarado aún
        System.out.println("Your high score has been saved.");

    } //End Method, someMethod2()
}
