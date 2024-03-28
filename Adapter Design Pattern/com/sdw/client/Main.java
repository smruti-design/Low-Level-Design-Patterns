package com.sdw.client;

import com.sdw.adaptee.WeightMachineForBabies;
import com.sdw.adapter.WeighingMachineAdapterImpl;
import com.sdw.adapter.WeightMachineAdapter;

public class Main {

	public static void main(String[] args) {

		WeightMachineAdapter weight = new WeighingMachineAdapterImpl(new WeightMachineForBabies());
		System.out.println(weight.getWeightInKg());

	}

}
