package a_wrapper;

import java.util.Arrays;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
//		Object obj = new Scanner(System.in);
//		((Scanner)obj).next();
		Object obj = 1;
		
		System.out.println(obj instanceof Integer);
		System.out.println((Integer)obj);
		
//		1, 3.14, 'A', "Dog", true
		Object[] arObj = {1, 3.14, 'A', "Dog", true};
		System.out.println(   Arrays.toString(arObj)   );
		
	}
}










