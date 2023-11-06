package Clase10;

public class Student {
    //Variables
    private String name="";

    //Constructores
    Student(){
    }

    Student(String _name){
        name = _name;
    }

    //Get y Set - para un valor usualmente
    //Para variable debe tener un GET y un SET respectivamente
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    //Con el @Override toString() puedo devolver todos los variables de la clase solo con mencionar la clase/arreglo
    @Override
    public String toString() {
        return "name: " + name;
    }


}
