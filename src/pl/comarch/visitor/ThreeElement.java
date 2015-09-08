package pl.comarch.visitor;

public class ThreeElement implements Element {

	int a;
	int b;
	int c;

	public ThreeElement(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
}