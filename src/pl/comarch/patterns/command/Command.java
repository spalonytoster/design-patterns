package pl.comarch.patterns.command;

public class Command {

	public static void main(String[] args) {
		PaintingWorkshop paintingWorkshop = new PaintingWorkshop();
		
		PaintPainting paintPainting = new PaintPainting(paintingWorkshop);
		SellPainting sellPainting = new SellPainting(paintingWorkshop);
		
		Manager manager = new Manager();
		manager.takeOrder(paintPainting);
		manager.takeOrder(sellPainting);
		manager.placeOrders();

		manager.takeOrder(paintPainting);
		manager.takeOrder(paintPainting);
		manager.takeOrder(sellPainting);
		manager.placeOrders();
		
	}

}
