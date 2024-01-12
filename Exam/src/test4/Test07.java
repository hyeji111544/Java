package test4;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/*
 * 날짜 : 2024/01/12
 * 이름 : 윤혜지
 * 내용 : 로또번호 연습 문제
 */
public class Test07 {
	public static void main(String[] args) {
		
		for(int count=1; count<=5; count++) {
			System.out.println(makeLotto());
		}
	}

	public static Set<Integer> makeLotto() {
		
		Set<Integer> lottoSet = new HashSet<>();
		
		for(;;) {
			//for 인데 조건, 증가 없으면 루프식
			int num =(int) Math.ceil(Math.random() * 45);
			
			lottoSet.add(num);
			//나온 숫자가 중복없이 6개가 되면 종료
			if(lottoSet.size() == 6) {
				break;
			}
		}
		//프로그램의 트리는 2진탐색tree 
	    Set<Integer> treeSet = new TreeSet<>(lottoSet);
		
		return treeSet;
	}
	
	

}
