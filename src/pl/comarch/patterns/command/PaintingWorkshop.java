package pl.comarch.patterns.command;

public class PaintingWorkshop{

	private int paintingCount = 0;
	private String name = "Ghyl";

	public void paint(){
		System.out.println("In " + name + " painter starts painting");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("In " + name + " painter ends painting");
		paintingCount++;
	}
	
	public void sell(){
		if (paintingCount <=0)
			throw new IllegalAccessError("There are no paintings!!!");
		System.out.println("In " + name + " painter sold painting");
		paintingCount--;
		System.out.println("\tpainting left: " + paintingCount);
	}
	
	
}
