package pl.comarch.templateMethod;

public class GameDemo {

	public static void main(String[] args) {
		GameTemplate maxSumGame = new MaxSumGame();
		maxSumGame.playGame(3);
		
		GameTemplate twoInRowGame = new TwoInRowGame();
		twoInRowGame.playGame(3);
	}

}
