package ch05.sec05;

public class CharAtExzmple {
	public static void main(String[] args) {
		String ssn = "9506241230123";
		char sex = ssn.charAt(6); //문자열의 6번째 위치의 문자를 리턴. 여기서는1에 해당함.
		switch (sex) {
			case '1':
			case '3':
				System.out.println("남자입니다.");
				break;
			case '2':
			case '4':
				System.out.println("여자입니다.");
				break;
		}
	}

}
