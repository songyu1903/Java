package b_interface3;

public class Main {
	public static void main(String[] args) {
		checkA(new Eagle());
		checkA(new Horse());
		checkA(new Tiger());

		Animal[] animals = { new Eagle(), new Horse(), new Tiger() };
		checkB(animals);
	}

	static void checkB(Animal[] animals) {
		for (int i = 0; i < animals.length; i++) {
			if(animals[i] instanceof Sky) {
				System.out.println("날아 다닌다!");
			}else if(animals[i] instanceof Land) {
				System.out.println("뛰어 다닌다!");
			}
		}
	}

	static void checkA(Animal animal) {
		if (animal instanceof Carnivore) {
			System.out.println("육식동물");
		} else if (animal instanceof Herbivore) {
			System.out.println("초식동물");
		}
	}
}
