package medicationtracking;

import java.util.ArrayList;
import java.util.List;

public class Doctor extends Person {
    private String specialization;
    private final List<Patient> patients = new ArrayList<>();

    public Doctor(String name, int age, String phoneNumber, String specialization) {
        super(name, age, phoneNumber);
        this.specialization = specialization;
    }

    public String getSpecialization() { return specialization; }
    public void setSpecialization(String specialization) { this.specialization = specialization; }
    public List<Patient> getPatients() { return patients; }

    public void addPatient(Patient patient) {
        if (patient != null && !patients.contains(patient)) {
            patients.add(patient);
        }
    }

    @Override
    public String toString() {
        return "Doctor{" + super.toString() +
                ", Spec=" + specialization +
                ", Patients=" + patients.size() +
                "}";
    }
}