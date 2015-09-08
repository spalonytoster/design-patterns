package pl.comarch.state.states;

import pl.comarch.state.ATMMachine;
import pl.comarch.state.ATMState;

public class HasCard implements ATMState {
	
	ATMMachine atmMachine;
	
	public HasCard(ATMMachine newATMMachine){
		
		atmMachine = newATMMachine;
		
	}

	public void insertCard() {
		
		System.out.println("Mozesz umiescic tylko jedna karte naraz. Nie wlozono nowej karty");
		
	}

	public void ejectCard() {
		
		System.out.println("Your card is ejected");
		atmMachine.setATMState(atmMachine.getNoCardState());
		
	}

	public void requestCash(int cashToWithdraw) {
		
		System.out.println("Dopiero wylozono karte. Nie mozna wyplacic srodkow");
		
		
	}

	public void insertPin(int pinEntered) {
		
		if(pinEntered == 1234){
			
			System.out.println("Wpisales poprawny pin");
			atmMachine.setATMState(atmMachine.getHasPinState());
			
		} else {
			
			System.out.println("Wpisales niepoprawny pin, wysuwam karte");
			atmMachine.setATMState(atmMachine.getNoCardState());
			
		}	
	}	
}