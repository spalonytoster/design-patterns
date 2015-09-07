package pl.comarch.patterns.command;
import java.util.ArrayList;
import java.util.List;

public class Manager {

	private List<IOrder> list = new ArrayList<>();
	
	public void takeOrder(IOrder o){
		list.add(o);
	}
	
	public void placeOrders(){
		for (IOrder order : list){
			order.execute();
		}
		list.clear();
	}
	
}
