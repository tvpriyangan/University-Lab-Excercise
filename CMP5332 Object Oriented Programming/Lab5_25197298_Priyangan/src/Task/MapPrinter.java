package Task;
import java.util.Map;


public class MapPrinter {
	public static void printKeys(Map<String, String>Map) {
		for (String key:Map.keySet()) {
			System.out.println(key);
		}
		
	}
	
	public static void printValues(Map<String, String>Map) {
		for (String value:Map.values()) {
			System.out.println(value);
		}
	}
	
	public static void printPairs(Map<String, String>Map) {
		for (Map.Entry<String, String> pair : Map.entrySet()) {
			System.out.println(pair.getKey()+":"+pair.getValue());
		}
	}
	

}
