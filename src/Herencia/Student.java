package Herencia;

public class Student extends People{
    //Variables
    private int idStudent;
    private String level;
    private String subject;
    private String course;
    private double grade1;
    private double grade2;
    private double grade3;
    private double averageGrade;
    private boolean repeating;
    private static int studentCounter;

    //Constructores
    Student(){
        super();
        level = "";
        subject = "";
        course = "";
        grade1 = 0.0;
        grade2 = 0.0;
        grade3 = 0.0;
        averageGrade = 0.0;
        repeating = false;
        idStudent = ++studentCounter;
    }



    //Getter y Setters
    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public double getGrade1() {
        return grade1;
    }

    public void setGrade1(double grade1) {
        this.grade1 = grade1;
    }

    public double getGrade2() {
        return grade2;
    }

    public void setGrade2(double grade2) {
        this.grade2 = grade2;
    }

    public double getGrade3() {
        return grade3;
    }

    public void setGrade3(double grade3) {
        this.grade3 = grade3;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }

    public boolean isRepeating() {
        return repeating;
    }

    public void setRepeating(boolean repeating) {
        this.repeating = repeating;
    }

    public static int getStudentCounter() {
        return studentCounter;
    }

    public static void setStudentCounter(int studentCounter) {
        Student.studentCounter = studentCounter;
    }

    //toString

    @Override
    public String toString() {
        return  super.toString() +
                "\n -> \tStudent {" +
                "idStudent=" + idStudent +
                ", level='" + level + '\'' +
                ", subject='" + subject + '\'' +
                ", course='" + course + '\'' +
                ", grade1=" + grade1 +
                ", grade2=" + grade2 +
                ", grade3=" + grade3 +
                ", averageGrade=" + averageGrade +
                ", repeating=" + repeating +
                '}';
    }


    //Metodos
    @Override
    public void whoAreYou(){
        System.out.println("Soy una Instancia Estudiante");
        super.whoAreYou();
    }
}
