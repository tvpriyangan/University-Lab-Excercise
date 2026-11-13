import java.io.*;

public class RainfallProgram {
	public static void main(String[] args) throws IOException {
		BufferedReader keyboard = new BufferedReader(
			new InputStreamReader(System.in) 
		);
		 
		RainfallStats stats = new RainfallStats();
		System.out.println("Enter rainfall measurements (in mm), or \"end\" to stop.");
		
		while(true) {
			System.out.print("> ");
			String line = keyboard.readLine(); 
			if("end".equals(line)) {
				break;
			}
			try {
			// TODO: parse the measurement and add it to stats
			double measurement = Double.parseDouble(line);
			stats.addMeasurement(measurement);
			}
			// TODO: print a message if the measurement cannot be parsed
				
			catch (NumberFormatException e) {
				System.out.println("Invalid.");
			}
			// TODO: print a message if the measurement is negative
			catch (InvalidRainfallException e) {
				System.out.println(e.getMessage());
			}
		}
		
		System.out.println(stats.getCount() + " measurements entered.");
		
		// TODO: prevent the exception when no measurements have been entered.
		if (stats.getCount() > 0) {
			System.out.println("Mean: " + stats.getMean() + " mm");
			System.out.println("Maximum: " + stats.getMax() + " mm");
		}
}
}