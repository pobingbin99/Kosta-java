package ex0806.ch06;

import java.util.Scanner;

public class BankApplication {
	private static final int MAX_COUNT = 100;

	private static Account[] accountArray = new Account[MAX_COUNT];

	private static int count = 0;

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;

		while (run) {
			System.out.println("------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("------------------------------------------");
			System.out.print("선택> ");

			int menu = Integer.parseInt(sc.nextLine());

			switch (menu) {
			case 1: {
				createAccount();
				break;
			}
			case 2: {
				accountList();
				break;
			}
			case 3: {
				deposit();
				break;
			}
			case 4: {
				withdraw();
				break;
			}
			case 5: {
				run = false;
				break;
			}
			}
		}
		System.out.println("프로그램 종료");
	}

	// 계좌 생성
	private static void createAccount() {
		System.out.println("--------------");
		System.out.println("계좌생성");
		System.out.println("--------------");

		System.out.print("계좌번호: ");
		String account = sc.nextLine();

		System.out.print("계좌주: ");
		String name = sc.nextLine();

		System.out.print("초기입금액: ");
		int balance = Integer.parseInt(sc.nextLine());

		Account newAccount = new Account(account, name, balance);

		if (BankApplication.count <= MAX_COUNT) {
			accountArray[count++] = newAccount;
			System.out.println("결과: 계좌가 생성되었습니다.");
		} else {
			System.out.println("결과: 계좌 생성에 실패했습니다.");
		}
	}

	// 계좌 목록
	private static void accountList() {
		System.out.println("--------------");
		System.out.println("계좌목록");
		System.out.println("--------------");

		for (int i = 0; i < BankApplication.count; i++) {
			System.out.println(accountArray[i].getAccount() + "\t\t" + accountArray[i].getName() + "\t\t"
					+ accountArray[i].getBalance());
		}
	}

	// 예금
	private static void deposit() {
		System.out.println("--------------");
		System.out.println("예금");
		System.out.println("--------------");

		System.out.print("계좌번호: ");
		String account = sc.nextLine();

		System.out.print("예금액: ");
		int money = Integer.parseInt(sc.nextLine());

		Account findAccount = findAccount(account);

		if (findAccount != null) {
			findAccount.deposit(money);
			System.out.println("결과: 예금이 성공되었습니다.");
		} else {
			System.out.println("결과: 예금에 실패했습니다.");
		}
	}

	// 출금
	private static void withdraw() {
		System.out.println("--------------");
		System.out.println("출금");
		System.out.println("--------------");

		System.out.print("계좌번호: ");
		String account = sc.nextLine();

		System.out.print("출금액: ");
		int money = Integer.parseInt(sc.nextLine());

		Account findAccount = findAccount(account);

		if (findAccount == null) {
	        System.out.println("결과: 계좌가 존재하지 않습니다.");
	    } else if (findAccount.getBalance() < money) {
	        System.out.println("결과: 잔액이 부족합니다.");
	    } else {
	        findAccount.withdraw(money);
	        System.out.println("결과: 출금이 성공되었습니다.");
	    }
	}

	// 계좌 찾기
	private static Account findAccount(String account) {
		for (int i = 0; i < BankApplication.count; i++) {
			if (accountArray[i].getAccount().equals(account)) {
				return accountArray[i];
			}
		}

		return null;
	}
}