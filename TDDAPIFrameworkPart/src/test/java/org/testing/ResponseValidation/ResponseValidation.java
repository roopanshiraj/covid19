package org.testing.ResponseValidation;

// status code validate
// data validate

import com.jayway.restassured.response.Response;

public class ResponseValidation {
	
	public static void responseStatusCodeValidate(int expectedStatusCode, Response res)
	{
		if (expectedStatusCode== res.getStatusCode())
		{
			System.out.println("Test case pass with status code" + res.statusCode());
		}
		
		else
		{
			System.out.println("Test case failed with status code" + res.statusCode());
		}
	}

}
