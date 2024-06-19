package b_date;

public class SingletonTest {
	public static void main(String[] args) {
		MySingleton ms = MySingleton.getInstance();
		MySingleton ms2 = MySingleton.getInstance();
		
		System.out.println(ms == ms2);
	}
}
