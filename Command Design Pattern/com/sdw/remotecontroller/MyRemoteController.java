package com.sdw.remotecontroller;

import java.util.Stack;

public class MyRemoteController {

	Stack<ICommand> commandHistory = new Stack<>();
	ICommand command;
	
	MyRemoteController() {
		
	}
	
	public void setCommand(ICommand command) {
		this.command = command;
	}
	
	public void pressButton() {
		command.execute();
		commandHistory.add(command);
	}
	
	public void undo() {
		if(!commandHistory.isEmpty()) {
			ICommand lastCommand = commandHistory.pop();
			lastCommand.undo();
		}
	}
}
