package headfirst.demo.factory;

public abstract class PizzaStore {
	
	private SimplePizzaFactory simpleFactory;
	
	public SimplePizzaFactory getSimpleFactory() {
		return simpleFactory;
	}

	public void setSimpleFactory(SimplePizzaFactory simpleFactory) {
		this.simpleFactory = simpleFactory;
	}

	public Pizza orderPizza(String type){
		Pizza pizza=createPizza(type);
		pizza.prepare();
		pizza.bake();
		return pizza;
	}
	public abstract Pizza createPizza(String type);
}
