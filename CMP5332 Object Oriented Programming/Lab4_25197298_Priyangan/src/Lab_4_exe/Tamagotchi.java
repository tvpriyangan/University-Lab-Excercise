package Lab_4_exe;

public class Tamagotchi {
	private int hunger;
	private int tiredness;
	private int happiness;
	
	
	//constructor
	public Tamagotchi() {
		hunger=5;
		tiredness=5;
		happiness=5;
	}
	
	
	
	
	public void feed() {
		hunger=hunger -2;
		if (hunger<0) {
			hunger=0;
		}
		
		happiness=happiness+1;
		if (happiness>10) {
			happiness=10;
		}
		
		System.out.println("Pet has been fed");
	}
	
	
	
	
	
	
	public void walk() {
		happiness=happiness+2;
		tiredness=tiredness+2;
		hunger=hunger+2;
		
		if(happiness>10) {
			happiness=10;
		}
		if (tiredness>10) {
			tiredness=10;
			
		}
		if (hunger>10) {
			hunger=10;
		}
		System.out.println("Pet went for a walk");
		
	}
	
	
	public String getmood() {
		if(hunger>=6) {
			return "hungry";
		}
		else if (tiredness>=6) {
			return "Tired";
		}
		else if(happiness<=4) {
			return"Sad";
		}
		else {
			return "Happy";
		}
	}
	
	
	public void sleep() {
		tiredness=tiredness-5;
		if (tiredness<0) {
			tiredness=0;
		}
		System.out.println("Pet had a nap");
	}
	
	
	
	
	public void passTime() {
		hunger=hunger+1;
		tiredness=tiredness+1;
		happiness=happiness-1;
		
		if(hunger>10) {
			hunger=10;
		}
		if (tiredness>10) {
			tiredness=10;
		}
		if(happiness<0) {
			happiness=0;
		}
		System.out.println("Time has Passed");
	
	}
	
	
	

	
	


}
