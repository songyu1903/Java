package b_file;

import java.io.File;
import java.io.IOException;
import java.nio.file.spi.FileSystemProvider;

public class Ex01 {
	public static void main(String[] args) {
		// 파일 입출력
//		절대 경로 : 내가 어디에 위치해 있든 무조건 찾아가는 경로, root / 부터 시작한다.
//		상대 경로 : 현재 내 위치를 기준으로 작성하는 경로 -> .. (이전 경로) , .(현재 경로)
		File f = new File("./test.txt");
		
		
		try {
			f.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		} // 새로운 파일 생김
		
		System.out.println(f.exists());
		// 파일 삭제
		f.delete();
		
//		해당 파일이 실제 경로에 존재하는지 true/false로 알려준다
		System.out.println(f.exists());
	}
	
}
