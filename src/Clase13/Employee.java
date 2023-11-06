package Clase13;

public class Employee {
    private String lastName;
    private String firstName;

    private String name;
    private double rating;

    //Constructor
    Employee(){
        rating = 0.0;
        name = "";
        firstName = "";
        lastName = "";
    }
    Employee(String _lastName, String _firstName){
        this(); //Inicializamos las variables
        firstName = _firstName;
        lastName = _lastName;

    }
    public Employee(String _name, int _rating){
        name = _name;
        rating = _rating;
    }

    //Getter
    public double getRating() {
        return rating;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    //Setter
    public void setRating(double rating) {
        this.rating = rating;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    //toString


    @Override
    public String toString() {
        return "Employee {" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", rating=" + rating +
                '}';
    }

    //Metodos
    public void newEmployee(String _name, double _rating){
        this.name = _name;
        this.rating = _rating;

    }


}
