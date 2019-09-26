package headfirst.demo.command;

public class SimpleRemoteControl {
	private Command command;

	public Command getCommand() {
		return command;
	}

	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void buttonWasPressed(){
		command.execute();
	}
}
