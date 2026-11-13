package com.mindcare.service;

import com.mindcare.exceptions.InvalidDosageException;

public class MedicationScheduler {

    // Method uses 'throws' to specify that it can throw InvalidDosageException
    public void addMedication(String name, int mg) throws InvalidDosageException {
        if (mg <= 0) {
            throw new InvalidDosageException("Dosage must be greater than 0 mg.");
        }
        System.out.println("Added: " + name + " (" + mg + "mg)");
    }
}
