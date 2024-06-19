package b_date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex01 {
	public static void main(String[] args) {
//		기본 생성자 사용 시 현재 시간을 담고 있는 객체를 생성한다
//		Date today = new Date();
//		System.out.println(today);
		
//		SimpleDateFormat 날짜 형식을 지정하는 객체
//		Date 객체와 함께 사용한다.
//		생성자 : SimpleDateFormat(String pattern)
//		pattern 은 이미 정해진 약속
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
//		String todayForm = sdf.format(today);
//		System.out.println(todayForm);
	
//		Date -> String 변환
		Date today = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yy/MM/dd - HH:mm:ss");
		System.out.println(sdf.format(today));
		
//		String -> Date 변환
		String dateStr = "2024년 11월 22일";
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년 MM월 dd일");
		try {
//			파싱 : 분석, 해석
			Date myDay = sdf2.parse(dateStr);
			System.out.println(myDay);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	
		System.out.println( System.currentTimeMillis() ); // 조 단위의 숫자 표기 currentTimeMillis
		
		Date d1 = new Date( 1725479122429L ); // 숫자로 표기해서 날짜를 변경할수도 있다
		System.out.println(d1);
		
		
		Date newDate = new Date();
//		Date의 많은 메서드가 Deprecated 이다.
		newDate.setDate(20); // Deprecated
		System.out.println(newDate);
		
//		Calendar 를 사용해야한다.
//		Date 를 안쓸수 없다.
//		Calendar, Date, SDF(SimpleDateFormat)를 변환하며 사용해야한다
		
		
	}
	
}














