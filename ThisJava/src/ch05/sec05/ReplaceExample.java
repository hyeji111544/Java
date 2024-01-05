package ch05.sec05;

public class ReplaceExample {
	public static void main(String[] args) {
		String oldStr = "자바 문자열은 불변입니다. 자바 문자열은 String입니다.";
		String newStr = oldStr.replace("자바","JAVA");
		
		//replace()가 리턴하는 문자열은 기존의 문자열의 수정본이 아닌 새로운 문자열이다.
		
		System.out.println(oldStr);
		System.out.println(newStr);
	}

}
