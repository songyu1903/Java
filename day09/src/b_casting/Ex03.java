package b_casting;

class Animal {
	int age;
	String name;

//	public Animal() {
//	}

	public Animal(String name) {
		this.name = name;
	}

	void crying() { // 자식 클래스에서 반드시 재정의 해야함
		System.out.println("짖어!");
	}

}

class Cat extends Animal {

	public Cat(String name) {
		super(name);
	}

	@Override
	void crying() {
		System.out.println("야옹~!");
	}
}

class Dog extends Animal {

	public Dog(String name) {
		super(name);
	}

	@Override
	void crying() {
		System.out.println("멍멍~!");
	}

	void walk() {
		System.out.println("쥬디 산책가기!");
	}
}

public class Ex03 {
	public static void main(String[] args) {
//		Animal animal = new Animal();
//		Cat cat = new Cat();
//		Dog dog = new Dog();
//		
//		animal.crying();
//		cat.crying();
//		dog.crying();

//		1. 같은 메서드가 부모에도 있고 자식에도 있는 경우(오버라이딩)
//		Animal animal = new Dog();
//		animal.crying();
//		업캐스팅을 하여도 오버라이딩된 메서더가 실행된다.
//		실질적으로 가리키는 객체는 Dog 이기 떄문에
//		Animal cat = new Cat();
//		cat.crying();

//		2. 메서드가 부모에는 없고 자식에서 추가된 경우
//		(부모에 존재하지 않는 멤버에 접근하려는 경우)
//		animal.walk();
//		자식 클래스에서 추가한 멤버는 부모타입의 참조변수로는 접근할 수 없다

//		이 경우 다운 캐스팅을 해야한다.
//		Dog dog = new Dog();
//		Dog dog = (Dog)animal;
//		dog.walk();

		Dog dog = new Dog("쥬디");
		Cat cat = new Cat("푸름이");

		printText(dog);
		printText(cat);

		tryWalk("쥬디", dog);
		tryWalk("푸름이",cat);
		
		
	}

//   1. 메소드의 매개변수로 여러 타입의 값을 전달받는 경우
//   일반적으로 각각의 타입을 처리하는 메소드를 별도로 만들어야 한다.

	static void printText(Dog dog) {
		System.out.println(dog.name + "가 운다!");
		dog.crying();
	}

	static void printText(Cat cat) {
		System.out.println(cat.name + "가 운다!");
		cat.crying();
	}

//   2. 같은 부모클래스가 존재한다면( 공통 타입이 존재한다면) 매개변수를 부모클래스 타입으로 만든다.
//   하나의 메서드에서 매개변수를 부모타입으로 만들면 여러 자식타입을 받아 사용이 가능하다.(업캐스팅, 다형성)
	static void printText(Animal animal) {
		System.out.println(animal.name + "이가 운다!");
		animal.crying();
	}
	
//	3. 만약 부모클래스에 존재하지 않는 멤버에 접근하기 위해서는?
//	다운 캐스팅을 해야한다.
	static void tryWalk(String name, Animal animal) {
//		Dog dog = (Dog)animal;
//		dog.walk();
	
//		매개벼수로 받아온 객체의 주소가 Dog 타입인지 확인
		if(animal instanceof Dog) {
//			Dog 타입이 맞다면 Dog로 다운캐스팅.
			((Dog)animal).walk();			
		}else {
			System.out.println(name +" 산책가기 싫어!");
		}
		
	}
}

















