package pl.comarch.state.states;

import pl.comarch.state.ATMMachine;
import pl.comarch.state.ATMState;

public class HasCard implements ATMState {
	
	ATMMachine atmMachine;
	
	public HasCard(ATMMachine newATMMachine){
		
		atmMachine = newATMMachine;
		
	}

	public void insertCard() {
		
		System.out.println("You can only insert one card at a time. Card not inserted");
		
	}

	public void ejectCard() {
		
		System.out.println("Your card is ejected");
		atmMachine.setATMState(atmMachine.getNoCardState());
		
	}

	public void requestCash(int cashToWithdraw) {
		
		System.out.println("You have not entered your PIN. Cannot withdraw cash");
		
		
	}

	public void insertPin(int pinEntered) {
		
		if(pinEntered == 1234){
			
			System.out.println("You entered the correct PIN");
			atmMachine.setATMState(atmMachine.getHasPinState());
			
		} else {
			
			System.out.println("You entered the wrong PIN. Ejecting card");
			atmMachine.setATMState(atmMachine.getNoCardState());
			
		}	
	}	
}