package PaqueteHerencia;

public class Animal {
    //Variables
    private int edad;
    private String nombre;
    private String genero;
    private String especie;

    //Constructores
    protected Animal(){
    }

    //Getter y Setter
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    //toString()

    @Override
    public String toString() {
        return "Animal{" +
                "edad=" + edad +
                ", nombre='" + nombre + '\'' +
                ", genero='" + genero + '\'' +
                ", especie='" + especie + '\'' +
                '}';
    }


    //Metodos




}
