/* 
 * Wzorzec projektowy Visitor: 
 *  -> "przerzuca" metody odpowiedzialne za obs³ugê danych na klasê wizytora, zdejmuje ten obowi¹zek z klas modelu (gdyby metody mnozenia byly w klasach modelu, to musielibysmy pisac osobna dla kazdej klasy)
 *  ->  wspomaga obsluge list, ktorych elementy sa roznych typow; brak koniecznosci uzywania klauzul if-else i operatora instanceof
 *  ->  ulatwia dopisywanie nowych funkcjonalnosci bez modyfikowania klas modelu 
 */

package pl.comarch.visitor;

import java.util.ArrayList;
import java.util.List;

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