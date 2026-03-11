
package medicationtracking;

import java.time.LocalDate;

public class Prescription {

    private static int nextId = 1;

    private int id;
    private Doctor doctor;
    private Patient patient;
    private Medication medication;
    private LocalDate issueDate;
    private LocalDate expiryDate;

    public Prescription(Doctor d, Patient p, Medication m) {
        id = nextId++;
        doctor = d;
        patient = p;
        medication = m;
        issueDate = LocalDate.now();
        expiryDate = issueDate.plusYears(1);
    }

    public Doctor getDoctor(){ return doctor; }
    public Patient getPatient(){ return patient; }
    public Medication getMedication(){ return medication; }
    public LocalDate getIssueDate(){ return issueDate; }

    public String toString(){
        return "Prescription ID=" + id + ", Doctor=" + doctor.getName() +
        ", Patient=" + patient.getName() +
        ", Medication=" + medication.getName();
    }
}
