package classExercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//List Exercises 
		
		List<String>foods=new ArrayList<String>();
		
		foods.add("rice");
		foods.add("dosha");
		foods.add("Idli");
		System.out.println(foods.toString());
		
		System.out.println(foods.get(0));
		System.out.println(foods.get(1));
		
		System.out.println(foods.size());
		
		
		foods.contains("Idli");
		System.out.println(foods.toString());
		
		foods.add("Pongal");
		System.out.println(foods.size());
		
		foods.remove("dosha");
		foods.set(0,"Ghee dosha");
		System.out.println(foods.toString());
		
		
		//Sets Exe:
		Set <String> names=new HashSet<>();
		names.add("Saran");
		names.add("Arun");
		names.add("Kavi");
		System.out.println(names.toString());
		
		System.out.println(names.size());
		System.out.println(names.isEmpty());
		
		System.out.println(names.contains("Kavi"));
		System.out.println(names.remove("Kavi"));
		
		
		//System.out.println(2+" Anna");   
		//because Index model/Duplicate is not in set. 
		
		names.add("Priyangan");
		System.out.println(names);
		
		
		//Map Exe:
		Map<String,String>phoneNumbers=new HashMap<>();
		phoneNumbers.put("Pri", "0767941101");
		phoneNumbers.put("Arun","0765250304");
		
		System.out.println(phoneNumbers.get("Arun"));
		System.out.println(phoneNumbers.size());
		System.out.println(phoneNumbers.isEmpty());
		System.out.println(phoneNumbers.containsKey("Pri"));
	    System.out.println(phoneNumbers.containsValue("0767941101"));		
		
	    
	    phoneNumbers.put("Saran","07466819405");
	    System.out.println(phoneNumbers);
	    
	    //System.out.println(phoneNumbers.toString());
		
		
		
		
		
		
		
		
		
		
		
		


	}

}
