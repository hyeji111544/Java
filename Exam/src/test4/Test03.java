package test4;

import java.util.Scanner;

/*
 * 날짜 : 2024/01/12
 * 이름 : 윤혜지
 * 내용 : 자바 예외처리 연습문제
 */
//상속 받을거라 extends Exception 
class LoginException extends Exception{
	
	public LoginException(String msg) {
		super(msg);
	}
}

public class Test03 {
	public static void main(String[] args) {
		
		String userId = "a101";
		String userPw = "abc1234";
		
		try {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("아이디 : ");
			String inputId = sc.nextLine();
			
			System.out.println("비밀번호 : ");
			String inputPw = sc.nextLine();
			
			//문자열 비교 userId !=inputId 이건 틀림. 문자열 비교는 equals
			if(!userId.equals(inputId)) {
				throw new LoginException("아이디가 올바르지 않습니다.");//이 예외를 발생시켜야 메세지를 출력함.
			}else if(!userPw.equals(inputPw)) {
				throw new LoginException("비밀번호가 올바르지 않습니다.");
			}else {
				System.out.println("로그인 성공!");
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
