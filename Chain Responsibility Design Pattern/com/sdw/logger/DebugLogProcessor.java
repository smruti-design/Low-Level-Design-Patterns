package com.sdw.logger;

public class DebugLogProcessor extends LogProcessor {
	
	DebugLogProcessor(LogProcessor logger) {
		super(logger);
	}
	
	public void log(int level, String message) {
		if(level == DEBUG) {
			System.out.println("DEBUG: "+ message);
		}else {
			super.log(level, message);
		}
	}

}
