package com.sdw.vehiclenull;

public class VehicleFactory {
	
	static Vehicle getVehicleType(String type) {
		if("Car".equals(type)) {
			return new Car();
		}
		return new NullObject();
	}

}
