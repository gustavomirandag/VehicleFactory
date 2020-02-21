package br.com.infnet.vehicle;

public class Car extends Vehicle {
	protected boolean steeringWheel;
	protected boolean trunk;
	
	public Car(int id, String name, String plate, String color, boolean airBag, boolean trunk) {
		super(id, name, plate, color, 4, airBag);
		this.steeringWheel = true;
		this.trunk = trunk;
	}
}
