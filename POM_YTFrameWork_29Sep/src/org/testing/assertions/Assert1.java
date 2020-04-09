package org.testing.assertions;

public class Assert1 {
	
	public static Boolean assert1 (String exp, String act)
	{
		if (exp.equals(act))
		{
			System.out.println("Both the strings are matching");
			return true;
		}
		
		else
		{
			System.out.println("Both the strings are not matching");
			return false;
		}
	}

} 
