package Environment;

public class AirConditioner {
 double temperature;

 	public AirConditioner() {
		
	}
	
	public double getTemperature() {
		return temperature;
	}
	
	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}
	
	
	public void on() {
		System.out.println("AC is on");
	}

	public void off() {
		System.out.println("AC is off");
	}
}
