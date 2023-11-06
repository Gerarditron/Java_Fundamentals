package Herencia;

import java.util.Date;
public class Client extends People {
    //Variables
    private int idClient;
    private java.util.Date registrationDate; //Variable tipo DATE, se debe importar
    private boolean vip; //Variable por defecto inicializado como false
    private static int clientCounter;

    //Constructor
    public Client(){
        super(); //Inicializamos las variables dentro de la clase SUPERCLASE
        idClient = ++clientCounter;
        vip = false;
    }

    public Client(Date _registrationDate, boolean _vip){
        super();
        registrationDate = _registrationDate;
        vip = _vip;
        idClient = ++clientCounter;
    }

    //Getter y Setter
    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public static int getClientCounter() {
        return clientCounter;
    }

    public static void setClientCounter(int clientCounter) {
        Client.clientCounter = clientCounter;
    }

    //toString
    @Override
    public String toString() {
        return super.toString() +
                "\n -> \tClient {" +
                "idClient=" + idClient +
                ", registrationDate=" + registrationDate +
                ", vip=" + vip +
                '}';
    }

    //Metodos
    @Override
    public void whoAreYou(){
        System.out.println("Soy una Instancia Cliente");
        super.whoAreYou();
    }


}
