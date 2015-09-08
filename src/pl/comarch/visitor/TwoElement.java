package pl.comarch.visitor;

public class TwoElement implements Element {

	int a;
	int b;

	public TwoElement(int a, int b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
}
