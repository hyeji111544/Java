package sub1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankApplication {

	private static List<Account> accounts = new ArrayList<>();
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		boolean run = true;


		while (run) {
			System.out.println("----------------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("----------------------------------------------------------");
			System.out.print("선택> " );
			int a = scanner.nextInt();

			// 내용
			
			switch(a) {
			case 1:
				createAccount();
				continue;
			case 2:
				accountList();
				continue;
			case 3:
				deposit();
				continue;
			case 4:
				withdraw();
				continue;
			case 5:
				System.out.println("프로그램 종료");
				run = false;
			}
			
			
		}
		scanner.close();
	}

	// 계좌생성하기
	private static void createAccount() {
		System.out.println("---------------");
		System.out.println("계좌생성");
		System.out.println("---------------");
		
		System.out.print("계좌번호: " );
		String ano = scanner.next();
		
		System.out.print("계좌주: " );
		String owner = scanner.next();
		
		System.out.print("초기입금액: ");
		int balance = scanner.nextInt();
		
		System.out.println("결과계좌가 생성되었습니다.");
		
		//새로운 계좌를 리스트에 추가
		Account newAccount = new Account(ano, owner, balance);
        accounts.add(newAccount);
	}

	// 계좌목록보기
	private static void accountList() {
		System.out.println("---------------");
		System.out.println("계좌목록");
		System.out.println("---------------");
		
		for(int i = 0; i < accounts.size(); i++ ) {
			Account account = accounts.get(i);
			if(account != null) {
				String text = "      "; 
				System.out.println(account.getAno()+text + account.getOwner()+ text + account.getBalance());
			}
			
		}
		
	}

	// 예금하기
	private static void deposit() {
		System.out.println("---------------");
		System.out.println("예금");
		System.out.println("---------------");
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		System.out.print("예금액: ");
		int money = Integer.parseInt(scanner.nextLine());
		Account account = findAccount(ano);
		if (account == null) {
			System.out.println("결과: 계좌가 없습니다.");
			return;
		}
		account.setBalance(account.getBalance() + money);
		System.out.println("결과: 예금이 성공되었습니다.");
	}

	// 출금하기
	private static void withdraw() {
		System.out.println("---------------");
		System.out.println("출금");
		System.out.println("---------------");
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		System.out.print("출금액: ");
		int money = Integer.parseInt(scanner.nextLine());
		
		Account account = findAccount(ano);
		if (account == null) {
			System.out.println("결과: 계좌가 없습니다.");
			return;
		}
		account.setBalance(account.getBalance() - money);
		System.out.println("결과: 출금이 성공되었습니다.");
	}
		
	

	// Account 리스트에서 ano와 동일한 Account 객체 찾기
	private static Account findAccount(String ano) {
		Account account = null;
		for (int i = 0; i < accounts.size(); i++) {			
			if (accounts.get(i) != null) {				
				String dbAno = accounts.get(i).getAno();				
				if (dbAno.equals(ano)) {
					account = accounts.get(i);
					break;
				}
			}
		}
		return account;
	}
}
