package Environment;

public class ACOffCommand implements Command{
	AirConditioner airC;

	public ACOffCommand(AirConditioner ac) {
		this.airC= ac;
	}

	public void execute() {
		airC.off();
	}

	public void undo() {
		airC.on();
	}
}
