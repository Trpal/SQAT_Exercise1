import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {
	
	@Test
	public void testBowlingGame_singleframeof2n4() {
		BowlingGame game = new BowlingGame();
		Frame frame = new Frame(2, 4);
		
		game.addFrame(frame);
		
		assertTrue("single frame score should be 6", game.score() == 6);
	}
	
	@Test
	public void testBowlingGame_10FramesBonusStrike(){
		BowlingGame game = new BowlingGame();
		
		Frame frame1 = new Frame(1, 5);
		Frame frame2 = new Frame(3, 6);
		Frame frame3 = new Frame(7, 2);
		Frame frame4 = new Frame(3, 6);
		Frame frame5 = new Frame(4, 4);
		Frame frame6 = new Frame(5, 3);
		Frame frame7 = new Frame(3, 3);
		Frame frame8 = new Frame(4, 5);
		Frame frame9 = new Frame(8, 1);
		Frame frame10 = new Frame(8, 2);
		
		game.setBonus(10, 0);
		game.addFrame(frame1);
		game.addFrame(frame2);
		game.addFrame(frame3);
		game.addFrame(frame4);
		game.addFrame(frame5);
		game.addFrame(frame6);
		game.addFrame(frame7);
		game.addFrame(frame8);
		game.addFrame(frame9);
		game.addFrame(frame10);
		
		assertTrue("Bonus is strike score not calculated correctly", game.score() == 93);
		
	}
	
	@Test
	public void testBowlingGame_10FramesPerfectGame(){
		BowlingGame game = new BowlingGame();
		
		Frame frame1 = new Frame(10, 0);
		Frame frame2 = new Frame(10, 0);
		Frame frame3 = new Frame(10, 0);
		Frame frame4 = new Frame(10, 0);
		Frame frame5 = new Frame(10, 0);
		Frame frame6 = new Frame(10, 0);
		Frame frame7 = new Frame(10, 0);
		Frame frame8 = new Frame(10, 0);
		Frame frame9 = new Frame(10, 0);
		Frame frame10 = new Frame(10, 0);
		
		game.setBonus(10, 10);
		game.addFrame(frame1);
		game.addFrame(frame2);
		game.addFrame(frame3);
		game.addFrame(frame4);
		game.addFrame(frame5);
		game.addFrame(frame6);
		game.addFrame(frame7);
		game.addFrame(frame8);
		game.addFrame(frame9);
		game.addFrame(frame10);
		
		assertTrue("Perfect game score not displayed properly", game.score() == 300);
		
	}
	
	@Test
	public void testBowlingGame_10FramesRealGame(){
		BowlingGame game = new BowlingGame();
		
		Frame frame1 = new Frame(6, 3);
		Frame frame2 = new Frame(7, 1);
		Frame frame3 = new Frame(8, 2);
		Frame frame4 = new Frame(7, 2);
		Frame frame5 = new Frame(10, 0);
		Frame frame6 = new Frame(6, 2);
		Frame frame7 = new Frame(7, 3);
		Frame frame8 = new Frame(10, 0);
		Frame frame9 = new Frame(8, 0);
		Frame frame10 = new Frame(7, 3);
		
		game.setBonus(10, 0);
		game.addFrame(frame1);
		game.addFrame(frame2);
		game.addFrame(frame3);
		game.addFrame(frame4);
		game.addFrame(frame5);
		game.addFrame(frame6);
		game.addFrame(frame7);
		game.addFrame(frame8);
		game.addFrame(frame9);
		game.addFrame(frame10);
		
		assertTrue("Real game score not displayed properly", game.score() == 135);
		
	}
	
	@Test
	public void testBowlingGame_10FramesLastStrike(){
		BowlingGame game = new BowlingGame();
		
		Frame frame1 = new Frame(1, 5);
		Frame frame2 = new Frame(3, 6);
		Frame frame3 = new Frame(7, 2);
		Frame frame4 = new Frame(3, 6);
		Frame frame5 = new Frame(4, 4);
		Frame frame6 = new Frame(5, 3);
		Frame frame7 = new Frame(3, 3);
		Frame frame8 = new Frame(4, 5);
		Frame frame9 = new Frame(8, 1);
		Frame frame10 = new Frame(10, 0);
		
		game.setBonus(7, 2);
		game.addFrame(frame1);
		game.addFrame(frame2);
		game.addFrame(frame3);
		game.addFrame(frame4);
		game.addFrame(frame5);
		game.addFrame(frame6);
		game.addFrame(frame7);
		game.addFrame(frame8);
		game.addFrame(frame9);
		game.addFrame(frame10);
		
		assertTrue("the last frame is strike bonus is 7, 2 score should be 92", game.score() == 92);
		
	}
	
	@Test
	public void testBowlingGame_10FramesLastSpare(){
		BowlingGame game = new BowlingGame();
		
		Frame frame1 = new Frame(1, 5);
		Frame frame2 = new Frame(3, 6);
		Frame frame3 = new Frame(7, 2);
		Frame frame4 = new Frame(3, 6);
		Frame frame5 = new Frame(4, 4);
		Frame frame6 = new Frame(5, 3);
		Frame frame7 = new Frame(3, 3);
		Frame frame8 = new Frame(4, 5);
		Frame frame9 = new Frame(8, 1);
		Frame frame10 = new Frame(2, 8);
		
		game.setBonus(7, 0);
		game.addFrame(frame1);
		game.addFrame(frame2);
		game.addFrame(frame3);
		game.addFrame(frame4);
		game.addFrame(frame5);
		game.addFrame(frame6);
		game.addFrame(frame7);
		game.addFrame(frame8);
		game.addFrame(frame9);
		game.addFrame(frame10);
		
		assertTrue("score of the game is not 90", game.score() == 90);
		
	}
	
	@Test
	public void testBowlingGame_10FramesMultipleSpares(){
		BowlingGame game = new BowlingGame();
		
		Frame frame1 = new Frame(8, 2);
		Frame frame2 = new Frame(5, 5);
		Frame frame3 = new Frame(7, 2);
		Frame frame4 = new Frame(3, 6);
		Frame frame5 = new Frame(4, 4);
		Frame frame6 = new Frame(5, 3);
		Frame frame7 = new Frame(3, 3);
		Frame frame8 = new Frame(4, 5);
		Frame frame9 = new Frame(8, 1);
		Frame frame10 = new Frame(2, 6);
		
		game.addFrame(frame1);
		game.addFrame(frame2);
		game.addFrame(frame3);
		game.addFrame(frame4);
		game.addFrame(frame5);
		game.addFrame(frame6);
		game.addFrame(frame7);
		game.addFrame(frame8);
		game.addFrame(frame9);
		game.addFrame(frame10);
		
		assertTrue("score of the game is not 98", game.score() == 98);
		
	}
	
	@Test
	public void testBowlingGame_10FramesMultipleStrikes(){
		BowlingGame game = new BowlingGame();
		
		Frame frame1 = new Frame(10, 0);
		Frame frame2 = new Frame(10, 0);
		Frame frame3 = new Frame(7, 2);
		Frame frame4 = new Frame(3, 6);
		Frame frame5 = new Frame(4, 4);
		Frame frame6 = new Frame(5, 3);
		Frame frame7 = new Frame(3, 3);
		Frame frame8 = new Frame(4, 5);
		Frame frame9 = new Frame(8, 1);
		Frame frame10 = new Frame(2, 6);
		
		game.addFrame(frame1);
		game.addFrame(frame2);
		game.addFrame(frame3);
		game.addFrame(frame4);
		game.addFrame(frame5);
		game.addFrame(frame6);
		game.addFrame(frame7);
		game.addFrame(frame8);
		game.addFrame(frame9);
		game.addFrame(frame10);
		
		assertTrue("score of the game is not 112", game.score() == 112);
		
	}
	
	@Test
	public void testBowlingGame_10Frames1Striken1Spare(){
		BowlingGame game = new BowlingGame();
		
		Frame frame1 = new Frame(10, 0);
		Frame frame2 = new Frame(4, 6);
		Frame frame3 = new Frame(7, 2);
		Frame frame4 = new Frame(3, 6);
		Frame frame5 = new Frame(4, 4);
		Frame frame6 = new Frame(5, 3);
		Frame frame7 = new Frame(3, 3);
		Frame frame8 = new Frame(4, 5);
		Frame frame9 = new Frame(8, 1);
		Frame frame10 = new Frame(2, 6);
		
		game.addFrame(frame1);
		game.addFrame(frame2);
		game.addFrame(frame3);
		game.addFrame(frame4);
		game.addFrame(frame5);
		game.addFrame(frame6);
		game.addFrame(frame7);
		game.addFrame(frame8);
		game.addFrame(frame9);
		game.addFrame(frame10);
		
		assertTrue("score of the game is not 103", game.score() == 103);
		
	}
	
	@Test
	public void testBowlingGame_10frames1strike(){
		BowlingGame game = new BowlingGame();
		
		Frame frame1 = new Frame(10, 0);
		Frame frame2 = new Frame(3, 6);
		Frame frame3 = new Frame(7, 2);
		Frame frame4 = new Frame(3, 6);
		Frame frame5 = new Frame(4, 4);
		Frame frame6 = new Frame(5, 3);
		Frame frame7 = new Frame(3, 3);
		Frame frame8 = new Frame(4, 5);
		Frame frame9 = new Frame(8, 1);
		Frame frame10 = new Frame(2, 6);
		
		game.addFrame(frame1);
		game.addFrame(frame2);
		game.addFrame(frame3);
		game.addFrame(frame4);
		game.addFrame(frame5);
		game.addFrame(frame6);
		game.addFrame(frame7);
		game.addFrame(frame8);
		game.addFrame(frame9);
		game.addFrame(frame10);
		
		assertTrue("score of the game is not 94", game.score() == 94);
		
	}
	
	@Test
	public void testBowlingGame_10frames1spare(){
		BowlingGame game = new BowlingGame();
		
		Frame frame1 = new Frame(9, 1);
		Frame frame2 = new Frame(3, 6);
		Frame frame3 = new Frame(7, 2);
		Frame frame4 = new Frame(3, 6);
		Frame frame5 = new Frame(4, 4);
		Frame frame6 = new Frame(5, 3);
		Frame frame7 = new Frame(3, 3);
		Frame frame8 = new Frame(4, 5);
		Frame frame9 = new Frame(8, 1);
		Frame frame10 = new Frame(2, 6);
		
		game.addFrame(frame1);
		game.addFrame(frame2);
		game.addFrame(frame3);
		game.addFrame(frame4);
		game.addFrame(frame5);
		game.addFrame(frame6);
		game.addFrame(frame7);
		game.addFrame(frame8);
		game.addFrame(frame9);
		game.addFrame(frame10);
		
		assertTrue("score of the game is not 88", game.score() == 88);
		
	}
	
	@Test
	public void testBowlingGame_10frames(){
		BowlingGame game = new BowlingGame();
		
		Frame frame1 = new Frame(1, 5);
		Frame frame2 = new Frame(3, 6);
		Frame frame3 = new Frame(7, 2);
		Frame frame4 = new Frame(3, 6);
		Frame frame5 = new Frame(4, 4);
		Frame frame6 = new Frame(5, 3);
		Frame frame7 = new Frame(3, 3);
		Frame frame8 = new Frame(4, 5);
		Frame frame9 = new Frame(8, 1);
		Frame frame10 = new Frame(2, 6);
		
		game.addFrame(frame1);
		game.addFrame(frame2);
		game.addFrame(frame3);
		game.addFrame(frame4);
		game.addFrame(frame5);
		game.addFrame(frame6);
		game.addFrame(frame7);
		game.addFrame(frame8);
		game.addFrame(frame9);
		game.addFrame(frame10);
		
		assertTrue("score of the game is not 81", game.score() == 81);
		
	}
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
