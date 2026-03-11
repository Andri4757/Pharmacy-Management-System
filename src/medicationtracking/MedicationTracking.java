
package medicationtracking;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MedicationTracking {

    List<Patient> patients = new ArrayList<>();
    List<Doctor> doctors = new ArrayList<>();
    List<Medication> medications = new ArrayList<>();
    List<Prescription> prescriptions = new ArrayList<>();

    public void addPatient(String name, int age, String phone){
        patients.add(new Patient(name, age, phone));
        System.out.println("Patient added.");
    }

    public void addDoctor(String name, int age, String phone, String spec){
        doctors.add(new Doctor(name, age, phone, spec));
        System.out.println("Doctor added.");
    }

    public void addMedication(String name, String dose, int qty){
        medications.add(new Medication(name, dose, qty));
        System.out.println("Medication added.");
    }

    public Patient findPatient(String name){
        for(Patient p:patients)
            if(p.getName().equalsIgnoreCase(name))
                return p;
        return null;
    }

    public Doctor findDoctor(String name){
        for(Doctor d:doctors)
            if(d.getName().equalsIgnoreCase(name))
                return d;
        return null;
    }

    public Medication findMedication(String name){
        for(Medication m:medications)
            if(m.getName().equalsIgnoreCase(name))
                return m;
        return null;
    }

    public void processPrescription(String patientName,String doctorName,String medName){

        Patient p = findPatient(patientName);
        Doctor d = findDoctor(doctorName);
        Medication m = findMedication(medName);

        if(p==null||d==null||m==null){
            System.out.println("Invalid prescription data");
            return;
        }

        if(m.getQuantity()<=0){
            System.out.println("Medication out of stock");
            return;
        }

        Prescription pr = new Prescription(d,p,m);
        prescriptions.add(pr);
        p.addPrescription(pr);
        p.addMedication(m);
        d.addPatient(p);
        m.reduceStock(1);

        System.out.println("Prescription processed");
    }

    public void printReport(){
        System.out.println("=== SYSTEM REPORT ===");
        System.out.println("Doctors:");
        for(Doctor d:doctors) System.out.println(d);

        System.out.println("Patients:");
        for(Patient p:patients) System.out.println(p);

        System.out.println("Medications:");
        for(Medication m:medications) System.out.println(m);

        System.out.println("Prescriptions:");
        for(Prescription p:prescriptions) System.out.println(p);
    }

    public void checkExpiredMeds(){
        System.out.println("=== EXPIRED MEDICATIONS ===");
        for(Medication m:medications)
            if(m.isExpired())
                System.out.println(m);
    }

    public void printScriptsForDoctor(String name){
        for(Prescription p:prescriptions)
            if(p.getDoctor().getName().equalsIgnoreCase(name))
                System.out.println(p);
    }

    public void printScriptsForPatient(String name){
        for(Prescription p:prescriptions)
            if(p.getPatient().getName().equalsIgnoreCase(name))
                System.out.println(p);
    }

    public void printPastYearDrugSummary(){
        LocalDate yearAgo = LocalDate.now().minusYears(1);

        for(Prescription p:prescriptions)
            if(!p.getIssueDate().isBefore(yearAgo))
                System.out.println(p.getMedication().getName());
    }

    public void restockMedication(String name,int qty){
        Medication m = findMedication(name);
        if(m!=null){
            m.restock(qty);
            System.out.println("Restocked");
        }
    }
}
