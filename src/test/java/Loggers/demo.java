package Loggers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class demo {

	public static void main(String[] args) {
	
		Logger log = LogManager.getFormatterLogger();
		log.fatal("This is fatal custom MSG");
		log.error("This is Error custom MSG");
		log.warn("This is warn custom MSG");
		log.info("This is info custom MSG"); 
		log.debug("This is debug custom MSG");
		log.trace("This is trace custom MSG");

	}

}
 