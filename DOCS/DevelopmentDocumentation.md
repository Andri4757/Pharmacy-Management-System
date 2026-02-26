# Development Documentation

## 1. Project Structure

The project is organized using a clear and simple package structure.

src/ └── medicationtracking/ ├── Person.java ├── Patient.java ├──
Doctor.java ├── Medication.java ├── Prescription.java ├──
MedicationTrackingSystem.java └── MenuApp.java

docs/ ├── UserDocumentation.md └── DevelopmentDocumentation.md

All source files are located inside the `medicationtracking` package.

------------------------------------------------------------------------

## 2. Architecture

The system follows a layered design:

-   **UI Layer** → MenuApp (handles user interaction)
-   **Service Layer** → MedicationTrackingSystem (business logic)
-   **Model Layer** → Person, Doctor, Patient, Medication, Prescription

Business logic is separated from user interaction to keep the system
organized and maintainable.

------------------------------------------------------------------------

## 3. Dependencies

-   Java 17 or higher
-   Standard Java libraries:
    -   java.util
    -   java.time

No external libraries are required.

------------------------------------------------------------------------

## 4. Build Instructions

To compile the project manually:

    javac src/medicationtracking/*.java

To run the application:

    java -cp src medicationtracking.MenuApp

The project can also be run directly from an IDE such as IntelliJ,
Eclipse, or VS Code.

------------------------------------------------------------------------

## 5. Development Standards

This project follows standard Object-Oriented Programming principles:

-   Encapsulation
-   Inheritance
-   Separation of concerns
-   Clear naming conventions
-   Use of Java collections (ArrayList)
-   Business logic separated from the user interface

------------------------------------------------------------------------

## 6. Theoretical Database Design

If implemented with a relational database, the system would contain the
following tables:

### Doctor

-   id (Primary Key)
-   name
-   age
-   phone
-   specialization

### Patient

-   id (Primary Key)
-   name
-   age
-   phone

### Medication

-   id (Primary Key)
-   name
-   dose
-   quantity
-   expiry_date

### Prescription

-   id (Primary Key)
-   doctor_id (Foreign Key)
-   patient_id (Foreign Key)
-   medication_id (Foreign Key)
-   issue_date
-   expiry_date

### Relationships

-   One Doctor → Many Prescriptions
-   One Patient → Many Prescriptions
-   One Medication → Many Prescriptions

------------------------------------------------------------------------

## 7. GitHub Instructions

To clone the repository:

    git clone https://github.com/yourusername/pharmacy-system.git

After cloning, open the project in your IDE and run MenuApp.java.
