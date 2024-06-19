package b_casting;

class Car{
	String brand;
	String color;
	int price;
	
	void enginStart() {
		System.out.println("시동이 켜졌습니다!");
	}
	
	void enginStop() {
		System.out.println("시동이 꺼졌습니다!");
	}
}

class SuperCar extends Car{
//	@로 시작하는 것은 어노테이션(anotation)이다.
//  어노테이션은 일좋의 주석이다
	@Override
	void enginStart() {
		System.out.println("ㅂㅇㅇㅇㅇㅇㅇㅇㅇㅇ");
	}
}

public class Ex04 {
	public static void main(String[] args) {
		Car car = new Car();
		
		car.enginStart();
		car.enginStop();
		
		SuperCar superCar = new SuperCar();
		
		superCar.enginStart();
	}

}
