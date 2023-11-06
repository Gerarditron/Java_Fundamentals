package Clase07;

public class LogicalOperators2 {
    public static void main(String[] args) {
        double grade = 65;
        int numDaysAbsent = 2;
        boolean madeHonorRoll = grade >= 88; //Guardamos la comparacion, es decir el FALSE
        if(!madeHonorRoll && numDaysAbsent < 3){ //TRUE y menos de 3 dias de ausencia
            System.out.println("You qualify for free tutoring help.");
        }
        if(grade > 70 && numDaysAbsent < 5) {
            System.out.println("You may try out for the sports team.");
        }


    }
    //En este ejemplo hacemos uso de dos "if's" por separado, por lo tanto, podría ser posible que se ejecuten ambos

}
