package ch05.sec09;

public class ArrayCopyByForExample {
	public static void main(String[] args) {
		//길이3인 배열
		int[]oldInyArray = {1, 2, 3};
		//길이 5인 배열 새로 생성
		int[]newIntArray = new int[5];
		//배열 항목 복사
		for(int i=0; i<oldInyArray.length;i++) {
			newIntArray[i] = oldInyArray[i];
		}//배열 항목 출력
		for(int i =0; i<newIntArray.length; i++) {
			System.out.print(newIntArray[i] + ", ");
		}
	}

}
