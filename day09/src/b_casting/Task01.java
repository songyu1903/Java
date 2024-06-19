package b_casting;

/*
 * 부모 클래스 : Music
 * 부모 멤버 : mode() 메서드
 * 
 * 자식 클래스 : Ballad, Hiphop, Rock
 * 
 * 발라드 클래스 -> 오버라이딩
 * mode():"발라드 모드" 출력
 * onlyBallad() : "onlyBallad 실행" 출력
 * 
 * 힙합 클래스 ->
 * mode(): "힙합 모드" 출력
 * onlyHiphop() : "onlyHiphop 실행" 출력
 * 
 * 
 */

public class Task01 {
	public static void main(String[] args) {
		check(new Ballad());
		check(new Hiphop());
		
	}
	static void check(Music music) {
		music.mode();
		
		if(music instanceof Ballad) {
			Ballad ballad = (Ballad)music;
			ballad.onlyBallad();
		}else if(music instanceof Hiphop) {
			((Hiphop)music).onlyHiphop();
		}
	}
}
