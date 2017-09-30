package evolution.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.chrono.Era;

public class AnyClass {
	public static void main(String[] args) {
		LocalDate localDate0 = LocalDate.now();
		System.out.println(localDate0);
		Era era = localDate0.getEra();
		System.out.println(era);
		LocalDate localDate1 = LocalDate.of(2017, 3, 31);
		System.out.println(localDate1);
		LocalDate localDate2 = LocalDate.ofYearDay(2017, 365);
		System.out.println(localDate2);
		LocalTime localTime0 = LocalTime.of(16, 44, 00);
		System.out.println(localTime0);
		LocalDateTime localDateTime0 = LocalDateTime.now();
		System.out.println(localDateTime0);
		LocalDateTime localDateTime1 = LocalDateTime.of(2017, 4, 30, 16, 30, 0);
		System.out.println(localDateTime1);
		LocalTime localTime1 = LocalTime.now(ZoneId.of("America/Chicago"));
		System.out.println(localTime1);
		LocalTime localTime2 = LocalTime.now(ZoneId.of("GMT+8"));
		System.out.println(localTime2);
		LocalTime localTime3 = LocalTime.now(ZoneId.of("America/Denver"));
		System.out.println(localTime3);
		LocalTime localTime4 = LocalTime.now(ZoneId.of("America/Los_Angeles"));
		System.out.println(localTime4);
		LocalTime localTime5 = LocalTime.now(ZoneId.of("America/New_York"));
		System.out.println(localTime5);
	}
}
