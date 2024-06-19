package d_swap;

public class Ex05 {

	public static void main(String[] args) {
		int[] ar1 = {1,2,3,4};
		int[] ar2 = ar1;
		
		ar1[0] = 1000;
		System.out.println(ar2[0]);
		
		System.out.println(ar1);
		System.out.println(ar2);
	}

}
