package sub1;


public class Account {
	private String ano;
	private String owner;
	private int balance;

	/*
	 * 객체의 데이터를 외부에서 직접적으로 접근하는 것을 막기 위해
	 * Get,Set 을 사용하여 외부에서 메서드를 통해 데이터에 접근하도록 유도함.
	 */
	
	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}

	public String getAno() { 
		return ano; 
	}
	
	public void setAno(String ano) {
		this.ano = ano;
	}
	
	public String getOwner() { 
		return owner;	
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
}