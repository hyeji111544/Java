package test3;

/**
 * 날짜 : 2024/01/04
 * 이름 : 윤혜지
 * 내용 : 싱글톤 객체와 인스턴스 객체 연습문제
 */
class Adder {
	
	private static Adder instance = new Adder();
	public static Adder getInstance() {
		return instance;
	}
	protected Adder() {}
	
	private Adder(int value) {
		y += value;
	}
	private int x;
	private int y;
	
	public void add(int x, int y) {
		this.x += x;
		y++;
	}
	public void add(int[] arr) {
		this.x += arr[0];
		this.y += arr[1];
	}
	public static void add(Adder a2) {
		a2.x += 10;
	}
	public static Adder add(Adder a3, int value) {
		return new Adder(value);
	}
	public void show() {
		System.out.println("x :" + x);
		System.out.println("y :" + y);
	}
}

public class Test06 {
	public static void main(String[] args) {
		Adder a1 = Adder.getInstance();
		
		a1.add(1, 2); //Adder 이라고 하는Method Area 에서 가져온다.
		a1.show();
		
		int[] arr = {10, 20};
		a1.add(arr);
		a1.show();
		
		Adder.add(a1); //static 메서드
		a1.show();
		
		a1 = Adder.add(a1, 3);
		a1.show();
	}

}