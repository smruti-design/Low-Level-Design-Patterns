package com.sdw.logger;

public class ErrorLogProcessor extends LogProcessor {
	
	ErrorLogProcessor(LogProcessor logger) {
		super(logger);
	}
	
	public void log(int level, String message) {
		if(level == ERROR) {
			System.out.println("ERROR: "+ message);
		}else {
			super.log(level, message);
		}
	}

}
