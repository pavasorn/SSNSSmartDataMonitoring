package Environment;

public class EnvironmentManagement {

	public static void main(String[] args) {
		double temperature = 20 ;
		double humidityLevel=40;
		
		Heater heater = new Heater();
		AirConditioner AC= new AirConditioner();
		Dehumidifier dehumidifier= new Dehumidifier();
		Humidifier humidifier = new Humidifier();
		
		HeaterOffCommand heaterOff= new HeaterOffCommand(heater);
		HeaterOnCommand heaterOn= new HeaterOnCommand(heater);
		ACOffCommand acOff= new ACOffCommand(AC);
		ACOnCommand acOn=new ACOnCommand(AC);
		DehumidifierOffCommand dehumidifierOff= new DehumidifierOffCommand(dehumidifier);
		DehumidifierOnCommand dehumidifierOn= new DehumidifierOnCommand(dehumidifier);
		HumidifierOffCommand humidifierOff= new HumidifierOffCommand(humidifier);
		HumidifierOnCommand humidifierOn= new HumidifierOnCommand(humidifier);
		
		Command[] AllOn = { acOn, heaterOn, humidifierOn, dehumidifierOn};
		Command[] AllOff = { acOff, heaterOff, humidifierOff, dehumidifierOff};

		MacroCommand AllOnCommands = new MacroCommand(AllOn);
		AllOnCommands.execute();
	}

}
