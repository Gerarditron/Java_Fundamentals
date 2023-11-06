package Clase09;

public class Vehiculo {
    //Declaración de Variables
    public String marca = "";
    public String modelo = "";
    public int anio = 0;
    public String tipo  = "";

    //Constructores
    Vehiculo(){
    }

    Vehiculo(String _marca, String _modelo, String _tipo, int _anio){

        if (_marca != "" && _marca.isBlank()){
            System.out.println("Porfavor digite una Marca");
        } else if (_modelo != "" && _modelo.isBlank()) {
            System.out.println("Porfavor digite un Modelo");
        } else if (_tipo != "" && _tipo.isBlank()) {
            System.out.println("Porfavor digite una marca");
        } else if (_anio == 0) {
            System.out.println("Porfavor digite un año");
        } else { //No hay errores en la digitacion
            marca = _marca;
            modelo = _modelo;
            tipo = _tipo;
            anio = _anio;
        }


    }

}
