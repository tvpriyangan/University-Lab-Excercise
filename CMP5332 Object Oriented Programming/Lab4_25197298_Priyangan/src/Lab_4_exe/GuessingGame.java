package Lab_4_exe;
import java.util.Random;

public class GuessingGame {
	//Variables
	private int number;
	private int guessesLeft;
	private boolean won;
	
	//constructor
	public GuessingGame() {
		Random random = new Random();
		number = random.nextInt(100)+1;
		guessesLeft=10;
		won=false;
	}
	
	
	
	public int getGuessesRemaining() {
		return guessesLeft;
	}
	public boolean isGameOver() {
		return won || guessesLeft==0;
	}

	public boolean isWon() {
		return won;
	}
	
	
	
	public void makeGuess(int guess) {
		if(isGameOver() ) {
			System.out.println("Sorry Game Over!, you can't guess more!");
			return;
		}
		guessesLeft--;
		
		if (guess ==number) {
			System.out.println("YOUR ARE RIGHT!");
			won=true;
		}
		else if 
			(guess>number){
				System.out.println("Sorry, High Value!");
		}
		else {
			System.out.println("Sorry,Low Value!");
		}
	}
	
		
		
	public void printNumber () {
		if (isGameOver()) {
			System.out.println("The Number :"+number);
		}
		else {
			System.out.println("Invalid Try");
		}
		
	}
			
		
	
}
