package Herencia;

public class People {
    //Variables
    private int idPersona;
    private String name;
    private char gender;
    private int age;
    private String direction;
    private String email;
    private static int peopleAmount; //Creo una variable estatica en la clase
    //Para irle sumandole la cantidad de personas que he ido aumentando, sin repetir el número


    //Constructors
    protected People(){
        name = "";
        gender = ' '; //Asi se inicializan las variables tipos CHAR, hay que usar ' ', no doble comillas
        age = 0;
        direction = "";
        email = "";
        idPersona = ++peopleAmount; //el "idPersona", será un número no repetido del contador
    }
    protected People(String _name){
        this();
        name = _name;
    }

    protected People(String _name, int _age){
        this();
        name = _name;
        age = _age;
        idPersona = ++peopleAmount;
    }

    protected People(String _name, char _gender, int _age, String _direction){
        this();
        name = _name;
        gender = _gender;
        age = _age;
        direction = _direction;
        idPersona = ++peopleAmount;
    }

    protected People(String _name, char _gender, int _age, String _direction, String _email){
        this();
        name = _name;
        gender = _gender;
        age = _age;
        direction = _direction;
        email = _email;
        idPersona = ++peopleAmount;
    }

    //Getter y Setters
    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public static int getPeopleAmount() {
        return peopleAmount;
    }

    public static void setPeopleAmount(int peopleAmount) {
        People.peopleAmount = peopleAmount;
    }


    //toString
    @Override
    public String toString() {
        return "People {" +
                "idPersona=" + idPersona +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", direction='" + direction + '\'' +
                '}';
    }

    //Methods
    public void whoAreYou(){
        System.out.println("Heredo de 'People'");
    }
}
