package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.json.JSONObject;
import org.testing.ResponseValidation.ResponseValidation;
import org.testing.TestSteps.HTTPMethods;
import org.testing.Utilities.PropertiesFileLoad;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

//TC9--------- Put Request(Update Employee Record) based upon id

public class TC9 {
	
	@Test
	public void testcase9() throws IOException
	{
		JSONObject data= new JSONObject();
		data.put("name", "updatedfirstname");
		data.put("job", "updatedjob");
		
		
		Properties pr= PropertiesFileLoad.propertiesFile ("../TDDAPIFrameworkPart/Env.Properties");
		HTTPMethods http= new HTTPMethods(pr);
		Response res= http.UpdateEmployeeInfo("dummy_securi", "users","2",data.toString());
		
		System.out.println("Ninth TestCase Response");
		System.out.println(res.asString());
		System.out.println(res.statusCode());
		
		ResponseValidation.responseStatusCodeValidate(200, res);

		
	}

}


