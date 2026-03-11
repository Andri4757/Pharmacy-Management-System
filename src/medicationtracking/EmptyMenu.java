package medicationtracking;

import java.util.Scanner;

public class EmptyMenu {

    public static void main(String[] args) {

        MedicationTracking system = new MedicationTracking();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {

            printMenu();

            int option;

            try {
                option = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number.");
                continue;
            }

            switch (option) {

                case 1:
                    addPatient(scanner, system);
                    break;

                case 2:
                    addDoctor(scanner, system);
                    break;

                case 3:
                    addMedication(scanner, system);
                    break;

                case 4:
                    system.printReport();
                    break;

                case 5:
                    system.checkExpiredMeds();
                    break;

                case 6:
                    processPrescription(scanner, system);
                    break;

                case 7:
                    printDoctorScripts(scanner, system);
                    break;

                case 8:
                    restockMedication(scanner, system);
                    break;

                case 9:
                    printPatientScripts(scanner, system);
                    break;

                case 10:
                    system.printPastYearDrugSummary();
                    break;

                case 11:
                    exit = true;
                    System.out.println("Exiting system...");
                    break;

                default:
                    System.out.println("Invalid option. Try again.");
            }
        }

        scanner.close();
    }

    private static void printMenu() {

        System.out.println("\n===== Pharmacy Medication Tracking System =====");
        System.out.println("1. Add Patient");
        System.out.println("2. Add Doctor");
        System.out.println("3. Add Medication");
        System.out.println("4. System Report");
        System.out.println("5. Check Expired Medications");
        System.out.println("6. Process Prescription");
        System.out.println("7. Prescriptions By Doctor");
        System.out.println("8. Restock Medication");
        System.out.println("9. Prescriptions By Patient");
        System.out.println("10. Past Year Summary");
        System.out.println("11. Exit");
        System.out.print("Select option: ");
    }

    private static void addPatient(Scanner scanner, MedicationTracking system) {

        System.out.print("Patient name: ");
        String name = scanner.nextLine();

        System.out.print("Patient age: ");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.print("Phone number: ");
        String phone = scanner.nextLine();

        system.addPatient(name, age, phone);
        System.out.println("Patient added successfully.");
    }

    private static void addDoctor(Scanner scanner, MedicationTracking system) {

        System.out.print("Doctor name: ");
        String name = scanner.nextLine();

        System.out.print("Doctor age: ");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.print("Phone number: ");
        String phone = scanner.nextLine();

        System.out.print("Specialization: ");
        String specialty = scanner.nextLine();

        system.addDoctor(name, age, phone, specialty);
        System.out.println("Doctor added successfully.");
    }

    private static void addMedication(Scanner scanner, MedicationTracking system) {

        System.out.print("Medication name: ");
        String name = scanner.nextLine();

        System.out.print("Dose: ");
        String dose = scanner.nextLine();

        System.out.print("Quantity: ");
        int qty = Integer.parseInt(scanner.nextLine());

        system.addMedication(name, dose, qty);
        System.out.println("Medication added successfully.");
    }

    private static void processPrescription(Scanner scanner, MedicationTracking system) {

        System.out.print("Patient name: ");
        String patient = scanner.nextLine();

        System.out.print("Doctor name: ");
        String doctor = scanner.nextLine();

        System.out.print("Medication name: ");
        String medication = scanner.nextLine();

        system.processPrescription(patient, doctor, medication);
    }

    private static void printDoctorScripts(Scanner scanner, MedicationTracking system) {

        System.out.print("Doctor name: ");
        String doctor = scanner.nextLine();

        system.printScriptsForDoctor(doctor);
    }

    private static void restockMedication(Scanner scanner, MedicationTracking system) {

        System.out.print("Medication name: ");
        String name = scanner.nextLine();

        System.out.print("Quantity to add: ");
        int qty = Integer.parseInt(scanner.nextLine());

        system.restockMedication(name, qty);
    }

    private static void printPatientScripts(Scanner scanner, MedicationTracking system) {

        System.out.print("Patient name: ");
        String patient = scanner.nextLine();

        system.printScriptsForPatient(patient);
    }
}