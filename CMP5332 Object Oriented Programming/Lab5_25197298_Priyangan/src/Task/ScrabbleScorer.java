package Task;
import java.util.*;
public class ScrabbleScorer {
	private final Map<Character,Integer>tileScores;
	public ScrabbleScorer() {
		char[]tiles="ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
		
		int[]scores={1,3,3,2,1,4,2,4,1,8,5,1,3,1,1,3,10,1,1,1,1,4,4,8,4,10};
		
		tileScores=new HashMap<>();
		for (int i=0; i<tiles.length; i++) {
			tileScores.put(tiles[i], scores[i]);
		}
	}
	
	
	public int scoreForTile(char tile) {
		char upper = Character.toUpperCase(tile);
		if (tileScores.containsKey(upper)) {
			return tileScores.get(upper);
			
		}
		return 0;
	}
	
	public int scoreForWord(String word) {
		char[] tiles=word.toCharArray();
		int total =0;
		for (char tile:tiles) {
			total=total+scoreForTile(tile);
		}
			
	    
		return total;

	}
	public String highestScoringWord(List<String>words) {
		String best=null;
		int bestScore=-1;
		for (String word:words){
			int score = scoreForWord(word);
			if (score>bestScore) {
				bestScore=score;
				best=word;
			}
			
		}
		return best;
	}
	
}
	

