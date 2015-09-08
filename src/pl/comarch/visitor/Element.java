package pl.comarch.visitor;

public interface Element {
	public void accept(Visitor visitor);
}