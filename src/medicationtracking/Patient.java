
package medicationtracking;

import java.util.ArrayList;
import java.util.List;

public class Patient extends Person {

    private List<Medication> medications;
    private List<Prescription> prescriptions;

    public Patient(String name, int age, String phoneNumber) {
        super(name, age, phoneNumber);
        medications = new ArrayList<>();
        prescriptions = new ArrayList<>();
    }

    public void addMedication(Medication m) {
        if(!medications.contains(m)) {
            medications.add(m);
        }
    }

    public void addPrescription(Prescription p) {
        prescriptions.add(p);
    }

    @Override
    public String toString() {
        return super.toString() + ", Medications=" + medications.size() + ", Prescriptions=" + prescriptions.size();
    }
}
