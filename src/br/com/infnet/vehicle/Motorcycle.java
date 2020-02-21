package br.com.infnet.vehicle;

public class Motorcycle extends Vehicle {

	private boolean handlebar;
	private boolean windshield;
	
	public Motorcycle(int id, String name, String plate, String color,
						boolean airBag, boolean windshield) {
		
		super(id, name, plate, color, 2, false, airBag);
		
		this.handlebar = true;
		this.windshield = windshield;
	}
	
	public boolean getHandlebar() {
		return this.handlebar;
	}
	
	public void setWindshield(boolean windshield) {
		this.windshield = windshield;
	}
	
	public boolean getWindshield() {
		return this.windshield;
	}

}
