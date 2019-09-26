package headfirst.demo.strategy;

public class FlyNoWay implements FlyBehavoir {

	@Override
	public void fly() {
		System.out.println("can not flay");
	}

}
