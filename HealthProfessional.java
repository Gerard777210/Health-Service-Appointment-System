public class HealthProfessional {
    // Instance variables (ID, name, specialty area)
    private int id;
    private String name;
    private String specialtyArea; // Common attribute for all health professionals

    // Default constructor
    public HealthProfessional() {
        this.id = 0;
        this.name = "Unknown";
        this.specialtyArea = "General Health";
    }

    // Constructor to initialize all instance variables
    public HealthProfessional(int id, String name, String specialtyArea) {
        this.id = id;
        this.name = name;
        this.specialtyArea = specialtyArea;
    }

    // Method to print all instance variables
    public void printDetails() {
        System.out.println("Health Professional ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Specialty Area: " + specialtyArea);
    }

    // Getter methods (for access by subclasses and Appointment class)
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSpecialtyArea() {
        return specialtyArea;
    }
}