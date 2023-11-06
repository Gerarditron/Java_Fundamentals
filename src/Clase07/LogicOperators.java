package Clase07;

public class LogicOperators {
    public static void main(String[] args) {
        int numberDaysAbsent = 0;
        int grade = 76;
        boolean madeHonorRoll = grade >= 88; //guarda un TRUE

        //Si no tienes Dias de Ausencia y tus notas son dignas del Rol Honorífico, CALIFICAS PARA LA BECA
        if (madeHonorRoll && numberDaysAbsent == 0) //La primera evaluación está evaluando un valor TRUE
            System.out.println("You qualify for the scholarship");
        else
            System.out.println("You don't qualify for the scholarship");

        //En este ejemplo, como es una sola linea de codigo no es necesario poner llaves
        //Cuando sean más lineas de código, si se utilizan llaves


    }
}
