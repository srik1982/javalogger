package com.test.logger;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Tester {

	private static Logger logger = Logger.getLogger("com.test.blogger");
	
	public static void main(String args[]) {
//		try {
//		    FileInputStream configFile = new FileInputStream("LoggingConfiguration.properties");
////		    preferences.load(configFile);
////		    InputStream configFile = new In
//		    LogManager.getLogManager().readConfiguration(configFile);
//		} catch (IOException ex)
//		{
//		    System.out.println("WARNING: Could not open configuration file");
//		    System.out.println("WARNING: Logging not configured (console output only)");
//		}
		
		logger.severe("askdjfhaklsdhfalk");
	}
}
