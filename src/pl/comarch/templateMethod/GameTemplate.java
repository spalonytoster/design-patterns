package pl.comarch.templateMethod;

public abstract class GameTemplate {
	protected int numberOfPlayers;
	
	protected abstract void initialize();
	protected abstract void makeTurn(int player);
	protected abstract Boolean endOfGame();
	protected abstract void showResults();
	
	
	public void playGame(int numberOfPlayers){
		this.numberOfPlayers = numberOfPlayers;
		this.initialize();
		
		int player = 0;
		System.out.println("====== STARTY GRY: " + this.getClass().getSimpleName() + " =======");
		while(!endOfGame()){
			makeTurn(player);
			player = (player + 1) % this.numberOfPlayers;
		}
		showResults();
		System.out.println("====== KONIEC GRY =========\n\n");
	}
}
