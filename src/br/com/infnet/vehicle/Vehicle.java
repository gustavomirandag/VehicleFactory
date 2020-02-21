package br.com.infnet.vehicle;

public abstract class Vehicle {	
	protected int id;
	protected String name;
	protected String plate;
	protected String color;
	protected int wheels;	
	protected boolean airBag;
	protected int speed;
	private final int MAX_SPEED = 200;
	
	public Vehicle(int id, String name, String plate, String color, int wheels, boolean airBag) {
		this.id = id;
		this.name = name;
		this.plate = plate;
		this.color = color;
		this.wheels = wheels;		
		this.airBag = airBag;
		speed = 0;
	}
	
	public void setSpeed(int speed) {
		if (speed >= MAX_SPEED)
			this.speed = MAX_SPEED;
		else
			this.speed = speed;
	}

	public void speedUp(int speed) {
		if(this.speed+speed>MAX_SPEED)
			this.speed=MAX_SPEED;
		else 
			this.speed+=speed; //this.speed = this.speed + speed;
	}
	
	//Função que decrementa a velocidade do veículo em "speed" kilometros
	public void speedDown(int speed) {
		if(this.speed-speed<=0)
			this.speed=0;
		else
			this.speed -= speed; //this.speed = this.speed - speed
	}
	//myVehicle.fullBreak();
	//myVehicle.turnLeft(5);
	//myVehicle.turnRight(5);

	
	
}
