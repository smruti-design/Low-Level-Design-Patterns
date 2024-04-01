package com.sdw.bridge;

public class Tree extends LivingThings{
	
	public Tree(BreatheImplementor breathe) {
		super(breathe);
	}

	@Override
	public void breatheProcess() {
		breathe.breathe(); 
	}
	

}
