package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.ResponseValidation.ResponseValidation;
import org.testing.TestSteps.HTTPMethods;
import org.testing.Utilities.PropertiesFileLoad;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

public class TC10 {
	
	// TC10------- Delete Employee Info based upon id
	
	
	@Test
	public void testCase10() throws IOException {
		
		Properties pr= PropertiesFileLoad.propertiesFile ("../TDDAPIFrameworkPart/Env.Properties");
		HTTPMethods http= new HTTPMethods(pr);
		Response res = http.DeleteEmployeeInfo("dummy_securi", "users", "2");
		
		System.out.println("Tenth TestCase");
		System.out.println(res.asString());
		System.out.println(res.statusCode());
		
		ResponseValidation.responseStatusCodeValidate(204, res);

	
	}

}
