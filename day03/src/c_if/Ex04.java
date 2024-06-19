package c_if;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
//		int num1 = 20, num2 = 20;
//		
//		if(num1 >= num2) {
//			System.out.println("num1이 크다.");
//		}
//		if (num1 == num2) {
//			System.out.println("같다.");
//		}
//		if (num1 < num2){
//			System.out.println("num2가 크다.");
//		}
		
		
//		if(num1 > num2) {
//			System.out.println("num1이 크다.");
//		}
//		else if (num1 == num2) {
//			System.out.println("같다.");
//		}
//		else {
//			System.out.println("num2가 크다.");
//		}
		
	      Scanner sc = new Scanner(System.in);
	      int num1 = 0, num2 = 0;
	      String result = "";
	      
	      System.out.print("num1 입력 >> ");
	      num1 = sc.nextInt();
	      System.out.print("num2 입력 >> ");
	      num2 = sc.nextInt();
	      
//	      result = num1 > num2 ? num1 : num2;
//	      result = num1 > num2 ? "큰 수 : " + num1 : 
//	         num1 == num2 ? "같다" : "큰 수 : " + num2;
	      
	      if(num1 > num2) {
	    	  System.out.println("num1이 크다");
	      }else if(num1 == num2) {
	    	  System.out.println("같다");
	      }else {
	    	  System.out.println("num2가 크다");
	      }
	      	      
//	      System.out.println(result);
	}

}
