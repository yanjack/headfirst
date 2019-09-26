package headfirst.demo.decorate;

public class Whip extends Beverage {
	
	private Beverage beverage;
	
	public Whip(Beverage beverage) {
		super();
		this.beverage = beverage;
	}
	
	@Override
	public double cost() {
		return 0.22+beverage.cost();
	}

}
