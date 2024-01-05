package ch05.sec06;

/*
 * 날짜 : 2024/01/05
 * 이름 : yun hye ji
 * 내용 : 값의 목록 없이 미리 배열을 선언할 경우 데이터 타입에 따라 다른 초기값이 출력되고
 * 		array은 선언과 동시에 수정이 불가능 하기 때문에 'new'를 통해 새롭게 생성.
 */
public class ArrayCreateByNewExample {
	public static void main(String[] args) {
		
		//배열 변수 선언과 배열 생성 , 초기값 출력
		int[] arr1 = new int[3];
		for(int i=0; i<3; i++) {
			System.out.print("arr1["+i+"] :" +arr1[i]+",");
		}
		System.out.println();
		
		//배열 항목의 값 변경, 변경 값 출력
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		for(int i=0; i<3; i++) {
			System.out.print("arr1["+i+"] :" +arr1[i]+",");
		}
		System.out.println("\n");
		
		
		double[] arr2 = new double[3];
		for(int i=0; i<3; i++) {
			System.out.print("arr2["+i+"] :" +arr2[i]+",");
		}
		System.out.println();
		
		
		arr2[0] = 0.1;
		arr2[1] = 0.2;
		arr2[2] = 0.3;
		for(int i=0; i<3; i++) {
			System.out.print("arr2["+i+"] :" +arr2[i]+",");
		}
		System.out.println("\n");
		
		
		String[] arr3 = new String[3];
		for(int i=0; i<3; i++) {
			System.out.print("arr3["+i+"] :" +arr3[i]+",");
		}
		System.out.println();
		
		
		arr3[0] = "1월";
		arr3[1] = "2월";
		arr3[2] = "3월";
		for(int i=0; i<3; i++) {
			System.out.print("arr3["+i+"] :" +arr3[i]+",");
		}
		System.out.println();
	}

}
