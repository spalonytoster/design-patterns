package pl.comarch.state.states;

import pl.comarch.state.ATMMachine;
import pl.comarch.state.ATMState;

public class NoCash implements ATMState {
	
	ATMMachine atmMachine;
	
	public NoCash(ATMMachine newATMMachine){
		atmMachine = newATMMachine;		
	}

	public void insertCard() {		
		System.out.println("ATM is out of money. Your card cannot be inserted");		
	}

	public void ejectCard() {
		System.out.println("ATM is out of money. Cannot eject card");
	}

	public void requestCash(int cashToWithdraw) {
		System.out.println("ATM is out of money. Cannot withdraw cash");
	}

	public void insertPin(int pinEntered) {
		System.out.println("ATM is out of money. Cannot enter pin");
	}	
}