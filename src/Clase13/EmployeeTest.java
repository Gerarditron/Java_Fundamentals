package Clase13;

public class EmployeeTest {
    public static void main(String[] args) {
        //Guardando los nuevos empleados
        System.out.println("---- Ejemplo 1 ----");
        Employee empl1 = new Employee();
        Employee empl2 = new Employee();
        Employee empl3 = new Employee();

        empl1.newEmployee("Gerardo", 9.75);
        empl2.newEmployee("Jose", 6.58);
        empl3.newEmployee("Ricardo", 8.52);

        //Comparando empleados
        Employee winner = promotion(empl1, empl2);
        System.out.println("The employee that deserves the promotion is: "+ winner.getName() + "\n with a score of: "+winner.getRating());
        System.out.println();

        System.out.println("---- Ejemplo 2 ----");
        Employee e1 = new Employee("Smith", "Mary");
        e1.setRating(9.65);
        Employee e2 = new Employee("Jones","Sally");
        e2.setRating(5.13);
        System.out.println(e1);
        System.out.println(e2);

    }

    //Metodos (nunca olvidar que las funciones dentro de la clase Controlador siempre llevan "static")
    public static Employee promotion(Employee... employees) {
        //Calculate what employee is better
        Employee bestCandidate = employees[0];
        for (int i = 1; i < employees.length; i++) {
            if (employees[i].getRating() > bestCandidate.getRating()) {
                bestCandidate = employees[i];
            }
        }

        return bestCandidate;
    }

}
