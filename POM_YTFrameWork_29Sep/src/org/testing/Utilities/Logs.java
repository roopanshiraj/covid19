package org.testing.Utilities;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class Logs {
	
	public static void take_log(String classname, String message)
	{
		DOMConfigurator.configure("C:\\Users\\hp\\git\\LocalRepository\\POM_YTFrameWork_29Sep\\layout.xml");
		Logger l= Logger.getLogger(classname);
		l.info(message);
		
		
	}

}
