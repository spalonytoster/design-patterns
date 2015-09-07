package pl.comarch.patterns.state;

public class Context {
	private IState state;
	
	public Context(){
		state = new DrawSquareState();
	}
	
	public IState getState(){
		return state;
	}
	
	public void setState(IState state){
		this.state = state;
	}
	
	public void doAction(){
		state.doAction(this);
	}
	
}
