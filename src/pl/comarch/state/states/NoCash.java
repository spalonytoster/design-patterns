package pl.comarch.state.states;

import pl.comarch.state.ATMMachine;
import pl.comarch.state.ATMState;

public class NoCash implements ATMState {
	
	ATMMachine atmMachine;
	
	public NoCash(ATMMachine newATMMachine){
		atmMachine = newATMMachine;		
	}

	public void insertCard() {		
		System.out.println("Brak srodkow w bankomacie, nie mozna wlozyc karty");		
	}

	public void ejectCard() {
		System.out.println("Brak srodkow w bankomacie, nie wysunieto karty");
	}

	public void requestCash(int cashToWithdraw) {
		System.out.println("Brak srodkow w bankomacie, nie mozna wyplacic");
	}

	public void insertPin(int pinEntered) {
		System.out.println("Brak srodkow w bankomacie, nie mozna wpisac pinu");
	}	
}