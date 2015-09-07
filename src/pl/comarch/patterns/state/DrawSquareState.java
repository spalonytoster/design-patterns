package pl.comarch.patterns.state;

public class DrawSquareState implements IState{

	@Override
	public void doAction(Context context) {
		System.out.println("Drawing square...");
		context.setState(new DrawCircleState());
	}

	@Override
	public void goNext(Context context) {
		context.setState(this);
	}

}
