package pl.comarch.mediator;

public abstract class Colleague {
	  private Mediator mediator;

	  public Colleague(Mediator m) {
	    mediator = m;
	  }

	  public void send(String message) {
	    mediator.send(message, this);
	  }

	  public abstract void receive(String message);
	  
	  public Mediator getMediator() {return mediator;}
}
