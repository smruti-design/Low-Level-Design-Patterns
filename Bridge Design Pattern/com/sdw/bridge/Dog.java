package com.sdw.bridge;

public class Dog extends LivingThings{

	public Dog(BreatheImplementor breathe) {
		super(breathe);
	}

	@Override
	public void breatheProcess() {
		breathe.breathe(); 
	}
	
	

}
