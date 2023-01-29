package dev.store.log;

import org.testng.log4testng.Logger;

public class Log {

	private static Logger Log = Logger.getLogger(Log.class);
	
	public static void startTestCase(String sTestCaseName){
		Log.info("----------------------------------------------------------------------------------------");
		Log.info("---------------------                 "+sTestCaseName+ "       -------------------------");
		Log.info("----------------------------------------------------------------------------------------");
	}
	
	public static void endTestCase(String sTestCaseName){
		Log.info("---------------------             "+"-E---N---D-"+"            -------------------------");
		Log.info("--");
		Log.info("--");
	}
	public static void info(String message) {
		Log.info(message);
	}
	
	public static void error(String message) {
	    Log.error(message);
	}
	
	public static void fatal(String message) {
	    Log.fatal(message);
	}
	
	public static void debug(String message) {
		Log.debug(message);
	}
	
}
