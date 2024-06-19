package c_for;

public class Ex03 {

	public static void main(String[] args) {
//      변수의 스코프
//      변수를 만들면 해당 변수를 사용할 수 있는 범위가 존재한다.
//      그 범위를 스코프 라고 한다.
      
//      자바는 기본적으로 블록레벨 스코프를 가지게된다.(중괄호 영역을 의미한다.)
//      for문에서 만든 i는 해당 블록에서만 유효하므로 다른 for문에서는 영향을 주지 못한다.
      
      for(int i=0; i<10;i++) {
         System.out.println(i);
      }
      
      for(int i=0; i<3; i++) {
         System.out.println(i);
      }
	}

}
