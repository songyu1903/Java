package a_switch;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String msg = """
				당신의 mbti는?
				1. ISFP
				2. INFP
				3. ESFP
				4. ENTJ
				선택 >>  """;
		String isfp = "잘 삐지고 성격이 온화하다.",
				infp = "잡생각이많고 내성적이며 귀차니즘이 심하다",
				esfp = "호기심이 많고 개발적이다.",
				entj = "철저히 준비하고 활동적이다.",
				errMsg = "잘못 입력함!";
		
		String result = "";
		
		System.out.println(msg);
		int mbti = sc.nextInt();
		
		switch(mbti) {
		case 1:
			result = isfp;
			break;
		case 2:
			result = infp;
			break;
		case 3:
			result = esfp;
			break;
		case 4:
			result = entj;
			break;
		default:
			result = errMsg;
			break;
		}
		
		System.out.println(result);
	}

}
