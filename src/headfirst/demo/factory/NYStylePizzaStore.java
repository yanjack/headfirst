package headfirst.demo.factory;

public class NYStylePizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		return this.getSimpleFactory().createPizza(type);
	}

}
