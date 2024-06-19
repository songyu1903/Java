package a_task;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MemberDAO {
	private BufferedReader br;
	private BufferedWriter bw;
	
//	회원가입
	public void join(MemberDTO memberDTO) throws IOException{
		bw = MyBuffer.getWriter(); // MyBuffer 클래스에 getWriter() 객체를 가져옴
		bw.newLine();
		bw.write(memberDTO.toString());
		bw.close();
	}
	
//	Id 중복체크
	public boolean checkLoginId(String loginId) throws IOException{
		br = MyBuffer.getReader(); // MyBuffer 클래스에 getReader() 객체를 가져옴
	
		while(true) {
			String line = br.readLine();
			
			if(line == null) { break; }
			
			MemberDTO member = MemberDTO.from(line); 

			String foundLoginId =  member.getLoginId();
		
			if(foundLoginId.equals(loginId)) {
				return false;
			}
		}
		
		br.close();
		return true;
	}
	
//	핸드폰 번호로 아이디 찾기(하나의 번호로 여러 아이디 가입이 가능하다고 가정)
	public List<String> findLoginId(String phoneNumber) throws IOException {
		br = MyBuffer.getReader();
		String line = null;
		MemberDTO memberDTO = null;
		List<String> loginIdList = new ArrayList<>();
		
		while(true) {
			line = br.readLine();
			
			if(line == null) { break; }
			
			memberDTO = MemberDTO.from(line);
			if(memberDTO.getPhoneNumber().equals(phoneNumber)) { // 일치 한다면
				loginIdList.add(memberDTO.getLoginId());
			}
		}
		br.close();
		return loginIdList;
	}

//	비밀번호 찾기
	public String findPassword(String loginId, String phoneNumber) throws IOException{
		br = MyBuffer.getReader();
		String line = null;
		MemberDTO memberDTO = null;
		String password = null;
		
		while(true) {
			line = br.readLine();
			
			if(line == null) { break; }
			
			memberDTO = memberDTO.from(line);
			
			if(memberDTO.getLoginId().equals(loginId) &&
					memberDTO.getPhoneNumber().equals(phoneNumber)) {
				password = memberDTO.getPassword();
				break;
			}
		}
		br.close();
		
		return password;
	}
}





















