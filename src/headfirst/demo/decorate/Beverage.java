package headfirst.demo.decorate;

public abstract class Beverage {
	private String descption;

	public String getDescption() {
		return descption;
	}
	public abstract double cost();
}
