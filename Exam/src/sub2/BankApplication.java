package sub2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

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
			
			try {
				int selectNo = scanner.nextInt();
				
				//내용
				if(selectNo == 1) {
					createAccount();
				}else if(selectNo ==2) {
					accountList();
				}else if(selectNo ==3) {
					deposit();
				}else if(selectNo ==4) {
					withdraw();
				}else if(selectNo ==5) {
					run = false;
				} else {
					System.out.println("1에서 5 사이의 숫자를 입력해주세요.");
				}
			}catch (java.util.InputMismatchException e) {
				System.out.println("올바른 숫자를 입력하세요.");
			}
		}
		System.out.println("프로그램 종료");
	}	

	// 계좌생성하기
	private static void createAccount() {
		System.out.println("--------------");
		System.out.println("계좌생성");
		System.out.println("--------------");
		
		scanner.nextLine();
		System.out.print("계좌번호: ");
		String ano = scanner.nextLine();
		
		System.out.print("계좌주: ");
		String owner = scanner.nextLine();
		
		System.out.print("초기입금액: ");
		int balance = Integer.parseInt(scanner.nextLine());
		
		System.out.println("결과: 계좌가 생성되었습니다.");
		
		// 입력한 정보를 list 에 저장하기
		//Account user = new Account(ano, owner, balance);
		//accounts.add(user);
		
		accounts.add(new Account(ano, owner, balance));
		
	}

	// 계좌목록보기
	private static void accountList() {
		System.out.println("--------------");
		System.out.println("계좌목록");
		System.out.println("--------------");
		// list에 저장된 계좌 출력하기
		
	
		for(Account i : accounts) {
			System.out.println(i);
			//System.out.println(i.toString()); toString이 자동으로 호출됨.
		}
		
	}

	// 예금하기
	private static void deposit() {
		System.out.println("--------------");
		System.out.println("예금");
		System.out.println("--------------");
		
		scanner.nextLine();
		System.out.print("계좌번호: ");
		String ano = scanner.nextLine();
		
		System.out.print("예금액: ");
		int money = Integer.parseInt(scanner.nextLine());
		
		Account account = findAccount(ano);
		if(account != null) {
			account.setBalance(account.getBalance()+money);
			System.out.println("결과: 예금이 성공되었습니다.");
		}else {
			System.out.println("결과: 계좌가 존재하지 않습니다.");
		}
	
	}

	// 출금하기
	private static void withdraw() {
		System.out.println("--------------");
		System.out.println("출금");
		System.out.println("--------------");
		
		scanner.nextLine();
		System.out.print("계좌번호: ");
		String ano = scanner.nextLine();
		
		System.out.print("출금액: ");
		int money = Integer.parseInt(scanner.nextLine());
		
		Account account = findAccount(ano);
		if(account != null) {
			account.setBalance(account.getBalance()-money);
			System.out.println("결과: 출금이 성공되었습니다.");
		}else {
			System.out.println("결과: 계좌가 존재하지 않습니다.");
		}
		
	}
		
	

	// Account 리스트에서 ano와 동일한 Account 객체 찾기
	private static Account findAccount(String ano) {
		Account account = null;;
		for(Account i : accounts) {
			if(i != null) {
				String dbAno = i.getAno();
				if(dbAno.equals(ano)) {
					account = i;
					break;
				}
			}
		}
		return account;
		
	}
}
