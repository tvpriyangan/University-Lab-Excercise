package Task;
import java.util.HashMap;
import java.util.Map;
public class MapPrinterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String,String> contacts=new HashMap<>();
		contacts.put("Priyan", "0740766787");
		contacts.put("saran","07457756467");
		contacts.put("Kavi","0756474537");
		
		System.out.println("1.Keys:");
		MapPrinter.printKeys(contacts);
		System.out.println("2.Values:");
		MapPrinter.printValues(contacts);
		System.out.println("3.Keys with Values:");
		MapPrinter.printPairs(contacts);
		

	}

}
