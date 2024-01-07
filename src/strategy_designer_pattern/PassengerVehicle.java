package strategy_designer_pattern;

public class PassengerVehicle extends Vehicle {

	PassengerVehicle(){
		super(new NormalDriveCapability());
	}
}
