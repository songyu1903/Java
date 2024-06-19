package a_array;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		100 ~ 1까지의 값을 배열에 넣고 출력하기
//		int[] arData = new int[10];
//		for(int i = 0; i < arData.length; i++) { // arData.length -> 배열 100칸
//			arData[i] = arData.length - i; // 100 - i(0부터 시작)
//			// 100
//			// 99
//			// 98
//			// ...
//			// 1
//		}
//		for(int i = 0; i < arData.length; i++) {			
//			System.out.println(arData[i]);
//		}
		
//		1 ~ 10까지의 값을 배열에 넣고 총 합 구하기
//		int[] arData = new int[10];
//		int total = 0;
//		
//		for(int i = 0; i< arData.length; i++) {
//			arData[i] = i + 1;
//		}
//		for(int i = 0; i < arData.length; i++) {
//			total += arData[i];
//			System.out.println(total);
//		}
		
//		3명의 수학점수를 사용자에게 입력받아 배열에 저장하고
//		평균 점수를 출력해라
//		int[] maths = new int[3];
//		int total = 0;
//		
//		System.out.println("3명의 수학 점수를 입력하시오.");
//		for(int i = 0; i < maths.length; i++) {
//			maths[i] = sc.nextInt();
//		}
//		for (int math: maths) {
//			total += math;
//		}
//	    double ave = total / maths.length;
//	    
//	    System.out.println("| 3명의 평균 점수는 : " + ave + " 입니다. |");
		
	    // 강사님
//	    int[] arMath = new int[3];
//	    
//	    for(int i = 0; i < arMath.length; i++) {
//	    	System.out.print(i + 1 +"번 학생의 수학점수 >> ");
//	    	arMath[i] = sc.nextInt();
//	    }
//	    for (int i = 0; i <arMath.length; i++) {
//	    	total += arMath[i];
//	    }
//	    
//	    System.out.println("3명의 평균 점수 : " + (double)total/arMath.length);
	    
	    
		
//		0, 1, 2, 3, 4, 0, 1, 2, 3, 4 배열에 담고 출력하기(반복문 사용하기)
//	    int[] numbers = new int[10];
//	    for(int i = 0; i < 5; i++) {
//	    	numbers[i] = i;
//	    	System.out.print(numbers);
//	    }
	    
//	    강사님
//	    int[] arData = new int[10];
//	    for(int i = 0; i < arData.length; i++) {
//	    	arData[i] = i % 5;
//	    }
//	    for(int i = 0; i < arData.length; i++) {
//	    	System.out.println(arData[i]);
//	    }
	    
//		5개의 정수를 입력 받아 배열에 담고 최대값과 최소값 출력하기
//	    int[] num = new int[5];
//	    System.out.print("5개의 정수 입력 << ");
//	    for(int i = 0; i< num.length; i++) {
//	    	num[i] = sc.nextInt();
//	    }	
//	    int max = num[0];
//	    int min = num[0];
//	    for(int i = 0; i < num.length; i++) {
//	    	if(num[i] > max) {
//	    		max = num[i];
//	    	}
//	    	if(num[i] < min) {
//	    		min = num[i];
//	    	}
//	    }
//	    System.out.println("최대값: " + max);
//	    System.out.println("최소값: " + min);

	    // 강사님
//	    int[] arData1 = new int[5];
//	    
//	    for(int i = 0; i < arData1.length; i++) {
//	    	System.out.println(i + 1 + "번째 정수 입력 >>");
//	    	arData1[i] = sc.nextInt();
//	    }
//	    min = arData1[0];
//	    max = arData1[0];
//	    
//	    for(int i = 1; i < arData1.length; i++) {
//	    	if(max < arData1[i]) { max = arData1[i]; }
//	    	if(min > arData1[i]) { min = arData1[i]; }
//	    }
//	    System.out.println("최대 : " + max);
//	    System.out.println("최소 : " + min);
	
	
//		A ~ F까지 중 C 제외하고 배열에 담기 (배열 5칸 사용)
		char[] arData = new char[5];
		int tmp = 0;
		
		for(int i = 0; i < arData.length; i++) {
			tmp = i;
			if(tmp >= 2) { tmp ++; }
			arData[i] = (char)('A' + tmp);
		}
		for(int i = 0; i < arData.length; i++) {
			System.out.println(arData[i]);
		}
		
		
	}
	
}
