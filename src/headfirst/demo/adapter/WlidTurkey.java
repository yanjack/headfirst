package headfirst.demo.adapter;

import headfirst.demo.adapter.Turkey;

public class WlidTurkey implements Turkey {
	@Override
	public void gobble() {
		System.out.println("Gobble gobble");
		
	}

	@Override
	public void fly() {
		System.out.println("I'm flying a short distance");
	}
}
