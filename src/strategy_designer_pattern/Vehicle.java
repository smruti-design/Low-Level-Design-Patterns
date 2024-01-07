package strategy_designer_pattern;

public class Vehicle {

	DriveStrategy driveObj;
	
	Vehicle(DriveStrategy obj){
		this.driveObj = obj;
	}
	
	public void drive() {
		driveObj.drive();
	}
}
