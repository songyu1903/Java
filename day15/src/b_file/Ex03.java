package b_file;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex03 {
	public static void main(String[] args) throws IOException{
		File f = new File("./test2.txt");
		
//		2바이트 (문자) 단위로 데이터 전송
		FileWriter fw = new FileWriter(f);
		fw.write("안녕하세요!!");
		fw.close();
		
		FileReader fr = new FileReader(f);
		System.out.println( (char)fr.read() );
		fr.close();
		
		
	}
}
