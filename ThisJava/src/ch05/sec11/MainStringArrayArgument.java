package ch05.sec11;

public class MainStringArrayArgument {
	public static void main(String[] args) {
		if(args.length !=2) {
			System.out.println("프로그램 입력 값이 부족");
			System.exit(0);
		}
		
		String strNm1 = args[0];
		String strNm2 = args[1];
		
		int num1 = Integer.parseInt(strNm1);
		int num2 = Integer.parseInt(strNm2);
		
		int result = num1 + num2;
		System.out.println(num1+ " + " + num2 + " = " + result);
		
	}

}
