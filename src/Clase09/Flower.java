package Clase09;

public class Flower {
    //Declarando variables de la clase, que después llenamos con constructores
    String categoryName;
    String color;
    int amount;

    //Constructor - puede haber varios, pero con el mismo nombre y cambian sus tipos de datos/ cantida de datos
    Flower(String _categoryName){
        categoryName = _categoryName;
    }

    Flower(String _categoryName, String _color){
        categoryName = _categoryName;
        color = _color;
    }


}
