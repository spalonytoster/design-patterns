package pl.comarch.templateMethod;

import java.util.Random;

public class MaxSumGame extends GameTemplate{
	int[] results;
	
	int howManyTurns = 0;
	
	@Override
	protected void initialize() {
		results = new int[numberOfPlayers];
	}

	@Override
	protected void makeTurn(int player) {
		Random rand = new Random();
		int throwValue = rand.nextInt(6);
		System.out.println("Gracz " + player + " wyrzuca " + throwValue);		
		results[player] += throwValue;
	}

	@Override
	protected Boolean endOfGame() {
		return (howManyTurns++) >= 5 * this.numberOfPlayers;
	}

	@Override
	protected void showResults() {
		int winner = 0;
		for(int i=1; i<this.numberOfPlayers; i++)
			if(results[winner] < results[i])
				winner = i;
		System.out.println("Wygral gracz z numerem " + winner);
	}

}
