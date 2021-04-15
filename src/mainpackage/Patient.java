package mainpackage;

public class Patient extends Users{
    private String amka;


    public String getAmka() {

        return amka;
    }
    public void setAmka(String amka) {
        this.amka = amka;
    }

    public Patient(String username, String name, String surname, String password, String userType, String amka) {
        super(username, name, surname, password, userType);
        this.setAmka(amka);

    }

    public void Registration(){
        System.out.println(this.getUsername()+"has registered");
    }

    public void MakeAppointment(){
        System.out.println(this.getUsername()+"has made an appointment");
    }
    public void SearchAppointmentForDoctor(){
        System.out.println("appointments");
    }
    public void SearchForDoctor(){
        System.out.println("doctor");
    }
    public void PrintAppointments(){
        System.out.println("appointments");
    }
    public void AppointmentHistory(){
        System.out.println("appointments");
    }


}
