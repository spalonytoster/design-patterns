package pl.comarch.state;

public interface ATMState {
	
	// Spodziewamy sie nastepujacych stanow:
	// HasCard [karta w bankomacie], NoCard [brak karty w bankomacie], HasPin [karta w bankomacie i pomyslna autoryzacja], NoCash [brak pieniedzy w bankomacie]
	
	void insertCard();
	void ejectCard();
	void insertPin(int pinEntered);
	void requestCash(int cashToWithdraw);
	
}