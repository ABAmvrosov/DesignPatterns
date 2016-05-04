package net.aab.DesignPatterns.MediatorPattern;

public class Sensor {
	
	public boolean checkTemperature(int temp){
		System.out.println("Temperature reached "+temp+" *C");
		return true;
	}

}
