package pl.comarch.mediator;

public class ConcreteColleague extends Colleague {

	  public ConcreteColleague(Mediator m) {
		super(m);
	}

	public void receive(String message) {

	    System.out.println("Colleague odebral: " + message);

	  }

}