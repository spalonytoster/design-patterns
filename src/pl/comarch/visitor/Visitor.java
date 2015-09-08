package pl.comarch.visitor;

import java.util.List;

public interface Visitor {
	public void visit(TwoElement str);
	public void visit(ThreeElement flo);
	public void visit(List<Element> elementList);
}