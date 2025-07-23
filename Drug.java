import java.io.Serializable;

public class Drug implements Serializable {
    // Class variables
    private int drugID;
    private String drugName;
    private double drugCost;
    private double dosage;

    // Constructor
    public Drug(int id, String name, double cost, double dosage) {
        this.drugID = id;
        this.drugName = name;
        this.drugCost = cost;
        this.dosage = dosage;
    }

    // Getters
    public int getDrugID() {
        return drugID;
    }

    public String getDrugName() {
        return drugName;
    }

    public String getDrugCost() {
        return "$" + drugCost;
    }

    public String getDosage() {
        return dosage + "mg";
    }

    // Setters
    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public void setDrugCost(double drugCost) {
        this.drugCost = drugCost;
    }

    public void setDosage(double dosage) {
        this.dosage = dosage;
    }

    // Methods
    public String toString() {
        return String.format("(ID: %d, Name: %s, Cost: $%.2f, Dosage: %.2fmg)", this.drugID, this.drugName, this.drugCost, this.dosage);
    }
}
