package PaqueteHerencia;

public class Cangrejo extends Animal{
    //Variables
    private String color;
    private double peso;
    private String habitat;

    //Constructor
    public Cangrejo(){
        color = "";
        peso = 0.0;
        habitat = "";
        //Estos metodos son accesibles desde la superclase Animal, no hay porque repetirlas aqui
        setEdad(0);
        setGenero("");
        setNombre("");
        setEspecie("");
    }

    public Cangrejo(String _color, double _peso, String _habitat, int _edad, String _genero, String _nombre, String _especie){
        this();
        color = _color;
        peso = _peso;
        habitat = _habitat;
        setEdad(_edad);
        setGenero(_genero);
        setNombre(_nombre);
        setEspecie(_especie);
    }

    //Getter y Setter
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    //toString()
    @Override
    public String toString() {
        return super.toString() +
                "->\n\tCangrejo {" +
                "color='" + color + '\'' +
                ", peso=" + peso +
                ", habitat='" + habitat + '\'' +
                '}';
    }

    //Metodos

}
