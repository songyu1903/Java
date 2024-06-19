package b_date;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Ex02 {
	public static void main(String[] args) {
//		Calendar today = new Calendar();
		
//		singleton pattern
//		싱글톤 패턴을 이용한 클래스는 어플리케이션 내에 딱 하나의 객체만 만들어 사용할 수 있다.
//		싱글톤 패턴을 사용하는 클래스는 보통 getInstance() 메서드로 객체를 얻어올 수 있다
		Calendar today = Calendar.getInstance(); // Calendar 는 getInstance 메서드를 불러와 사용이 가능하다
		System.out.println(today);
		
		System.out.println("============================");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
//		캘린더 클래스의 getTime()은 Date타입을 반환한다.
		System.out.println( sdf.format(today.getTime()) );

//		캘린더 클래스에서 월을 나타낼때 0부터 1월로 인식한다.  10 -> 11월
		today.set(2024, 10, 22);
		System.out.println( sdf.format(today.getTime()) );
		
//		set(int field, int value)
//		field에 이미 정해진 값을 넣어서 년/월/일 등을 value로 변경할 수 있다.
		today.set(Calendar.MONTH, 2); // Calendar.MONTH 로 월만 표기 , 2는 3월이기에 출력은 3월로 된다
		System.out.println( sdf.format(today.getTime()) );
	
//		get(int field);
		System.out.println(today.get(Calendar.MONTH));
		
//		add(int field, int amount)
		today.add(Calendar.DATE, 5); // add 로 현재있는 날짜를 +5 해서 더한다
		System.out.println( sdf.format(today.getTime()));
		today.add(Calendar.DATE, -10); // add 로 현재있는 날짜를 -27해서 뺀다
		System.out.println( sdf.format(today.getTime()));
	}
}
