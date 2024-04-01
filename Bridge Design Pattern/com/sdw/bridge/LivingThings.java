package com.sdw.bridge;

public abstract class LivingThings {
	
	public LivingThings(BreatheImplementor breathe) {
		super();
		this.breathe = breathe;
	}

	BreatheImplementor breathe;
	
	abstract public void breatheProcess();

}
