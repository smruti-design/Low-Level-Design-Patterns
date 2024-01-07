package strategy_designer_pattern;

public class NormalDriveCapability implements DriveStrategy{

	@Override
	public void drive() {
		System.out.println("normal drive capability");
	}
}
