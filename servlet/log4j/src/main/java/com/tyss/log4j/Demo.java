package com.tyss.log4j;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Demo {
	
	static Logger log = LogManager.getLogger("prince");
	public static void main(String[] args) {
		
		System.out.println("--------------------I am Ready---------------------");
		
		log.trace("I am trace Method");
		log.debug("I am debug Method");
		log.info("I am info Method");
		log.warn("I am warn Method");
		log.debug("I am debug Method");
		log.fatal("I am fatal Method");
		
		// we can change in log file log4j.rootLogger=DEBUG
	}

}
