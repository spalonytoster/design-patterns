/* 
 * Wzorzec projektowy Visitor: 
 *  -> "przerzuca" metody odpowiedzialne za obs³ugê danych na klasê wizytora, zdejmuje ten obowi¹zek z klas modelu (gdyby metody mnozenia byly w klasach modelu, to musielibysmy pisac osobna dla kazdej klasy)
 *  ->  wspomaga obsluge list, ktorych elementy sa roznych typow; brak koniecznosci uzywania klauzul if-else i operatora instanceof
 *  ->  ulatwia dopisywanie nowych funkcjonalnosci bez modyfikowania klas modelu 
 */

package pl.comarch.visitor;

import java.util.ArrayList;
import java.util.List;

interface Visitor {
	public void visit(TwoElement str);
	public void visit(ThreeElement flo);
	public void visit(List<Element> elementList);
}

interface Element {
	public void accept(Visitor visitor);
}

class TwoElement implements Element {

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

class ThreeElement implements Element {

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

class SumVisitor implements Visitor {

	@Override
	public void visit(TwoElement twoElement) {
		int sum = twoElement.a + twoElement.b;
		System.out.println(twoElement.a + "+" + twoElement.b + "=" + sum);
	}

	@Override
	public void visit(ThreeElement threeElement) {
		int sum = threeElement.a + threeElement.b + threeElement.c;
		System.out.println(threeElement.a + "+" + threeElement.b + "+" + threeElement.c + "=" + sum);
	}

	@Override
	public void visit(List<Element> elementList) {
		for (Element element : elementList) {
			element.accept(this);
		}
	}
}

class MultiplyVisitor implements Visitor {

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

public class VisitorDemo {
    public static void main(String[] args) {
    	TwoElement two1 = new TwoElement(3, 3);
		TwoElement two2 = new TwoElement(2, 7);
		ThreeElement three1 = new ThreeElement(3, 4, 5);

		List<Element> numberElements = new ArrayList<Element>();
		numberElements.add(two1);
		numberElements.add(two2);
		numberElements.add(three1);

		System.out.println("Odwiedzam elementy SumVisitor'em");
		Visitor sumVisitor = new SumVisitor();
		sumVisitor.visit(numberElements);

		System.out.println("\nOdwiedzam elementy MultiplyVisitor'em");
		Visitor printVisitor = new MultiplyVisitor();
		printVisitor.visit(numberElements);

    }
}