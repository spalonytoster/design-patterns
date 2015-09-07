package pl.comarch.patterns.command;

public class PaintPainting implements IOrder{

	private PaintingWorkshop paintingWorkshop;
	
	public PaintPainting(PaintingWorkshop paintingWorkshop) {
		this.paintingWorkshop = paintingWorkshop;
	}
	
	@Override
	public void execute() {
		paintingWorkshop.paint();
	}

}
