package c_this;

class Car{
	String brand;
	String color;
	int price;
	
	// 기본생성자
	// this()
//	자기자신의 생성자를 의미한다
//	생성자 내부에서만 사용이 가능하며, 최상단에 작성해야한다.
//	-> 생성자 내부에서 나의 다른 생성자를 호출할 때 사용
	public Car() {
		this("KIA", "Blue", 10_100);
//		brand = "KIA";
//		color = "Blue";
//		price = 10_000;
	}
	public Car(String brand, int price) {
		this(brand, "white",price);
//		this.color = "White";
//		this.brand = brand;
//		this.price = price;
	}
	
	public Car(String brand, String color, int price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
		System.out.println("3번 생성자 실행!");
	}

	
	
}

public class Ex01 {

	public static void main(String[] args) {
		Car car = new Car("KIA", "Black", 6500);
		Car car2 = new Car();
		
		System.out.println(car.brand);
		System.out.println(car2.brand);
		
		Car car3 = new Car("BMW", 15_000);
		System.out.println(car3.brand);
		System.out.println(car3.color);
	}

}
