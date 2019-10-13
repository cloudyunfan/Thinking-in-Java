//: DateFormatTest.java
import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;

public class DateFormatTest {
	public static void main(String[] args) {
		Date now = new Date();
		//String strDateFormat = ;
		//SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);
		System.out.println(now.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
	}
}