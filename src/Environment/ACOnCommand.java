package Environment;

public class ACOnCommand implements Command{
	AirConditioner airC;

	public ACOnCommand(AirConditioner ac) {
		this.airC= ac;
	}

	public void execute() {
		airC.on();
	}

	public void undo() {
		airC.off();
	}
}
