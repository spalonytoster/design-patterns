package pl.comarch.patterns.state;

public interface IState {
	public void doAction(Context contex);
	public void goNext(Context context);
}
