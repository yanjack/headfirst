package headfirst.demo.strategy;


public class Duck {
	/**
	 * 把会变化的行为抽离出来封装
	 */
	private FlyBehavoir flyBehavoir;
	private QuackBehavior quackBehavior;
	public FlyBehavoir getFlyBehavoir() {
		return flyBehavoir;
	}
	public void setFlyBehavoir(FlyBehavoir flyBehavoir) {
		this.flyBehavoir = flyBehavoir;
	}
	public QuackBehavior getQuackBehavior() {
		return quackBehavior;
	}
	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
	
	public void performFly(){
		flyBehavoir.fly();
	}
	
	public void performQuack(){
		quackBehavior.quack();
	}
}
