package pl.comarch.visitor;

import java.util.List;

public class MultiplyVisitor implements Visitor {

	@Override
	public void visit(TwoElement twoElement) {
		int product = twoElement.a * twoElement.b;
		System.out.println(twoElement.a + "*" + twoElement.b + "=" + product);
	}

	@Override
	public void visit(ThreeElement threeElement) {
		int product = threeElement.a * threeElement.b * threeElement.c;
		System.out.println(threeElement.a + "*" + threeElement.b + "*" + threeElement.c + "=" + product);
	}

	@Override
	public void visit(List<Element> elementList) {
		for (Element element : elementList) {
			element.accept(this);
		}
	}
}
