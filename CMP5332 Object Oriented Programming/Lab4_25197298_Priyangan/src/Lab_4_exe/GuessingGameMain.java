package Lab_4_exe;


public class GuessingGameMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GuessingGame game = new GuessingGame();
		System.out.println("Guesses Left:"+game.getGuessesRemaining());
		
		
		game.makeGuess(11);
		game.makeGuess(22);
		game.makeGuess(99);
		
		
		System.out.println("Guesses Left:"+game.getGuessesRemaining());
		System.out.println("Game over?:"+game.isGameOver());
		System.out.println("won?:"+game.isWon());
		
		game.printNumber();
		
		

	}
	
	

}
