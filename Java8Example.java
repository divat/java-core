package us.state.vantage.beacon.batch.ApplicationListingBatch;

import java.io.IOException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.albionintl.lang.DateData;

public class TestMain {
	
	public static void main(String args[]){
		//localDateTimeAPI();
		//predicateEx();
		listToArr();
	}
	
	private static void listToArr() {
		List<String> strList = Arrays.asList(new String[] {"A","B","C","D"});
		String[] arr = strList.toArray(new String[0]);
		System.out.println(arr.length);
		Stream<String> s = Stream.of(arr);
		s.forEach(str -> System.out.println(str));
	}
	
	private static void predicateEx() {
		Predicate<String> apprvStatus = (str) -> str.equalsIgnoreCase("APPROVED");
		Predicate<String> deniedStatus = (str) -> !str.equalsIgnoreCase("DENIED");
		Predicate<String> rejectStatus = (str) -> !str.equalsIgnoreCase("REJECT");
		boolean result = apprvStatus.and(deniedStatus).and(rejectStatus).test("Approved");
		System.out.println("Predicate Result :: " +result);
	}

	private static void localDateTimeAPI() {
		//Convert date string to date in desired format
		String strDate = "29/09/2021";
		DateTimeFormatter strFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		LocalDate myDate = LocalDate.parse(strDate, strFormat);
		System.out.println(myDate.format(myFormat));
		
		//Convert date time string to date time in desired format
		String strDateTime = "29/09/2021 13:15:08";
		DateTimeFormatter strDateTimeFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss", Locale.US);
		DateTimeFormatter myDateTimeFormat = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss a", Locale.US);
		LocalDateTime myDateTime = LocalDateTime.parse(strDateTime, strDateTimeFormat);
		System.out.println(myDateTime.format(myDateTimeFormat));
		
		//Convert date to string date in desired format
		LocalDateTime dateToStr = LocalDateTime.of(LocalDate.now().getYear(), LocalDate.now().getMonthValue(), LocalDate.now().getDayOfMonth(), 
				LocalDateTime.now().getHour(), LocalDateTime.now().getMinute(), LocalDateTime.now().getSecond());
		DateTimeFormatter strDateTimeFormat1 = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
		DateTimeFormatter strDateWithoutTime = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		
		String dateTime2Str = dateToStr.format(strDateTimeFormat1);
		String date2Str = dateToStr.format(strDateWithoutTime);
		System.out.println("With time :: " + dateTime2Str + "======" +"Without time :: " + date2Str);
		
		//Getting the DateTime based on country zone
		LocalDateTime zoneDateTime = LocalDateTime.of(LocalDate.now().getYear(), LocalDate.now().getMonthValue(), LocalDate.now().getDayOfMonth(), 
				LocalDateTime.now().getHour(), LocalDateTime.now().getMinute(), LocalDateTime.now().getSecond());
		ZoneId indiaZone = ZoneId.of("America/New_York");
		ZonedDateTime indiaZoneDateTime = ZonedDateTime.of(zoneDateTime, indiaZone);
		System.out.println("In India Central Time Zone :: " + indiaZoneDateTime);
		
		Set<String> zoneIds= ZoneId.getAvailableZoneIds();

		for (String zone : zoneIds) {
		    System.out.println(zone);
		}
		
		
	}
}
