import java.util.ArrayList;

public class AssignmentOne {
    // Static ArrayList to store appointment objects (globally accessible)
    private static ArrayList<Appointment> appointmentList = new ArrayList<>();

    public static void main(String[] args) {
        // Part 3 – Using classes and objects
        System.out.println("=== Part 3: Health Professional Details ===");
        // Create 3 General Practitioner objects
        GeneralPractitioner gp1 = new GeneralPractitioner(101, "Dr. Emily Clark", "Family Medicine", "GPCert-2023-001");
        GeneralPractitioner gp2 = new GeneralPractitioner(102, "Dr. James Wilson", "General Practice", "GPCert-2023-002");
        GeneralPractitioner gp3 = new GeneralPractitioner(103, "Dr. Sarah Miller", "Primary Care", "GPCert-2023-003");

        // Create 2 Cardiologist objects
        Cardiologist cardio1 = new Cardiologist(201, "Dr. Michael Brown", "Cardiology", "Fellow of Cardiology");
        Cardiologist cardio2 = new Cardiologist(202, "Dr. Lisa Garcia", "Interventional Cardiology", "Senior Specialist");

        // Print details of all doctors
        gp1.printHealthProfessionalDetails();
        gp2.printHealthProfessionalDetails();
        gp3.printHealthProfessionalDetails();
        cardio1.printHealthProfessionalDetails();
        cardio2.printHealthProfessionalDetails();

        System.out.println("------------------------------");

        // Part 5 – Collection of appointments
        System.out.println("=== Part 5: Appointment Management ===");
        // Create 4 appointments (2 with GPs, 2 with Cardiologists)
        createAppointment("John Doe", "0412345678", "08:00", gp1);
        createAppointment("Jane Smith", "0487654321", "10:30", gp2);
        createAppointment("Robert Johnson", "0423456789", "14:00", cardio1);
        createAppointment("Emily Davis", "0498765432", "16:15", cardio2);

        // Print all appointments
        System.out.println("=== All Appointments After Creation ===");
        printExistingAppointments();

        // Cancel an appointment (by mobile number)
        String cancelMobile = "0487654321";
        System.out.println("=== Cancelling Appointment for Mobile: " + cancelMobile + " ===");
        cancelBooking(cancelMobile);

        // Print appointments after cancellation
        System.out.println("=== All Appointments After Cancellation ===");
        printExistingAppointments();

        System.out.println("------------------------------");
    }

    // Create appointment and add to collection (polymorphism support: can handle any HealthProfessional subclass)
    public static void createAppointment(String patientName, String patientMobile, String timeSlot, HealthProfessional doctor) {
        // Validate required information
        if (patientName == null || patientName.isEmpty() ||
                patientMobile == null || patientMobile.isEmpty() ||
                timeSlot == null || timeSlot.isEmpty() || doctor == null) {
            System.out.println("Error: All appointment details are required. Appointment not created.");
            return;
        }
        Appointment newAppointment = new Appointment(patientName, patientMobile, timeSlot, doctor);
        appointmentList.add(newAppointment);
        System.out.println("Appointment created successfully for " + patientName);
    }

    // Print all existing appointments
    public static void printExistingAppointments() {
        if (appointmentList.isEmpty()) {
            System.out.println("No existing appointments.");
            System.out.println();
            return;
        }
        System.out.println("Total Appointments: " + appointmentList.size());
        for (int i = 0; i < appointmentList.size(); i++) {
            System.out.println("Appointment " + (i + 1) + ":");
            appointmentList.get(i).printAppointmentDetails();
        }
    }

    // Cancel appointment by mobile number
    public static void cancelBooking(String patientMobile) {
        boolean found = false;
        for (int i = 0; i < appointmentList.size(); i++) {
            if (appointmentList.get(i).getPatientMobile().equals(patientMobile)) {
                appointmentList.remove(i);
                found = true;
                System.out.println("Appointment cancelled successfully for mobile: " + patientMobile);
                break;
            }
        }
        if (!found) {
            System.out.println("Error: No appointment found with mobile number: " + patientMobile);
        }
        System.out.println();
    }
}