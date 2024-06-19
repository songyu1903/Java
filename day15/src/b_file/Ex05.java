package b_file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex05 {
	public static void main(String[] args) throws IOException{
		BufferedWriter bw = new BufferedWriter(new FileWriter("test4.txt",true));
		
//		줄을 바꾸고 싶으면 \n을 사용한
//		bw.write("\ntest4");
//		또는 newLine()을 사용한다.
		
		bw.newLine();
		bw.write("test7");
		bw.close();
		
		System.out.println("완료!");
		
		BufferedReader br = new BufferedReader(new FileReader("test4.txt"));

		String line = null;

		while(true) {
			line = br.readLine();
			
			if(line == null) { break; }
			System.out.println(line);
		}
		
//		while( (line = br.readLine()) != null ) {
//			System.out.println(line);
//		}
		br.close();
		
	}
}
