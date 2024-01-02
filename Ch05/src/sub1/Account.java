package sub1;

public class Account {
	
	//속성
	String bank;
	String id;
	String name;
	int balance;
	
	//기능
	public void deposit(int money) {
		this.balance += money; //매개변수 구분이 가능하기 때문에 this 생략 가능
	}
	public void withdraw(int money) {
		this.balance -= money;
	}
	public void show() {
		System.out.println("은행명 : "+this.bank);
		System.out.println("계좌번호 : "+this.id);
		System.out.println("입금주 : "+this.name);
		System.out.println("현재잔액 : "+this.balance);
	}

}
