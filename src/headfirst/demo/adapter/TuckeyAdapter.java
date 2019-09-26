package headfirst.demo.adapter;

import headfirst.demo.strategy.Duck;

public class TuckeyAdapter extends Duck {
	
	private Turkey turkey;

	public TuckeyAdapter(Turkey turkey) {
		super();
		this.turkey = turkey;
	}
	
	public void performFly(){
		turkey.fly();
	}
	
	public void performQuack(){
		turkey.gobble();
	}
}
