import java.util.ArrayList;
import java.util.List;

//Finish time:
//ID:

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;
	
	public BowlingGame(){}
	
	// adds a frame to the game
	public void addFrame(Frame frame){
		
		
		int firstThrow = 2;
		int secondThrow = 4;
		
		Frame firstFrame = new Frame(firstThrow, secondThrow);
		
		addFrame(firstFrame);
		
		frames.add(frame);
		
		
	}
	
	// Sets the bonus throws at the end of the game
	public void setBonus(int firstThrow, int secondThrow) {
		//to be implemented
	}
	
	// Returns the game score
	public int score(){
		
		int scoreofFrame = 0;
		
		int first = frames.get(0).getFirstThrow();
		int second = frames.get(0).getSecondThrow();
		
		scoreofFrame = first + second;
		
		System.out.println(scoreofFrame);
		
		return 0;
	}
}