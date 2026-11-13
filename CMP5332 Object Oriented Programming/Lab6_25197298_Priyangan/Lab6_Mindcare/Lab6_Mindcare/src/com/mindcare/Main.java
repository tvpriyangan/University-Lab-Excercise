package com.mindcare;
import com.mindcare.exceptions.InvalidDosageException;
import com.mindcare.exceptions.PatientNotFoundException;
import com.mindcare.exceptions.ScheduleConflictException;
import com.mindcare.service.CareScheduleManager;
import com.mindcare.service.MedicationScheduler;
public class Main {
    public static void main(String[] args){
        MedicationScheduler scheduler = new MedicationScheduler();

        // Valid Call
        try {
            scheduler.addMedication("Donepezil", 10);
        } 
        catch (InvalidDosageException e) {
            System.err.println(e.getMessage());
        }

        
        
        // Invalid Call (Triggers Exception)
        try {
            scheduler.addMedication("Memantine", -5);
        } 
        catch (InvalidDosageException e) {
            System.err.println("Error caught: " + e.getMessage());
        } 
        CareScheduleManager manager = new CareScheduleManager();
        manager.registerPatient("P-101");
        
        
        
        
        //Normal Booking situation
        try {
            manager.scheduleMedication("P-101", "Donepezil", 10, "08:00");
        } 
        catch (InvalidDosageException e) {
            System.out.println("Dosage error: " + e.getMessage());
        } 
        catch (ScheduleConflictException e){
            System.out.println("Schedule error: " + e.getMessage());
        } 
        
        
        
        
        //Wrong dosage 
        try {
            manager.scheduleMedication("P-101", "Memantine", -5, "12:00");
        } 
        catch (InvalidDosageException e) {
            System.out.println("Dosage error: " + e.getMessage());
        } 
        catch (ScheduleConflictException e){
            System.out.println("Schedule error: " + e.getMessage());
        }
        
        
        
        //same time situation
        try {
            manager.scheduleMedication("P-101", "Vitamin D", 50, "08:00");
        } 
        catch (InvalidDosageException e){
            System.out.println("Dosage error: " + e.getMessage());
        } 
        catch (ScheduleConflictException e){
            System.out.println("Schedule error: " + e.getMessage());
        }
        
        
        //wrong patient 
        
        try {
            manager.scheduleMedication("P-999", "Donepezil", 10, "09:00");
        } 
        catch (InvalidDosageException e){
            System.out.println("Dosage error: " + e.getMessage());
        } 
        catch (ScheduleConflictException e){
            System.out.println("Schedule error: " + e.getMessage());
        } 
        catch (PatientNotFoundException e){
            System.out.println("Patient error: " + e.getMessage());
        }
    }
}
