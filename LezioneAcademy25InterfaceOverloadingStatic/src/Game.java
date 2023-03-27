
public class Game {

	private static String gameName  ="killing Zombie";
	private static int score = 0;
	
	
	public Game() {
		//score = 0; // ERRORE 
	}
	
	public void addScore() {
		score++;
	}
	
	
	public int getScore() {
		return score;
	}
	
	
	public String getString() {
		return gameName;
	}
	
//	public void  setName(String name) {
//		game = name;
//	}
}
