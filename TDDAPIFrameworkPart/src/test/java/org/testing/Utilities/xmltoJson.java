package org.testing.Utilities;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.XML;

public class xmltoJson {
	
	public static String xmltojsonObject (String xml)
	{
		JSONObject responseMessage= XML.toJSONObject(xml);
		return responseMessage.toString();
	}
	
	public static String xmltojsonArray (String xml)
	{
		
		JSONArray j= new JSONArray(xml);
		return j.toString();
	}

}
