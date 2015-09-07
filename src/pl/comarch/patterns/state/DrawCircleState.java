package pl.comarch.patterns.state;

public class DrawCircleState implements IState{

	@Override
	public void doAction(Context context) {
		System.out.println("Drawing circle...");

		context.setState(new DrawSquareState());
	}

	@Override
	public void goNext(Context context) {
		
	}
	

}
