public class Appointment {
    // Instance variables
    private String patientName;
    private String patientMobile;
    private String timeSlot;
    private HealthProfessional selectedDoctor; // Polymorphic reference: can point to any subclass object of HealthProfessional

    // Default constructor
    public Appointment() {
        this.patientName = "Unknown";
        this.patientMobile = "Unknown";
        this.timeSlot = "Unknown";
        this.selectedDoctor = new HealthProfessional();
    }

    // Constructor to initialize all instance variables
    public Appointment(String patientName, String patientMobile, String timeSlot, HealthProfessional selectedDoctor) {
        this.patientName = patientName;
        this.patientMobile = patientMobile;
        this.timeSlot = timeSlot;
        this.selectedDoctor = selectedDoctor;
    }

    // Print all instance variables
    public void printAppointmentDetails() {
        System.out.println("Patient Name: " + patientName);
        System.out.println("Patient Mobile: " + patientMobile);
        System.out.println("Preferred Time Slot: " + timeSlot);
        System.out.println("Selected Doctor: " + selectedDoctor.getName() + " (" + selectedDoctor.getSpecialtyArea() + ")");

        // Distinguish doctor types and print unique information (polymorphism application)
        if (selectedDoctor instanceof GeneralPractitioner) {
            GeneralPractitioner gp = (GeneralPractitioner) selectedDoctor;
            System.out.println("Doctor Certification: " + gp.getPracticeCertNumber());
        } else if (selectedDoctor instanceof Cardiologist) {
            Cardiologist cardio = (Cardiologist) selectedDoctor;
            System.out.println("Doctor Certification: " + cardio.getCardioCertificationLevel());
        }
        System.out.println();
    }

    // Getter method (for appointment cancellation function)
    public String getPatientMobile() {
        return patientMobile;
    }
}