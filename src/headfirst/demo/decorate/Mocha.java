package headfirst.demo.decorate;

public class Mocha extends Beverage {
	
	private Beverage beverage;
	
	
	public Mocha(Beverage beverage) {
		super();
		this.beverage = beverage;
	}
	
	@Override
	public double cost() {
		return 0.33+beverage.cost();
	}

}
