package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.ResponseValidation.ResponseValidation;
import org.testing.TestSteps.HTTPMethods;
import org.testing.Utilities.PropertiesFileLoad;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

public class TC5 {
	
	// TC5------- Delete Request based upon id
	
	@Test
	public void testcase5() throws IOException{
		
		Properties pr= PropertiesFileLoad.propertiesFile ("../TDDAPIFrameworkPart/Env.Properties");
		HTTPMethods http= new HTTPMethods(pr);
		Response res= http.deleteRequest("QA_URI", TC1.idValue);
		
		System.out.println("Fifth TestCase");
		System.out.println(res.asString());
		System.out.println(res.statusCode());
		
		ResponseValidation.responseStatusCodeValidate(200, res);

		
		
		
		
		
	}


}