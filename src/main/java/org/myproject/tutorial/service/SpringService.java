package org.myproject.tutorial.service;

//import org.apache.log4j.Logger;

public class SpringService {

	//protected static Logger logger = Logger.getLogger("service");
	
	public String echo(String msg) {
		
		
		return "Hello " + msg + " from Spring!";
	}
}
