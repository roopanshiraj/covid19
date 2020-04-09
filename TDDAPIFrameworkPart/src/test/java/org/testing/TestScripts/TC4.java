 package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.json.JSONObject;
import org.testing.ResponseValidation.ResponseValidation;
import org.testing.TestSteps.HTTPMethods;
import org.testing.Utilities.PropertiesFileLoad;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

// TC4--------- Put Request(Update Request) based upon id

public class TC4 {
	
		@Test
		public void testcase4() throws IOException{
			
			JSONObject data= new JSONObject();
			data.put("firstname", "updatedfirstname");
			data.put("lastname", "updatedlastname");
			data.put("id", "TC1.idValue");
			data.put("designation", "Sr. QA");
			
			
			Properties pr= PropertiesFileLoad.propertiesFile ("../TDDAPIFrameworkPart/Env.Properties");
			HTTPMethods http= new HTTPMethods(pr);
			Response res= http.PutRequest("QA_URI", TC1.idValue, data.toString());
			
			System.out.println("Fourth TestCase");
			System.out.println(res.asString());
			System.out.println(res.statusCode());
			
			ResponseValidation.responseStatusCodeValidate(200, res);

			
		}
	

}
