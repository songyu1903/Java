package d_swap;

public class Ex02 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		swap(a, b);
		System.out.println(a);
		System.out.println(b);
	}
	static void swap(int a, int b) {
		int tmp = 0;
		tmp = a;
		a = b;
		b = tmp;
	}
	
}
