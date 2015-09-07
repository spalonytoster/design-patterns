package pl.comarch.patterns.command;

public class SellPainting implements IOrder{

	private PaintingWorkshop paintingWorkshop;
	
	public SellPainting(PaintingWorkshop paintingWorkshop) {
		this.paintingWorkshop = paintingWorkshop;
	}
	
	@Override
	public void execute() {
		paintingWorkshop.sell();
	}

}
