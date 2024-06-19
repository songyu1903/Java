package b_oper;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String msg = """
				당신의 mbti는?
				1. ISFJ
				2. INFP
				3. ESFP
				4. ENTJ
				선택 >>  """;
		String isfj = "차분하고 인내심이 강하다.",
				infp = "잡생각이많고 내성적이며 귀차니즘이 심하다",
				esfp = "호기심이 많고 개발적이다.",
				entj = "철저히 준비하고 활동적이다.",
				errMsg = "잘못 입력함!";
		
		String result = "";
		
		System.out.print(msg);
		int mbti = sc.nextInt();
		
		result = mbti == 1 ? isfj :
			mbti == 2 ? infp :
				mbti == 3 ? esfp :
					mbti == 4 ? entj : errMsg;
		
		System.out.println(result);
		
	}

}
