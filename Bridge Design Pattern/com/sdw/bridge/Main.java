package com.sdw.bridge;

public class Main {

	public static void main(String[] args) {
		
		LivingThings obj = new Fish(new WaterBreathe());
		obj.breatheProcess();

	}

}
