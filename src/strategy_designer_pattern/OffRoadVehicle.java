package strategy_designer_pattern;

public class OffRoadVehicle extends Vehicle{

	OffRoadVehicle(){
		super(new SpecialDriveCapability());
	}
}
