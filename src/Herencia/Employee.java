package Herencia;

public class Employee extends People{

    //Variables
    private int idEmployee;
    private double salary;
    private String category;
    private static int employeeCounter;


    //Constructores
    public Employee(){
        super(); //Inicializamos las variables dentro de la clase SUPERCLASE
        salary = 0.0;
        category = "";
        idEmployee = ++employeeCounter;
    }
    public Employee(String _name, double _salary){
        //Super debe ser la primera linea
        super(_name); //Con esta SINTAXIS, estoy invocando el constructor de la superclase PEOPLE
        //Si le agrego más parametros, invocaría constructores que tengan más parametros
        category = "";
        salary = _salary;
        idEmployee = ++employeeCounter;
    }

    public Employee(String _name, int _age, double _salary){
        super(_name, _age); //Con esta SINTAXIS, estoy invocando el constructor de la superclase PEOPLE con 2 parametros
        idEmployee = ++employeeCounter;
        salary = _salary;
    }

    public Employee(String _name, char _gender, int _age, String _direction, String _email, double _salary, String _category){
        super(_name, _gender, _age, _direction, _email);
        category = _category;
        salary = _salary;
        idEmployee = ++employeeCounter;
    }

    //Getter y Setter
    public int getidEmployee() {
        return idEmployee;
    }

    public void setidEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static int getEmployeeCounter() {
        return employeeCounter;
    }

    public static void setEmployeeCounter(int employeeCounter) {
        Employee.employeeCounter = employeeCounter;
    }

    //toString


    @Override
    public String toString() {
        return super.toString() +
                "\n -> \tEmployee {" +
                "idEmployee=" + idEmployee +
                ", salary=" + salary +
                '}';
    }

    //Method
    public void whoAreYou(){
        System.out.println("Soy una Instancia 'Employee'");
        super.whoAreYou();
    }

}
