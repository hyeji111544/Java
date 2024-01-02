package test2;
/*
 * 날짜 : 2023/12/29
 * 이름 : 윤혜지
 * 내용 : 자바 배열 문자 출력 연습문제
 */
public class Test10 {
	public static void main(String[] args) {
		
		for(int i=0 ; i<10 ; i++) {
			
			int result = fibo(i);
			
			System.out.println(result + " ");
		}
	}
	public static int fibo(int n) {
		
		if(n <= 1) {
			return n;
		}
		
		return fibo(n-1) + fibo(n-2);
	}

}
