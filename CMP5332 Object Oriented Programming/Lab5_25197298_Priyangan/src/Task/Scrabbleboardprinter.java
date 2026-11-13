package Task;

public class Scrabbleboardprinter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[][]board=new char[][] {
			{ '.', '.', 'W', '.', '.' }, 
			{ '.', '.', 'O', '.', '.' }, 
			{ '.', '.', 'R', '.', '.' }, 
			{ 'H', 'E', 'L', 'L', 'O' }, 
			{ '.', '.', 'D', '.', '.' } 
			} ;
			printBoard(board);
			
		}
		
	
	public static void printBoard(char[][] board) {
		int size=board.length;
		String border ="+";
		for (int i=0; i<size*2+1; i++) {
			border=border+"+";
			
		}
		System.out.println(border);
		for (int row =0; row<size; row++) {
			String line ="|";
			for (int col =0; col<size; col++) {
				line=line+""+board[row][col];
			}
			line=line+"|";
			System.out.println(line);
			
		}
		System.out.println(border);
		
		
	}
}
