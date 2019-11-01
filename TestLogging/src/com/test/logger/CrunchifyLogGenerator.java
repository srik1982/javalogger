package com.test.logger;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.logging.XMLFormatter;
 
/**
 * @author Crunchify.com 
 * Version: 1.0 
 * Simplest way to generate logs files using SimpleFormatter and XMLFormatter
 */
 
public class CrunchifyLogGenerator {
 
	public static void main(String[] args) {
 
		// A Logger object is used to log messages for a specific system or application
		// component. Loggers are normally named, using a hierarchical dot-separated
		// namespace. Logger names can be arbitrary strings, but they should normally be
		// based on the package name or class name of the logged component, such as
		// java.net or javax.swing. In addition it is possible to create "anonymous"
		// Loggers that are not stored in the Logger namespace.
		Logger crunchifyLogger = Logger.getLogger("crunchifyLog");
 
		// Simple file logging Handler.
		FileHandler crunchifyFileHandler;
		
		try {
 
			// We are setting handler to true = append data to file
			crunchifyFileHandler = new FileHandler("D:\\crunchify-log.log", true);
			crunchifyLogger.addHandler(crunchifyFileHandler);
 
			// Print a brief summary of the LogRecord in a human readable format.
			SimpleFormatter formatter = new SimpleFormatter();
			crunchifyFileHandler.setFormatter(formatter);
			
			// Format a LogRecord into a standard XML format. Uncomment below 2 lines to see XML result.
	
			// XMLFormatter formatter2 = new XMLFormatter();
			// crunchifyFileHandler.setFormatter(formatter2);
 
			int n = 1;
 
			// infinite loop
			while (true) {
				// Log an INFO message.
				crunchifyLogger.info("Adding Crunchify Log line: " + n);
				Thread.sleep(1000);
				n++;
			}
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
 
	}
 
}