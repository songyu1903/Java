package a_array;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		배열의 선언
//		1. 자료형[] 배열명 = {값1, 값2, ...};
		int[] ar1 = { 1, 2, 3, 4, 5 }; // 어떤 값을 넣을지 알 때 사용
		int[] arr = new int[] { 1, 2, 3, 4, 5, };
//		2. 자료형[] 배열명 = new 자료형[칸수];
		int[] ar2 = new int[5]; // 어떤 값을 넣을지 모르나, 몇 칸 필요한지 알 때 사용\

//		3. 자료형[] 배열명 = null;
//		배열명 = new 자료형[칸수];
		int[] ar3 = null; // 어떤 값을 넣을지도 모르고, 몇 칸 필요한지도 모를때 사용
		ar3 = new int[5];

//		배열의 사용
		ar1[0] = 100; // ar1[0] 칸에 있는 1을 100으로 변경
		System.out.println(ar1[0]);
		ar1[0] = 3;
		System.out.println(ar1[0]);

		int[] ar4 = null;
		
		

	}

}
