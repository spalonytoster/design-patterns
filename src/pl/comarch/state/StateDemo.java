package pl.comarch.state;

public class StateDemo {

	public static void seperator(){
		System.out.println("====================");	
	}
	
	public static void main(String[] args) {
		ATMMachine atm = new ATMMachine(2000);
		
		
		atm.insertCard();
		atm.ejectCard();
		
		seperator();
		atm.ejectCard();
		
		seperator();
		atm.insertCard();
		atm.insertCard();
		atm.ejectCard();
		
		seperator();
		atm.insertCard();
		atm.insertPin(0);
		
		seperator();
		atm.insertCard();
		atm.requestCash(2000);
		atm.insertPin(1234);
		atm.requestCash(2000);

		seperator();
		atm.insertCard();
		atm.insertPin(1234);
		atm.requestCash(500);
		
	}

}
