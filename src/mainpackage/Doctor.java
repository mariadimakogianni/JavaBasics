package mainpackage;

public class Doctor extends Users{
    private String specialty;

    public String getSpecialty() {
        return specialty;
    }
    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public Doctor(String username, String name, String surname, String password, String userType, String specialty) {
        super(username, name, surname, password, userType);
        this.setSpecialty(specialty);
    }

    public void InsertAvailAppointments(){
        System.out.println("yayyy");
    }
    public void MonthAppointments(){
        System.out.println("yayyy2");
    }
}
