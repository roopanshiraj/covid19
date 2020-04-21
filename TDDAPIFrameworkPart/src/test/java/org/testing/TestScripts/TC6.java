package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.json.JSONObject;
import org.testing.ResponseValidation.ResponseValidation;
import org.testing.TestSteps.HTTPMethods;
import org.testing.Utilities.PropertiesFileLoad;
import org.testing.Utilities.ResponseDataParsingUsingJsonPath;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

//TC6------- Post Employee Info

public class TC6 {
	
	  static int idValue;
	
	  @Test
	  public void testcase6() throws IOException{
		  
		String name = RandomStringUtils.randomAlphabetic(10);
		JSONObject data= new JSONObject();
		data.put("name", name);
		data.put("salary", "15000");
		data.put("age", "41");
		
		
		Properties pr= PropertiesFileLoad.propertiesFile ("../TDDAPIFrameworkPart/Env.Properties");
		HTTPMethods http= new HTTPMethods(pr);
		Response res= http.PostEmployeeInfo("dummy_uri","create",data.toString());
		
		System.out.println("Sixth TestCase");
		
		System.out.println("Status code is" + res.statusCode());
		System.out.println("Data is");
		System.out.println(res.asString());
		
		ResponseValidation.responseStatusCodeValidate(200, res);
		idValue= ResponseDataParsingUsingJsonPath.response_dummyParsing(res, "data.id");
		
		System.out.println("id value is" + idValue);
	}

}
 