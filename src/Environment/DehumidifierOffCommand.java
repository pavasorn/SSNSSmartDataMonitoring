package Environment;

public class DehumidifierOffCommand implements Command {
	Dehumidifier dehumidifier;

	public DehumidifierOffCommand(Dehumidifier dehumidifier) {
		
		this.dehumidifier = dehumidifier;
	}


	public void execute() {
		dehumidifier.off();
		
	}

	public void undo() {
		dehumidifier.on();
		
	}
}
