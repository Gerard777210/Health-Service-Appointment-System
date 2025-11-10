public class GeneralPractitioner extends HealthProfessional {
    // Unique instance variable: practice qualification certificate number
    private String practiceCertNumber;

    // Default constructor
    public GeneralPractitioner() {
        super();
        this.practiceCertNumber = "Unknown";
    }

    // Constructor to initialize all instance variables (including parent class attributes)
    public GeneralPractitioner(int id, String name, String specialtyArea, String practiceCertNumber) {
        super(id, name, specialtyArea);
        this.practiceCertNumber = practiceCertNumber;
    }

    // Print detailed information (including type and all attributes)
    public void printHealthProfessionalDetails() {
        System.out.println("The health professional details are:");
        System.out.println("Type: General Practitioner");
        printDetails(); // Call parent class method
        System.out.println("Practice Certificate Number: " + practiceCertNumber);
        System.out.println();
    }

    // Getter method
    public String getPracticeCertNumber() {
        return practiceCertNumber;
    }
}