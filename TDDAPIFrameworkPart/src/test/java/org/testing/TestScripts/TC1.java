package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.json.JSONObject;
import org.testing.ResponseValidation.ResponseValidation;
import org.testing.TestSteps.HTTPMethods;
import org.testing.Utilities.PropertiesFileLoad;
import org.testing.Utilities.ResponseDataParsingUsingJsonPath;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

//TC1------- Post Request

public class TC1 {
	
	  static String idValue;
	
	  @Test
	  public void testcase1() throws IOException{
		  
		  Random r= new Random();   // To generate random id
		  Integer i= r.nextInt();
		  System.out.println("Random number generated is" + i);
		  
		  String firstname= RandomStringUtils.randomAlphabetic(10);   //To generate random string
		  System.out.println("Random name generated is" + firstname);
		
		JSONObject data= new JSONObject();
		data.put("firstname", firstname);
		data.put("lastname", "Virus");
		data.put("id", i.toString());
		data.put("designation", "Sr. QA");
		
		
		Properties pr= PropertiesFileLoad.propertiesFile ("../TDDAPIFrameworkPart/Env.Properties");
		HTTPMethods http= new HTTPMethods(pr);
		Response res= http.PostRequest("QA_URI", data.toString());
		
		System.out.println("Status code is" + res.statusCode());
		System.out.println("Data is");
		System.out.println(res.asString());
		
		ResponseValidation.responseStatusCodeValidate(201, res);
		idValue= ResponseDataParsingUsingJsonPath.response_parsing(res, "id");
		
		System.out.println("id value is" + idValue);
	}

}
 