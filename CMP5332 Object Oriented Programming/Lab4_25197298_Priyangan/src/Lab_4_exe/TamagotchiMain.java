package Lab_4_exe;

public class TamagotchiMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tamagotchi robot =new Tamagotchi();
		
		System.out.println("Mood:"+robot.getmood());
		
		robot.feed();
		System.out.println("Mood:"+robot.getmood());
		
		robot.walk();
		System.out.println("Mood:"+robot.getmood());
		
		robot.sleep();
		System.out.println("Mood:"+robot.getmood());
		
		robot.passTime();
		System.out.println("Mood:"+robot.getmood());

	}

}
