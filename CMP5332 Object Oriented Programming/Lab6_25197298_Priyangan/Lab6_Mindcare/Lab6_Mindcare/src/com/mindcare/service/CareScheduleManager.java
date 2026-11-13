package com.mindcare.service;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.mindcare.exceptions.InvalidDosageException;
import com.mindcare.exceptions.PatientNotFoundException;
import com.mindcare.exceptions.ScheduleConflictException;
//Assign the patient ID to Booked time
public class CareScheduleManager {
	
	private Map<String, Set<String>> schedules=new HashMap<>();
	
	
	public void registerPatient(String patientId) {
		schedules.put(patientId, new HashSet<>());
	}
	public void scheduleMedication(String patientId,String medicationName,int dosageMg,String time)
            throws InvalidDosageException, ScheduleConflictException {
	
		//check Patient registered?
		if (!schedules.containsKey(patientId)) {
			
			throw new PatientNotFoundException ("Patient  " + patientId + " not found");
		}
			
		
		//check dosage between 1 and 1000 mg.
		if (dosageMg < 1||dosageMg > 1000) {
			
            throw new InvalidDosageException(
                    "Invalid dosage (" + dosageMg + "mg). Must be between 1 and 1000 mg.");
        }
		
		
		
		
		//check their booking status.
		Set<String> bookedTimes=schedules.get(patientId);
		
        if (bookedTimes.contains(time)){
            throw new ScheduleConflictException(
                    "Time conflict: a medication is already scheduled at " + time + ".");
        }
		
        bookedTimes.add(time);
        
        System.out.println("Scheduled " + medicationName + " (" + dosageMg + "mg) for "
        		
                + patientId + " at " + time + ".");
    }
	
	}

