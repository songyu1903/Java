package d_swap;

public class Ex03 {

	public static void main(String[] args) {
		int[] ar = {10, 20};
		swap(ar);
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		
	}
	static void swap(int[] ar) {
		int tmp = 0;
		tmp = ar[0];
		ar[0] = ar[1];
		ar[1] = tmp;
	}

}
