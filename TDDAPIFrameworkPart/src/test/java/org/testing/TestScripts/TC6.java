/*package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.json.JSONObject;
import org.testing.ResponseValidation.ResponseValidation;
import org.testing.TestSteps.HTTPMethods;
import org.testing.Utilities.PropertiesFileLoad;
import org.testing.Utilities.ResponseDataParsingUsingJsonPath;

import com.jayway.restassured.response.Response;

//TC6------- Post Employee Info

public class TC6 {
	
	  static String idValue;
	
	public void testcase6() throws IOException{
		
		JSONObject data= new JSONObject();
		data.put("name", "Eddie");
		data.put("salary", "15000");
		data.put("age", "41");
		
		
		Properties pr= PropertiesFileLoad.propertiesFile ("../TDDAPIFrameworkPart/Env.Properties");
		HTTPMethods http= new HTTPMethods(pr);
		Response res= http.PostEmployeeInfo("EMP_POST_URI", data.toString());
		
		System.out.println("Sixth TestCase");
		
		System.out.println("Status code is" + res.statusCode());
		System.out.println("Data is");
		System.out.println(res.asString());
		
		ResponseValidation.responseStatusCodeValidate(201, res);
		idValue= ResponseDataParsingUsingJsonPath.response_parsing(res, "id");
		
		System.out.println("id value is" + idValue);
	}

}*/
 