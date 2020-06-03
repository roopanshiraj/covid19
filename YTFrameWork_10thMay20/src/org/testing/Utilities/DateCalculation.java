package org.testing.Utilities;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateCalculation {
	
	public static String dateCalculation()
	{
		
		/*Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, 1);
		Date date = cal.getTime();
		SimpleDateFormat format1 = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
		
		String inActiveDate = null;
		
		inActiveDate = format1.format(date);
		return inActiveDate;*/
		
		
		Date d= new Date();
		String timestamp= new SimpleDateFormat("yyyy_MM_dd_hh_mm_ss").format(d);
		return timestamp;
		
		
	}

}
