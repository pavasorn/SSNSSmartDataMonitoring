package Environment;

public class DehumidifierOnCommand implements Command {
	Dehumidifier dehumidifier;

	public DehumidifierOnCommand(Dehumidifier dehumidifier) {
		
		this.dehumidifier = dehumidifier;
	}


	public void execute() {
		dehumidifier.on();
		
	}

	public void undo() {
		dehumidifier.off();
		
	}
}
