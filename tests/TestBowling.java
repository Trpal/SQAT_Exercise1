import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {
	
	@Test
	public void testBowlingGame_singleframeof2n4() {
		BowlingGame game = new BowlingGame();
		Frame frame = new Frame(2, 4);
		
		game.addFrame(frame);
		Frame frame2 = new Frame(2, 4);
		game.addFrame(frame2);
		
		assertTrue("score of first frame is not 6", game.score() == 6);
	}
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
