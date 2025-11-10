public class Cardiologist extends HealthProfessional {
    // Unique instance variable: cardiology certification level
    private String cardioCertificationLevel;

    // Default constructor
    public Cardiologist() {
        super();
        this.cardioCertificationLevel = "Unknown";
    }

    // Constructor to initialize all instance variables (including parent class attributes)
    public Cardiologist(int id, String name, String specialtyArea, String cardioCertificationLevel) {
        super(id, name, specialtyArea);
        this.cardioCertificationLevel = cardioCertificationLevel;
    }

    // Print detailed information (including type and all attributes)
    public void printHealthProfessionalDetails() {
        System.out.println("The health professional details are:");
        System.out.println("Type: Cardiologist");
        printDetails(); // Call parent class method
        System.out.println("Cardiology Certification Level: " + cardioCertificationLevel);
        System.out.println();
    }

    // Getter method
    public String getCardioCertificationLevel() {
        return cardioCertificationLevel;
    }
}