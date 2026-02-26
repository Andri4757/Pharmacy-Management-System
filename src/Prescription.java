package medicationtracking;

import java.time.LocalDate;

public class Prescription {
    private static int NEXT_ID = 1;

    private final int id;
    private final Doctor doctor;
    private final Patient patient;
    private final Medication medication;
    private final LocalDate issuedDate;
    private final LocalDate expiryDate;

    public Prescription(Doctor doctor, Patient patient, Medication medication) {
        this.id = NEXT_ID++;
        this.doctor = doctor;
        this.patient = patient;
        this.medication = medication;
        this.issuedDate = LocalDate.now();
        this.expiryDate = issuedDate.plusYears(1);
    }

    public int getId() { return id; }
    public Doctor getDoctor() { return doctor; }
    public Patient getPatient() { return patient; }
    public Medication getMedication() { return medication; }
    public LocalDate getIssuedDate() { return issuedDate; }
    public LocalDate getExpiryDate() { return expiryDate; }

    @Override
    public String toString() {
        return "Prescription{" +
                "ID=" + id +
                ", Doctor=" + doctor.getName() +
                ", Patient=" + patient.getName() +
                ", Medication=" + medication.getName() +
                ", Issued=" + issuedDate +
                ", Expiry=" + expiryDate +
                '}';
    }
}
