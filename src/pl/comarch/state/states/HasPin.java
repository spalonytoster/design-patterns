package pl.comarch.state.states;

import pl.comarch.state.ATMMachine;
import pl.comarch.state.ATMState;

public class HasPin implements ATMState {
	
	ATMMachine atmMachine;
	
	public HasPin(ATMMachine newATMMachine){
		
		atmMachine = newATMMachine;
		
	}

	public void insertCard() {
		
		System.out.println("Mozesz umiescic tylko jedna karte naraz. Nie wlozono nowej karty");
		
	}

	public void ejectCard() {
		
		System.out.println("Wysuwam karte");
		atmMachine.setATMState(atmMachine.getNoCardState());
		
	}

	public void requestCash(int cashToWithdraw) {
		
		if(cashToWithdraw > atmMachine.cashInMachine){
			
			System.out.println("Brak srodkow w bankomacie. Wysuwam karte");
			atmMachine.setATMState(atmMachine.getNoCardState());
			
		} else {
			
			System.out.println("Wyplacam " + cashToWithdraw);
			atmMachine.setCashInMachine(atmMachine.cashInMachine - cashToWithdraw);
			
			System.out.println("Wysuwam karte");
			atmMachine.setATMState(atmMachine.getNoCardState());
			
			if(atmMachine.cashInMachine <= 0){ 
				
				atmMachine.setATMState(atmMachine.getNoCashState());
				
			}
		} 
	}

	public void insertPin(int pinEntered) {
		
		System.out.println("Wpisano juz pin");
		
	}	
}