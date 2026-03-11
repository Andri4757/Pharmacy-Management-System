# User Documentation

## Introduction

The Pharmacy Medication Tracking System is a console-based Java application that allows users to manage pharmacy records including doctors, patients, medications, and prescriptions.

The system is designed to be simple to use and is operated through a text-based menu displayed in the console.


## Starting the Application

To run the system, first compile the project using the Java compiler:

javac src/medicationtracking/*.java

After compiling the project, start the program with:

java -cp src medicationtracking.EmptyMenu

Once the program starts, the system menu will appear in the console.

## Main Menu Options

The system provides several menu options that allow the user to perform different tasks.

1. **Add Patient**  
Allows the user to add a new patient by entering the patient's name, age, and phone number.

2. **Add Doctor**  
Allows the user to add a doctor to the system, including their specialization.

3. **Add Medication**  
Adds a medication to the pharmacy inventory including the medication name, dosage, and quantity.

4. **System Report**  
Displays a full report of all doctors, patients, medications, and prescriptions stored in the system.

5. **Check Expired Medications**  
Displays medications that have passed their expiry date.

6. **Process Prescription**  
Creates a prescription linking a doctor, patient, and medication.

7. **Prescriptions By Doctor**  
Displays all prescriptions issued by a specific doctor.

8. **Restock Medication**  
Adds additional quantity to an existing medication in the inventory.

9. **Prescriptions By Patient**  
Displays prescriptions assigned to a specific patient.

10. **Past Year Summary**  
Shows medications prescribed within the past year.

11. **Exit**  
Closes the application.
## Example Workflow

A typical workflow when using the system may include:

1. Add a patient
2. Add a doctor
3. Add medication to the inventory
4. Create a prescription linking the doctor, patient, and medication
5. Generate a system report to review stored information
## Notes

The system is designed for demonstration purposes and stores all data in memory during program execution. Once the program closes, the data will not be saved permanently.
