package pl.comarch.mediator;

public class MediatorDemo {

	public static void main(String[] args) {
	    ConcreteMediator mediator = new ConcreteMediator();

	    Colleague desktop = new ConcreteColleague(mediator);
	    Colleague mobile = new MobileColleague(mediator);
	    mediator.addColleague(desktop);
	    mediator.addColleague(mobile);

	    desktop.send("Hello World");
	    mobile.send("Hello");
	}

}
