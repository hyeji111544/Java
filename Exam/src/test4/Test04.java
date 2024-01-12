package test4;

/*
 * 날짜 : 2024/01/12
 * 이름 : 윤혜지
 * 내용 : 자바 문자열 연습문제
 */
public class Test04 {
	public static void main(String[] args) {
		
		String fileName = "HelloWorld.java";
		
		int idx = fileName.indexOf(".");
		
		String title = fileName.substring(0, idx);
		String ext	= fileName.substring(idx+1);
		
		System.out.println("파일명 : " + title);
		System.out.println("확장자 : " + ext);
		
		String strScores = "60, 72, 82, 86, 92";
		String[] scores = strScores.split(",");
		
		int total = 0;
		
		for(String score : scores) {
			//문자열을 숫자로 변환하기 위해 Integer 나옴.
			total += Integer.parseInt(score.trim()); //공백도 문자열이기 때문에 공백을 제거하는trim 사용.
		}
		
		System.out.println("strScores 총점 : " +total);
		
	}

}
