package com.sdw.adapter;

import com.sdw.adaptee.WeightMachine;

public class WeighingMachineAdapterImpl implements WeightMachineAdapter{
	
	WeightMachine weight;
	
	public WeighingMachineAdapterImpl(WeightMachine weight) {
		this.weight = weight;
	}

	@Override
	public double getWeightInKg() {
		double weightInPounds = weight.getWeightInPound();
		
		double weightInKg = weightInPounds * .45;
		return weightInKg;
	}

}
