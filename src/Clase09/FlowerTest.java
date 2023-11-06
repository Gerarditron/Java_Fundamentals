package Clase09;

public class FlowerTest {
    public static void main(String[] args) {
        //Declaración de un arreglo - Ejemplo 4 - Guardando INSTANCIAS
        Flower[] myBouquet = {new Flower("Rose"), new Flower("Sunflower"),
                                new Flower("Daisy"), new Flower("Dandelion"),
                                new Flower("Violet"), new Flower("Lily")};

        System.out.println(myBouquet[0]);//Regresa el valor de la CLASE OBJETO
        System.out.println(myBouquet[0].categoryName); //Regresa el valor dentro de la variable que he definido
    }

}
