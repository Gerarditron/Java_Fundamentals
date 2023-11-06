package Herencia;

public class Professor extends Employee{
    //Variables
    private int idProfessor;
    private String subject1;
    private String subject2;
    private String subject3;
    private String schedule;
    private int hiringYear;
    private static int professorCounter;

    //Constructores
    Professor(){
        super();
        subject1 = "";
        subject2 = "";
        subject3 = "";
        schedule = "";
        idProfessor = ++professorCounter;
    }
    Professor(String _name, char _gender, int _age, String _direction, String _email, double _salary,
               String _subject1, String _subject2, String _subject3, String _schedule, int _hiringYear){
        super(_name, _gender, _age, _direction, _email, _salary, "professor");
        subject1 = _subject1;
        subject2 = _subject2;
        subject3 = _subject3;
        schedule = _schedule;
        hiringYear = _hiringYear;
        idProfessor = ++professorCounter;
    }

    //Getter y Setter
    public int getIdProfessor() {
        return idProfessor;
    }

    public void setIdProfessor(int idProfessor) {
        this.idProfessor = idProfessor;
    }

    public String getsubject1() {
        return subject1;
    }

    public void setsubject1(String subject1) {
        this.subject1 = subject1;
    }

    public String getsubject2() {
        return subject2;
    }

    public void setsubject2(String subject2) {
        this.subject2 = subject2;
    }

    public String getsubject3() {
        return subject3;
    }

    public void setsubject3(String subject3) {
        this.subject3 = subject3;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public int getHiringYear() {
        return hiringYear;
    }

    public void setHiringYear(int hiringYear) {
        this.hiringYear = hiringYear;
    }

    public static int getProfessorCounter() {
        return professorCounter;
    }

    public static void setProfessorCounter(int professorCounter) {
        Professor.professorCounter = professorCounter;
    }

    //toString
    @Override
    public String toString() {
        return super.toString() +
                "\n -> \tProfessor {" +
                "idProfessor=" + idProfessor +
                ", subject1='" + subject1 + '\'' +
                ", subject2='" + subject2 + '\'' +
                ", subject3='" + subject3 + '\'' +
                ", schedule='" + schedule + '\'' +
                ", hiringYear=" + hiringYear +
                '}';
    }

    //Methods
    @Override
    public void whoAreYou(){
        System.out.println("Soy una Instancia 'Professor'");
        super.whoAreYou();
    }
}
