package pl.comarch.mediator;

import java.util.ArrayList;

public class ConcreteMediator implements Mediator {
	  private ArrayList<Colleague> colleagues;

	  public ConcreteMediator() {
	    colleagues = new ArrayList<Colleague>();
	  }

	  public void addColleague(Colleague colleague) {
	    colleagues.add(colleague);
	  }

	  public void send(String message, Colleague originator) {

	    for(Colleague colleague: colleagues) 
	      if(colleague != originator) 
	    	  colleague.receive(message);
	  }
}
