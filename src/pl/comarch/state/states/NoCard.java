package pl.comarch.state.states;

import pl.comarch.state.ATMMachine;
import pl.comarch.state.ATMState;

public class NoCard implements ATMState {
	
	ATMMachine atmMachine;
	
	public NoCard(ATMMachine newATMMachine){
		
		atmMachine = newATMMachine;
		
	}

	public void insertCard() {
		
		System.out.println("Card inserted");
		atmMachine.setATMState(atmMachine.getYesCardState());
		
	}

	public void ejectCard() {
		
		System.out.println("Cannot eject: You didn't enter a card");
		
	}

	public void requestCash(int cashToWithdraw) {
		
		System.out.println("Cannot withdraw: You have not entered your card");
		
	}

	public void insertPin(int pinEntered) {
		
		System.out.println("Cannot insert pin: You have not entered your card");
		
	}
}
