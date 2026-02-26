Pharmacy Medication Tracking System
Overview

The Pharmacy Medication Tracking System is a console-based Java application designed to manage doctors, patients, medications, and prescriptions.

The system demonstrates Object-Oriented Programming (OOP), collections, inheritance, encapsulation, and basic system architecture principles.

All data is stored in memory using ArrayList collections.

Features

Add, edit, and delete patients

Add, edit, and delete doctors

Add, edit, and delete medications

Create prescriptions

Automatically reduce medication stock on prescription creation

Prevent prescriptions if medication is out of stock

Check expired medications

Generate full system report

View prescriptions by doctor

Generate past-year drug summary

Restock medications

Search records by name

Technologies Used

Java 11+

Object-Oriented Programming

Collections Framework (ArrayList)

LocalDate (Java Time API)

No external libraries are required.

Project Structure
Person (Base Class)
├── Doctor
└── Patient

Medication
Prescription
MedicationTrackingSystem (Business Logic Layer)
MenuApp (Console UI)
Class Responsibilities
Person

Base class for Doctor and Patient.
Contains: id, name, age, phone.

Doctor

Extends Person.
Contains: specialization and list of assigned patients.

Patient

Extends Person.
Contains list of prescriptions.

Medication

Represents a drug.
Contains: id, name, dose, stock quantity, expiry date.

Prescription

Links doctor, patient, and medication.
Automatically expires one year after issue date.

MedicationTrackingSystem

Main system logic.
Handles data storage and business rules.

MenuApp

Console interface for interacting with the system.

How to Run

Open the project in your IDE (VS Code, IntelliJ, Eclipse).

Run MenuApp.java.

Use the console menu to navigate through the system.

Academic Purpose

This project was created for academic purposes to demonstrate:

OOP design

Inheritance

Encapsulation

System organization

Business logic separation from UI

Data relationships between objects
