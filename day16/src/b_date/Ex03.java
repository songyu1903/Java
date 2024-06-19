package b_date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Ex03 {
	public static void main(String[] args) {
//		LocalDate : 날짜 정보
		LocalDate today = LocalDate.now();
		System.out.println(today);
		
		LocalDate other = LocalDate.of(1999, 11, 22);
		System.out.println(other);
		System.out.println("================");
		
		LocalDate other2 = other.plusDays(2);
		System.out.println(other2);
		LocalDate other3 = other.plusMonths(2);
		System.out.println(other3);

		System.out.println("================");
		
		System.out.println(other.getYear());  // 1999
		System.out.println(other.getMonth()); // NOVEMBER
		System.out.println(other.getMonthValue()); // 11월
		
		System.out.println("================");
		
		// 년 월 일
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
		String str = other.format(formatter);
		System.out.println(str);
		System.out.println("================");
		
//		LocalTime : 시간 정보
		LocalTime time = LocalTime.now();
		System.out.println(time);

		System.out.println("================");
//		LocalDateTime : 날짜 + 시간 정보
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
	}
}
