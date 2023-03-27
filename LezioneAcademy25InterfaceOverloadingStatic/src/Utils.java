import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Utils {

	
	
	public static String today() {
	
		return new Date().toString();
		
	}
	
	
	
	public static String todayPlus(int year,  int addDays) {
		
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		
		//DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		
		Date currentDate = new Date();
		System.out.println(dateFormat.format(currentDate));

		// convert date to calendar
		Calendar c = Calendar.getInstance();
		c.setTime(currentDate); 

		// manipulate date
		c.add(Calendar.YEAR, year);
//		c.add(Calendar.MONTH, 1);
		c.add(Calendar.DATE, addDays); // same with c.add(Calendar.DAY_OF_MONTH, 1);
//		c.add(Calendar.HOUR, 1);
//		c.add(Calendar.MINUTE, 1);
//		c.add(Calendar.SECOND, 1);

		// convert calendar to date
		Date currentDatePlusOne = c.getTime();
				
		return dateFormat.format(currentDatePlusOne);
	}
	
	
}
