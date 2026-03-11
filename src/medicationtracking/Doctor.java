
package medicationtracking;

import java.util.ArrayList;
import java.util.List;

public class Doctor extends Person {

    private String specialty;
    private List<Patient> patients;

    public Doctor(String name, int age, String phoneNumber, String specialty) {
        super(name, age, phoneNumber);
        this.specialty = specialty;
        this.patients = new ArrayList<>();
    }

    public String getSpecialty() { return specialty; }
    public void setSpecialty(String specialty) { this.specialty = specialty; }

    public void addPatient(Patient patient) {
        if(patient != null && !patients.contains(patient)) {
            patients.add(patient);
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Specialty=" + specialty + ", Patients=" + patients.size();
    }
}
