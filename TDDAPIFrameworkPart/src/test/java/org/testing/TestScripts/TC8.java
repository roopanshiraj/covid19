package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.ResponseValidation.ResponseValidation;
import org.testing.TestSteps.HTTPMethods;
import org.testing.Utilities.PropertiesFileLoad;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

//TC8-------------GET Request for all the id of Employees


public class TC8 {
	
	
		@Test
		public void testcase8() throws IOException
		{
			Properties pr= PropertiesFileLoad.propertiesFile ("../TDDAPIFrameworkPart/Env.Properties");
			HTTPMethods http= new HTTPMethods(pr);
			Response res= http.GetAllEmployeeInfoBasesUponId("EMP_GET_ALLID_URL");
			
			System.out.println("Eight TestCase");
			System.out.println("Response is " + res.asString());
			System.out.println("Status code is "+ res.statusCode());
			
			ResponseValidation.responseStatusCodeValidate(200, res);


		}
	}




