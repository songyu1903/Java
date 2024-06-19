package b_casting;

/*
 * 학생들의 성적을 관리하는 프로그램을 만들어야 한다.
관리해야 하는 학생들의 정보(속성)

1. 수학 점수
2. 영어 점수
3. 국어 점수
4. 등급
 

필요한 기능

1. 학생별 총 점을 구할 수 있어야 한다.
2. 학생별 평균 점수를 구할 수 있어야 한다.
 

기타 요구사항

각 필드의 초기화는 생성자를 이용할 수 있도록 한다
 * 
 */

class Test {
	private int Math, Eng, Kor;
	private String Grade;
		
	public Test(int math, int eng, int kor, String Grade) {
		Math = math;
		Eng = eng;
		Kor = kor;
		this.Grade = Grade;
	}
	
	// 총 합
	public int total() {
		return Math + Eng + Kor;
	}

	// 평균
	public double ave() {
		return total() / 3;
	}
	
	// 등급
	void Grade() {
		double average = ave();
		if(average >= 90) {
			Grade = "1등급";
		}else if (average >= 80) {
			Grade = "2등급";
		}else if (average >= 70) {
			Grade = "3등급";
		}else if (average >= 60) {
			Grade = "4등급";
		}else if (average >= 50) {
			Grade = "5등급";
		}else if (average >= 40) {
			Grade = "6등급";
		}else if (average >= 30) {
			Grade = "7등급";
		}else if (average >= 20) {
			Grade = "8등급";
		}else {
			Grade = "9등급";
		}
	}

	public String getGrade() {
		return Grade;
	}
	

	public void setGrade(String grade) {
		Grade = grade;
	}

	// 메인 클래스
	public static void main(String[] args) {
		Test student1 = new Test(90, 85, 90, "2등급");
		Test student2 = new Test(60, 40, 30, "6등급");
		
		System.out.println("학생 1의 총점: " + student1.total() +"\n학생 1의 평균: "
		+ student1.ave() + "\n학생 1의 등급: " + student1.Grade);
		
		System.out.println("학생 2의 총점: " + student2.total() +"\n학생 2의 평균: " 
		+ student2.ave() + "\n학생 2의 등급: " + student2.Grade);
	}

	// 강사님
	
	
}
