package b_file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 현재 경로에 animal.txt 파일을 생성하고
 * 파일 내용은
 * 
 * 사슴
 * 고라니
 * 너구리
 * 토끼
 * 
 * 데이터를 넣은 후 반복문(while)을 사용하여 데이터를 읽어와 콘솔창에 출력하기
 */

public class Task01 {
	public static void main(String[] args) throws IOException{
		BufferedWriter bw = new BufferedWriter(new FileWriter("animal.txt"));

		String[] animals = {"사슴", "고라니", "너구리", "토끼"};
		
		for(int i=0; i<animals.length; i++) {
			bw.write(animals[i]);
			bw.newLine();
		}
		
		
//		bw.write("""
//				사슴
//				고라니
//				너구리
//				토끼
//				""");
		
//		bw.write("사슴");
//		bw.newLine();
//		bw.write("고라니");
//		bw.newLine();
//		bw.write("너구리");
//		bw.newLine();
//		bw.write("토끼");
		bw.close();
		
		BufferedReader br = new BufferedReader(new FileReader("animal.txt"));
		
		String ani = null;
		while(true) {
			ani = br.readLine();
			
			if(ani == null) { break; }
				System.out.println(ani);
		}
	}
}
