package test1.copy;
import java.util.Scanner;

/*
 * 날짜 : 2023/12/28
 * 이름 : 윤혜지
 * 내용 : 자바 기본 입출력 연습문제
 */
public class Test02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int		year;
		int		birth;
		String	name;
		
		System.out.print("올해 년도 입력 : " );
		year = 
		System.out.print("태어난 년도 입력 : " );
		birth = 
		System.out.print("이름 입력 : " );
		name = 
		
		int age = year - birth;
		
		System.out.("%s 님 안녕하세요. \n당신은 올해 만 %d세 입니다.", name, age);
		
		sc.close();
		
	}


}
