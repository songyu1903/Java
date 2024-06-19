package a_anonymous;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class BtnTest extends JFrame{
	public BtnTest() {
		System.out.println("생성자 실행!");
		
//		JFrame
		setTitle("타이틀입니다!");
		setSize(350, 500); // 가로 세로 너비
		
		setLocationRelativeTo(null); // null = 화면 중앙
		setResizable(true); // 사이즈 조절
		setVisible(true); // 창 보기
		
		
		addWindowListener(new WindowAdapter() { // WindowAdapter 로 내가 사용하고싶은 메서드를 찾아 사용가능
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("종료!");
				System.exit(0);
			}
			
		});
	}
}
