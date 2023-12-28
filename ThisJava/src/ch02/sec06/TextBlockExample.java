package ch02.sec06;
/*
 * 날짜: 2023/12/28
 * 이름: 윤혜지
 * 내용: 문자열 타입 연습
 * 		텍스트 블록 문법 사용하여 연습함.p52
 */
public class TextBlockExample {
	public static void main(String[] args) {
		String str1 = "" +
			"{\n" +
			"\t\"id\":\"winter\",\n" +
			"\t\"name\":\"눈송이\"\n" +
			"}";
		
		String str2 = """
			{
				"id":"Winter",
				"name":"눈송이"
			}
				""";
		
		System.out.println(str1);
		System.out.println("-----------------------------");
		System.out.println(str2);
		System.out.println("-----------------------------");
		String str = """
				나는 자바를 \
				학습합니다.
				나는 자바 고수가 될 겁니다.
				""";
		System.out.println(str);
	
	}
}
