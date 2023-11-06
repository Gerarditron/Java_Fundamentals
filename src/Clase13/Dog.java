package Clase13;

public class Dog {
    private int weight;
    private int age;
    private String barkNoise;
    private int loudness;

    public Dog(){
        weight = 12;
        loudness = 44;
        barkNoise = "Woof";
    }

    public Dog(int _weight, int _loudness){
        weight = _weight;
        loudness = _loudness;
        barkNoise = "ARF!";
    }

    public Dog(int _weight, int _loudness, String _barkNoise){
        weight = _weight;
        loudness = _loudness;
        barkNoise = _barkNoise;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBarkNoise() {
        return barkNoise;
    }

    public void setBarkNoise(String barkNoise) {
        this.barkNoise = barkNoise;
    }

    public int getLoudness() {
        return loudness;
    }

    public void setLoudness(int loudness) {
        this.loudness = loudness;
    }

    @Override
    public String toString() {
        return "Dog {" +
                "weight=" + weight +
                ", age=" + age +
                ", barkNoise='" + barkNoise + '\'' +
                ", loudness=" + loudness +
                '}';
    }

    //Metodos
    public void bark(String b){
        System.out.println(b);
    }
    public void bark(){
        System.out.println("Woof!");
    }



}
