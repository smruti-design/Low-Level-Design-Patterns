package com.sdw.remotecontroller;

public class TurnOnACCommand implements ICommand{
	
	AirConditioner ac;
	
	TurnOnACCommand(AirConditioner ac){
		this.ac = ac;
	}

	@Override
	public void execute() {
		ac.turnOnAC();		
	}

	@Override
	public void undo() {
		ac.turnOffAC();	
	}

}
