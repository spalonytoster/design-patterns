package pl.comarch.templateMethod;

import java.util.Random;

public class TwoInRowGame extends GameTemplate{
	int lastThrow = -1;
	int currThrow = -2;
	
	int currPlayer;
	
	@Override
	protected void initialize() {
	}

	@Override
	protected void makeTurn(int player) {
		Random rand = new Random();
		currThrow = rand.nextInt(6);
		currPlayer = player;
		System.out.println("Gracz " + currPlayer + " wyrzuca " + currThrow + ". Ostatnia wartosc: " + lastThrow);		
	}

	@Override
	protected Boolean endOfGame() {
		if(currThrow == lastThrow)
			return true;
		
		lastThrow = currThrow;
		return false;
	}

	@Override
	protected void showResults() {
		System.out.println("Przegral gracz z numerem " + currPlayer);
	}

}
