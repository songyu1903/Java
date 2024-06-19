package b_file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex02 {
	public static void main(String[] args) {
		File f = new File("test.txt");
		
		try {
			f.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			FileOutputStream fos = new FileOutputStream(f);
			fos.write('a'); // 한글은 2바이트 부터 시작이여서 안된다.
			fos.close(); // close는 항상 해줘야한다
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}
