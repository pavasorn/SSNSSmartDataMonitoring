package Environment;

public class HumidifierOffCommand implements Command {
	Humidifier humidifier;

	public HumidifierOffCommand(Humidifier humidifier) {
		
		this.humidifier = humidifier;
	}


	public void execute() {
		humidifier.off();
		
	}

	public void undo() {
		humidifier.on();
		
	}
}
