package Task;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;
 

public class ScrabbleScorerTest {
	private ScrabbleScorer scorer = new ScrabbleScorer();
	@Test
    public void testScoreForTile() {
        assertEquals(3, scorer.scoreForTile('P'));
        assertEquals(1, scorer.scoreForTile('L'));
    }

	
    @Test
    public void testScoreForWord() {
        assertEquals(11, scorer.scoreForWord("PRIYAN"));
    }
    

    @Test
    public void testHighestScoringWord() {
        List<String> words = Arrays.asList("PRIYAN", "SARAN", "KAVI");
        assertEquals("PRIYAN", scorer.highestScoringWord(words));
    }
    
    
    @Test
    public void testScoreForLowercase() {
        assertEquals(3, scorer.scoreForTile('P'));
    }

    @Test
    public void testScoreForBlankTile() {
        assertEquals(0, scorer.scoreForTile('_'));
    }
}

