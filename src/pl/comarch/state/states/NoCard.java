package pl.comarch.state.states;

import pl.comarch.state.ATMMachine;
import pl.comarch.state.ATMState;

public class NoCard implements ATMState {
	
	ATMMachine atmMachine;
	
	public NoCard(ATMMachine newATMMachine){
		
		atmMachine = newATMMachine;
		
	}

	public void insertCard() {
		
		System.out.println("Wlozono karte");
		atmMachine.setATMState(atmMachine.getYesCardState());
		
	}

	public void ejectCard() {
		
		System.out.println("Nie mozna wysunac karty - zadnej nie wlozono");
		
	}

	public void requestCash(int cashToWithdraw) {
		
		System.out.println("Nie mozna wyplacic - nie wlozono karty");
		
	}

	public void insertPin(int pinEntered) {
		
		System.out.println("Nie mozna wpisac pinu - nie wlozono karty");
		
	}
}
