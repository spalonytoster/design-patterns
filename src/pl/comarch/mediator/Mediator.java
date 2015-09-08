package pl.comarch.mediator;

public interface Mediator {
	public void send(String message, Colleague colleague);
}
