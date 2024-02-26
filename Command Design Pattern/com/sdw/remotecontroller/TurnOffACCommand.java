package com.sdw.remotecontroller;

public class TurnOffACCommand implements ICommand{
	
	AirConditioner ac;
	
	TurnOffACCommand(AirConditioner ac){
		this.ac = ac;
	}

	@Override
	public void execute() {
		ac.turnOffAC();		
	}

	@Override
	public void undo() {
		ac.turnOnAC();	
	}

}
