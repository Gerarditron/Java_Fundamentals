package Clase13;

public class Turtle {
    //Declaración de Variables
    public static String food = "Tortillas"; //Variable estática, porque será la misma para todas las instancias
    private int age;
    private int tankNum; //Num. del estanque
    private static int numTanks = 3; //Cant. de estanques existentes

    //Constructores
    public Turtle() {
        age = 0;
    }

    public Turtle(int _age) {
        this();
        age = _age;
        tankNum = (int) ((Math.random() * numTanks) + 1);
        //El constructor le agrega de manera aleatoria un estanque
        // el "random()" solo regresa valores entre 0 y 1, por eso al final le suma 1... para que regrese un valor mayor a 0
        // pero la respuesta que devuelve, sera "decimal" por lo tanto, no puedo tener un estanque llamado "3.4",
        // asi que lo convierto a "int", para guardar a mi tortuga en el estanque de numero "3".
    }


    //Getter y Setter
    public static String getFood() {
        return food;
    }

    public static void setFood(String food) {
        Turtle.food = food;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTankNum() {
        return tankNum;
    }

    public void setTankNum(int tankNum) {
        this.tankNum = tankNum;
    }

    public static int getNumTanks() {
        return numTanks;
    }

    public static void setNumTanks(int numTanks) {
        Turtle.numTanks = numTanks;
    }

    //toString
    @Override
    public String toString() {
        return "Turtle [" +
                "alimento=" + this.food + //usamos "this." porque estamos dentro de la clase referenciando el valor, dentro de la clase
                "]{" +
                "age=" + age +
                '}';
    }

    //Metodos
    public void swim(){

    }

    public static String fishTank() {
        return "I have " + numTanks + " fish tanks.";
    }



}
