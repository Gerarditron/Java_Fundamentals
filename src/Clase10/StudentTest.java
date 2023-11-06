package Clase10;

public class StudentTest {
    public static void main(String[] args) {
        String[] studentNames = {"Alejandro", "Boris", "Camila", "Daniela","Esmeralda",
                                    "Gerardo","Herbet","Irlanda","Julieta","Kenia",
                                    "Luisa","Maria","Norma","Osiris","Pamela"};
        Student[][] groups = new Student[3][5];
        int x = 0;

        //Ingresando datos
        for(int i = 0; i < groups.length; i++){
            for(int j = 0; j < groups[i].length; j++){
                String name = studentNames[x];
                groups[i][j] = new Student(name);
                x++;
            }
        }

        System.out.println(groups[0][0].getName());
        groups[0][0].setName("Alejandra");
        System.out.println(groups[0][0].getName());

        //Leyendo datos
        for(int i = 0; i < groups.length; i++){
            for(int j = 0; j < groups[i].length; j++){
                System.out.println(groups[i][j]);
            }
        }


    }


}
