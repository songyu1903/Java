package a_static;

import java.util.Arrays;

public class LibraryTest {
	public static void main(String[] args) {
		// 제곱근
		double result = Math.pow(2, 3); // 2의 3승
		System.out.println(result);
		
		double result2 = Math.sqrt(144); // 12의 제곱근
		System.out.println(result2);

		int[] ar = {1,2,3,4,5};
		for(int i=0; i<ar.length; i++) {
			System.out.println(ar[i]);
		}
		System.out.println(Arrays.toString(ar));
		
		String str = "abcde";
		String resultstr = str.substring(1, 4);
		System.out.println(resultstr);
		
		String str2 = "a,b,c,d,e"; // ,를 기준으로 뛰어쓰기
		String[] arResult = str2.split(",");
		
		System.out.println(Arrays.toString(arResult));
		
//		상속
		
		
	}

}








