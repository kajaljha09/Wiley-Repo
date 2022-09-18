package day9; //always on the first statement
import java.util.Calendar;
import java.util.Date;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.LocalDateTime;

public class demoClass {
	public static void main(String[] args) {
		Date date =new Date();
		System.out.println(date);
		Calendar calendar= Calendar.getInstance();
		calendar.setTime(date);
		System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
		System.out.println(calendar.get(Calendar.YEAR));
		
		
		LocalDate jan1=LocalDate.of(2022, 1, 1);    //if import Month
		
		System.out.println(jan1);
		
		LocalDate jan2=LocalDate.of(2022, Month.FEBRUARY, 1);
		System.out.println(jan2);
		LocalDate dt=LocalDate.parse("2022-03-12");
		System.out.println(dt);
		 //date formatter
		
	}

}
