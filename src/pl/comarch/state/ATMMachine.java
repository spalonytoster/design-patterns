package pl.comarch.state;

import pl.comarch.state.states.*;

public class ATMMachine {
	
	ATMState hasCard;     
	ATMState noCard;
	ATMState hasCorrectPin;
	ATMState atmOutOfMoney;
	
	ATMState atmState;
	
	public int cashInMachine;
	
	public ATMMachine(int initialCashInMachine){
		
		hasCard = new HasCard(this);
		noCard = new NoCard(this);
		hasCorrectPin = new HasPin(this);
		atmOutOfMoney = new NoCash(this);
		
		atmState = noCard;
		
		cashInMachine = initialCashInMachine;
		if(cashInMachine < 0){
			atmState = atmOutOfMoney;
		}
	}
	
	public void setATMState(ATMState newATMState){
		atmState = newATMState;
	}
	
	public void setCashInMachine(int newCashInMachine){		
		cashInMachine = newCashInMachine;
	}
	
	public void insertCard() {
		atmState.insertCard();		
	}

	public void ejectCard() {
		atmState.ejectCard();
	}

	public void requestCash(int cashToWithdraw) {
		atmState.requestCash(cashToWithdraw);
	}

	public void insertPin(int pinEntered){
		atmState.insertPin(pinEntered);
	}
	
	public ATMState getYesCardState() { return hasCard; }
	public ATMState getNoCardState()  { return noCard; }
	public ATMState getHasPinState()  { return hasCorrectPin; }
	public ATMState getNoCashState()  { return atmOutOfMoney; }
}