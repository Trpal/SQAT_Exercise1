import java.util.ArrayList;
import java.util.List;

//Finish time: 16:37
//ID: 151

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
		
		bonus = new Frame(firstThrow, secondThrow);
		
	}
	
	
	
	// Returns the game score
	public int score(){
		int finalscore = 0;
		
		for (int i = 0; i < frames.size(); i++){
			
			int framescore = frames.get(i).score();
			
			if (frames.get(i).isStrike() && i < 9){
				if(frames.get(i+1).isStrike()){
					if(i == 8 && frames.get(i).isStrike()){
						finalscore = finalscore + bonus.getFirstThrow();
					}else{
						finalscore = finalscore + frames.get(i+2).getFirstThrow();
					}
				}
				finalscore = finalscore + frames.get(i+1).score();
			}
			
			if(i == 9 && frames.get(9).isSpare()){
				finalscore = finalscore + bonus.getFirstThrow();
				System.out.println(bonus.getFirstThrow());
			}
			
			if(i == 9 && frames.get(9).isStrike()){
				finalscore = finalscore + bonus.getFirstThrow() + bonus.getSecondThrow();
				System.out.println(bonus.score());
			}
			
			if (frames.get(i).isSpare() && i < 9){
				finalscore = finalscore + frames.get(i+1).getFirstThrow();
			}
			
			finalscore = finalscore + framescore;
		}
		
		System.out.println(finalscore);
		
		return finalscore;
	}
}
