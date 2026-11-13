package classExercise;

public class iteratingOverArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] days = new String[] {
			    "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
			};
		
		for (String day: days) {
			System.out.println(day+"is a day of the week");
		}
		
		for (int i=0; i<days.length; i++) {
			String day=days[i];
			System.out.println("Day " + i + " is " + day);
			
			
		}
	}
		
		

	public static String[] mapToUppercase(String[] array) {
	    String[] result = new String[array.length];
	
	    for (int i = 0; i < array.length; i++) {
	        result[i] = array[i].toUpperCase();
	    }
	    return result; 
	
	}
	
	
	
	

	
}

