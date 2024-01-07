package strategy_designer_pattern;

public class SportsVehicle extends Vehicle{
	
	SportsVehicle(){ 
		super(new SpecialDriveCapability());	
	}
	
}
