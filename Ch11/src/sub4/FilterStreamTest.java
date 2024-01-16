package sub4;

import java.util.Collections;
import java.util.List;

/*
 * 날짜 : 2024/01/16
 * 이름 : 윤혜지
 * 내용 : Java 컬렉션 스트림 필터 실습하기
 */

public class FilterStreamTest {
	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3);
		System.out.println(numbers);
		
		//중복제거 distinct()
		numbers.stream().distinct().forEach(num -> System.out.print(num + ", "));
		System.out.println();
		//5 이상 데이터 필터링
		numbers
			.stream()
			.filter(num -> num>=5)//필터가 5 이상의 데이터만 리턴해 줘야함.
			.forEach(num -> System.out.print(num + ", "));
		System.out.println();
		//중복 제거, 짝수 데이터만 필터링
		numbers
			.stream()
			.distinct() //중복제거
			.filter(num -> num%2==0)
			.sorted(Collections.reverseOrder()) //내림차순
			.forEach(num -> System.out.print(num + ", "));
	}
	
}
