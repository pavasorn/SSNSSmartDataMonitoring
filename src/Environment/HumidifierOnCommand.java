package Environment;

public class HumidifierOnCommand implements Command {
	Humidifier humidifier;

	public HumidifierOnCommand(Humidifier humidifier) {
		
		this.humidifier = humidifier;
	}


	public void execute() {
		humidifier.on();
		
	}

	public void undo() {
		humidifier.off();
		
	}


}
