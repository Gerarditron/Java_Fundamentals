package Herencia;

import java.util.Date;

public class HerencyTest {
    public static void main(String[] args) {
        //EMPLEADOS DE LA SUPERCLASE PERSONA
        System.out.println("\nInstanciamos 2 Objetos\\Persona: Empleado");

        Employee e1 = new Employee("Juan",2500);
        System.out.println(e1);

        Employee e2 = new Employee("Pedro",15000); //Agregamos valores a la SUBCLASE
        //Agregamos valores a la SUPERCLASE
        e2.setAge(28);
        e2.setGender('M'); //Entre corchetes ', porque es un CHAR
        e2.setDirection("Bogota, Colombia");
        System.out.println(e2);

        System.out.println("");

        //CLIENTES DE LA SUPERCLASE PERSONA
        System.out.println("\nInstanciamos 2 Objetos\\Persona: Cliente");

        Client c1 = new Client(new Date(), false);
        System.out.println(c1);
        //new Date(), me regresa la fecha de hoy
        // El resultado de ese constructor me regresa de un solo la fecha

        c1.setName("Karla");
        c1.setAge(22);
        c1.setGender('F');
        c1.setDirection("Mexico, DF");
        System.out.println(c1);

        Client c2 = new Client(new Date(), false);
        System.out.println(c2);

        c2.setName("Felipe");
        c2.setAge(25);
        c2.setGender('M');
        c2.setDirection("Tegucigalpa, Honduras");
        System.out.println(c2);

        //Imprimimos datos de prueba
        System.out.println(""); //un salto de linea
        e1.whoAreYou();
        System.out.println("");
        c1.whoAreYou();
        System.out.println("");

        System.out.println("Instancias Creadas: ");
        System.out.println("Instancias de Cliente: " + Client.getClientCounter()); //Variables Estatica
        System.out.println("Instancias de Empleado: " + Employee.getEmployeeCounter()); //Variables Estatica
        System.out.println("TOTAL INSTANCIAS PERSONAS: " + People.getPeopleAmount()); //Variable Estatica

        //PROFESORES DE LA SUPERCLASE EMPLEADOS
        System.out.println("");
        Professor profe1 = new Professor("Gerardo",'M',22,"San Salvador, El Salvador", "gerardo@correo.com", 700.00,
                "Matematicas","Fisica","Programacion","Matutino",2028);
        System.out.println(profe1);
        profe1.whoAreYou();

    }
}
