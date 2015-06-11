package Environment;

public class HeaterOffCommand implements Command {
	Heater heater;

	public HeaterOffCommand(Heater heater) {
		
		this.heater = heater;
	}


	public void execute() {
		heater.off();
		
	}

	
	public void undo() {
		heater.on();
		
	}
}
