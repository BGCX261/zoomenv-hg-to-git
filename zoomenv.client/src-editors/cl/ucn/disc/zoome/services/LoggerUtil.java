package cl.ucn.disc.zoome.services;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class LoggerUtil {
	public static Logger instance;
	
	static {
		instance = Logger.getLogger("cl.ucn.disc.zoome");
		instance.setLevel(Level.OFF);
	}
}
