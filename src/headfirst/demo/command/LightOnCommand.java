package headfirst.demo.command;

public class LightOnCommand implements Command {
	
	private Light light;
	
	public Light getLight() {
		return light;
	}


	public void setLight(Light light) {
		this.light = light;
	}
	
	public LightOnCommand(Light light) {
		super();
		this.light = light;
	}

	@Override
	public void execute() {
		light.on();
	}
}
