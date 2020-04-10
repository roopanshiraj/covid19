package org.testing.Utilities;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.XML;

public class jsontoXML {
	
	public static String jsontoXMLConversion(String jsonData)
	{
		JSONObject j= new JSONObject(jsonData);
		return XML.toString(j);
	}
	
	public static String jsontoXMLConversionn(String jsonData)
	{
		JSONArray j1= new JSONArray(jsonData);
		return XML.toString(j1);
	}

}
