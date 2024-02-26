package com.sdw.remotecontroller;

public class Main {

	public static void main(String[] args) {
		
		//AC object
		AirConditioner air = new AirConditioner();
		
		//Remote
		MyRemoteController remote = new MyRemoteController();
		
		//create command and press button
		remote.setCommand(new TurnOnACCommand(air));
		remote.pressButton();
		
		//undo the last operation
		remote.undo();
	}
	
}
