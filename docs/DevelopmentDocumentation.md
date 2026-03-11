# Development Documentation

## Project Goal

The goal of this project was to design a simple console-based pharmacy medication tracking system using Java.  
The system manages doctors, patients, medications, and prescriptions while demonstrating core Object-Oriented Programming concepts.

## Development Approach

The project was developed using a modular object-oriented structure. Each major entity in the pharmacy system is represented by its own class. This approach allows the system to remain organized and easy to extend.

The main system logic is handled by the `MedicationTracking` class, which acts as the central controller for all system operations.

## Class Responsibilities

Person  
The base class that stores shared attributes such as ID, name, age, and phone number.

Doctor  
Extends the Person class and represents a doctor who can prescribe medication. Doctors maintain a list of their patients.

Patient  
Extends the Person class and represents a patient. Patients store their prescriptions and medications.

Medication  
Represents medication stored in the pharmacy inventory. It tracks name, dose, quantity, and expiry date.

Prescription  
Represents a prescription issued by a doctor for a patient and linked to a specific medication.

MedicationTracking  
Acts as the central system controller and stores all records using ArrayList collections.

EmptyMenu  
Handles the user interface and allows users to interact with the system through a console-based menu.

## Key Development Decisions

Object-Oriented Programming was used to separate responsibilities between classes and improve code organization.

Inheritance was implemented through the Person base class to avoid duplicating common attributes for doctors and patients.

ArrayList collections were chosen for storing records because they allow dynamic storage and easy iteration through system data.

## Challenges During Development

One challenge during development was designing a central system class that manages relationships between doctors, patients, medications, and prescriptions. The MedicationTracking class was created to handle these responsibilities and coordinate system operations.

Another challenge was ensuring that prescriptions properly linked the correct doctor, patient, and medication objects.

## Future Improvements

Possible improvements for the system include:

- Adding a graphical user interface
- Adding persistent data storage using a database
- Implementing more advanced medication inventory tracking
- Adding authentication for pharmacy staff
