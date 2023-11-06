package Herencia;

public class Administrative extends Employee{
    //Variables
    private int idAdministrative;
    private String cargo;
    private String departament;
    private String ISSS;
    private String AFP;
    private String DUI;
    private int administrativeCounter;

    //Constructor
    public Administrative(String _name, char _gender, int _age, String _direction, String _email, double _salary,
                          String _cargo, String _departament, String _ISSS, String _AFP, String _DUI) {
        super(_name, _gender, _age, _direction, _email, _salary, "administrative");
        this.cargo = _cargo;
        this.departament = _departament;
        this.ISSS = _ISSS;
        this.AFP = _AFP;
        this.DUI = _DUI;
        this.idAdministrative = ++administrativeCounter;
    }

    //Getter y Setter
    public int getIdAdministrative() {
        return idAdministrative;
    }

    public void setIdAdministrative(int idAdministrative) {
        this.idAdministrative = idAdministrative;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDepartament() {
        return departament;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }

    public String getISSS() {
        return ISSS;
    }

    public void setISSS(String ISSS) {
        this.ISSS = ISSS;
    }

    public String getAFP() {
        return AFP;
    }

    public void setAFP(String AFP) {
        this.AFP = AFP;
    }

    public String getDUI() {
        return DUI;
    }

    public void setDUI(String DUI) {
        this.DUI = DUI;
    }

    public int getAdministrativeCounter() {
        return administrativeCounter;
    }

    public void setAdministrativeCounter(int administrativeCounter) {
        this.administrativeCounter = administrativeCounter;
    }

    //toString

    @Override
    public String toString() {
        return super.toString() +
                "\n -> \tAdministrative {" +
                "idAdministrative=" + idAdministrative +
                ", cargo='" + cargo + '\'' +
                ", departament='" + departament + '\'' +
                ", ISSS='" + ISSS + '\'' +
                ", AFP='" + AFP + '\'' +
                ", DUI='" + DUI + '\'' +
                ", administrativeCounter=" + administrativeCounter +
                '}';
    }

    //Method
    @Override
    public void whoAreYou(){
        System.out.println("Soy una Instancia 'Administrative'");
        super.whoAreYou();
    }


}
