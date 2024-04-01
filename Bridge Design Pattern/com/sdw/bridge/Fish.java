package com.sdw.bridge;

public class Fish extends LivingThings{
	
	public Fish(BreatheImplementor breathe) {
		super(breathe);
	}

	@Override
	public void breatheProcess() {
		breathe.breathe(); 
	}
	

}
