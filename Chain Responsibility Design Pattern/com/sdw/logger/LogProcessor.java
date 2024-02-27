package com.sdw.logger;

public abstract class LogProcessor {

	public static int INFO = 1;
	public static int DEBUG = 2;
	public static int ERROR = 3;
	
	LogProcessor nextLogger;
	
	LogProcessor(LogProcessor logger){
		this.nextLogger = logger;
	}
	
	public void log(int level , String message) {
		if(nextLogger != null) {
			nextLogger.log(level, message);
		}
	}
	
}
