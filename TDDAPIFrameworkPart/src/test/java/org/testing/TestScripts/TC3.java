package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.ResponseValidation.ResponseValidation;
import org.testing.TestSteps.HTTPMethods;
import org.testing.Utilities.PropertiesFileLoad;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

// TC3-------------GET Request for all the id
// We will take id value from TC1

public class TC3 
{
    @Test
	public void testcase3() throws IOException
	{
		Properties pr= PropertiesFileLoad.propertiesFile ("../TDDAPIFrameworkPart/Env.Properties");
		HTTPMethods http= new HTTPMethods(pr);
		Response res= http.GetRequest("QA_URI");
		
		System.out.println("Third TestCase");
		System.out.println("Response is " + res.asString());
		System.out.println("Status code is "+ res.statusCode());
		
		ResponseValidation.responseStatusCodeValidate(200, res);


	}
}
