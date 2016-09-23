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
		
		frames.add(frame);
		
	}
	
	// Sets the bonus throws at the end of the game
	public void setBonus(int firstThrow, int secondThrow) {
		//to be implemented
	}
	
	// Returns the game score
	public int score(){
		int finalscore = 0;
		
		for (int i=0; i >= frames.size(); i++){
			
			int first = frames.get(i).getFirstThrow();
			int second = frames.get(i).getSecondThrow();
			
			finalscore = finalscore + first + second; 
		}
		
		System.out.println(finalscore);
		
		return finalscore;
	}
}
