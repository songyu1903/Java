package b_file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex04 {
	public static void main(String[] args) throws IOException{
		FileWriter fw = new FileWriter("./test3.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("테스트3이다!!!");
		
//		버퍼를 비운다 -> 버퍼에 있는 데이터를 전송한다.
//		bw.flush();
		
//		close()하면 flush()가 자동으로 실행된다.
		bw.close();
		
		BufferedReader br = new BufferedReader(new FileReader("test3.txt"));
		System.out.println(br.readLine());
		br.close();
	}
}
