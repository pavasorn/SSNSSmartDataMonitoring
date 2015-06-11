package Environment;

public class HeaterOnCommand implements Command{
	Heater heater;

	public HeaterOnCommand(Heater heater) {
		
		this.heater = heater;
	}


	public void execute() {
		heater.on();
		
	}

	
	public void undo() {
		heater.off();
		
	}

}
