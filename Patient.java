import java.time.LocalDate;

public class Patient {
    // Class variables
    private int patientID;
    private String patientFirstName;
    private String patientLastName;
    private LocalDate patientDoB;


    // Constructor
    public Patient(int id, String fn, String ln, LocalDate dob) {
        this.patientID = id;
        this.patientFirstName = fn;
        this.patientLastName = ln;
        this.patientDoB = dob;
    }

    // Getters
    public int getPatientID() {
        return patientID;
    }

    public String getPatientFirstName() {
        return patientFirstName;
    }

    public String getPatientLastName() {
        return patientLastName;
    }

    public LocalDate getPatientDoB() {
        return patientDoB;
    }

    // Setters
    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public void setPatientFirstName(String patientFirstName) {
        this.patientFirstName = patientFirstName;
    }

    public void setPatientLastName(String patientLastName) {
        this.patientLastName = patientLastName;
    }

    public void setPatientDoB(LocalDate patientDoB) {
        this.patientDoB = patientDoB;
    }

    // Methods
    public String toString() {
        return String.format("ID: %d, Name: %s %s, DoB: %S", this.patientID, this.patientFirstName, this.patientLastName, this.patientDoB.toString());
    }
}
