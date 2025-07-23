public class Drug {
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

    public double getDrugCost() {
        return drugCost;
    }

    public double getDosage() {
        return dosage;
    }

    // Setters
    public void setDrugID(int drugID) {
        this.drugID = drugID;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public void setDrugCost(double drugCost) {
        this.drugCost = drugCost;
    }

    public void setDosage(double dosage) {
        this.dosage = dosage;
    }
}
