import br.com.infnet.vehicle.*;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle myVehicle = new Car(0,"Mazda","KRU-2032", "Black",false, true);
		myVehicle.setSpeed(10);
		myVehicle.speedUp(20);
		myVehicle.speedDown(20);
		
		myVehicle = new Motorcycle(1, "Harley Davidson", "UVX-1213", "Black", false, true);
		
		//myVehicle.fullBreak();
		//myVehicle.turnLeft(5);
		//myVehicle.turnRight(5);
	}

}
