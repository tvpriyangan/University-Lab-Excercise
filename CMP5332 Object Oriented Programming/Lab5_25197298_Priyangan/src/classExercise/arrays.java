package classExercise;
import java.util.Arrays;
public class arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] days = new String[] {
			    "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
			};
		
		System.out.println(days[0]);
		System.out.println(days[4]);
		System.out.println(days.length);
		System.out.println(days[days.length - 1]);
		
		System.out.println(Arrays.toString(days));
		
		Arrays.sort(days);
		System.out.println(Arrays.toString(days));
		
		System.out.println(Arrays.toString(days));
		
		
		Arrays.fill(days, "Pizza");
		System.out.println(Arrays.toString(days));
		
		
		

	}

}
