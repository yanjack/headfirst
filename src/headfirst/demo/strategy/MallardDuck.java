package headfirst.demo.strategy;

public class MallardDuck extends Duck {
	public static void main(String[] args) {
		Duck duck=new MallardDuck();
		duck.setFlyBehavoir(new FlyNoWay());
		duck.performFly();
	}
}
