import java.util.Random;

public class RandomPlayer extends Player{
	
	Random rand = new Random();
	
	public RandomPlayer(String name) {
		
		super(name);
		
	}
	
	public int[] getMove(int[] pileSizes) {
		
		int[] move = new int[2];
		
		int count = 0;
		
		for (int i = 0; i < pileSizes.length; i++) {
			
			if (pileSizes[i] > 0) {
				
				count++;
			}
			
		}
		
		int[] temp = new int[count];
		count = 0;
		
		for (int i = 0; i < pileSizes.length; i++) {
			
			if (pileSizes[i] > 0) {
				
				temp[count] = i;
				count++;
			}
		}
		
		
			move[0] = temp[rand.nextInt(temp.length)];
			
			move[1] = rand.nextInt(pileSizes[move[0]]) + 1;
		
		return move;
		
	}
	
	public void notifyWin() {
		
		
	}
	
	public void notifyLose() {
		
		
	}
}
