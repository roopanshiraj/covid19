package org.testing.Utilities;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class LogsCapture {
	
	public static void takeLogs(String classname, String message)
	{
		DOMConfigurator.configure("../YTFrameWork_10thMay20/LogsLayout.xml");
		Logger l= Logger.getLogger(classname);
		l.info(message);
		
	}

}
