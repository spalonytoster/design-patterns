package pl.comarch.mediator;

public class MobileColleague extends Colleague {

	  public MobileColleague(Mediator m) {
		super(m);
	}

	public void receive(String message) {
	    System.out.println("MobileColleague odebral: " + message);
   }

}