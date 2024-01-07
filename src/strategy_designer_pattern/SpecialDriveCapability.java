package strategy_designer_pattern;

public class SpecialDriveCapability implements DriveStrategy{
	
	@Override
	public void drive() {
		System.out.println("special drive capability");
	}

}
