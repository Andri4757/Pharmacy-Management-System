package medicationtracking;

import java.util.ArrayList;
import java.util.List;

public class Patient extends Person {
    private String organization;
    private final List<Medication> medications = new ArrayList<>();
    private final List<Prescription> prescriptions = new ArrayList<>();

    public Patient(String name, int age, String phoneNumber, String organization) {
        super(name, age, phoneNumber);
        this.organization = organization;
    }

    public String getOrganization() { return organization; }
    public void setOrganization(String organization) { this.organization = organization; }

    public List<Medication> getMedications() { return medications; }
    public List<Prescription> getPrescriptions() { return prescriptions; }

    public void addMedication(Medication medication) {
        if (!medications.contains(medication)) {
            medications.add(medication);
        }
    }

    public void addPrescription(Prescription prescription) {
        prescriptions.add(prescription);
    }

    @Override
    public String toString() {
        return "Patient{" + super.toString() +
                ", Org=" + organization +
                ", Meds=" + medications.size() +
                ", Prescriptions=" + prescriptions.size() +
                "}";
    }
}
