import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class PhoneParser {
	/*
	 * Parses a phone data string, in the following format:
	 * 
	 *     model screenSize batteryCapacity
	 * 
	 * The model name is encoded with underscores instead of spaces.
	 */
	public static Phone parse(String data) {
		// TODO: parse the phone data string, and return a Phone object.
		// you may use string manipulation, a regex, or a Scanner
		String[] parts = data.split(" ");
	    String model = parts[0];
	    model = model.replace("_", " ");
	    double screenSize = Double.parseDouble(parts[1]);
	    int batteryCapacity = Integer.parseInt(parts[2]);
	    Phone phone = new Phone(model, screenSize, batteryCapacity);
	    return phone;
	}
	 
	/*
	 * Returns a PhoneList by parsing a text file containing the phone data.
	 */
	public static PhoneList parseFile(String filename) throws IOException {
		// TODO: create a PhoneList
		PhoneList list = new PhoneList();
		// TODO: create a BufferedReader to read from the file
		BufferedReader reader = new BufferedReader(new FileReader(filename));
		// TODO: for each line, parse it as a Phone and add it to the list 
		
		String row = reader.readLine();
	    while (row != null) {
	        Phone phone = parse(row);
	        list.addPhone(phone);
	        row = reader.readLine();
	    }
	    reader.close();
	    return list;
	}
}
