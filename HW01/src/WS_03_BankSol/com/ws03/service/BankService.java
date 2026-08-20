package WS_03_BankSol.com.ws03.service;

import WS_03_BankSol.com.ws03.dto.AccountDto;
import WS_03_BankSol.com.ws03.dto.UserDto;

/**
 * 고객과 계좌에 관련된 서비스 (Business Logic 처리 객체)
 */

//자동 import 단축키 = ctrl + shift + 영문o
public class BankService {
	// final은 고정값으로 값 변경 불가능 (초기화 필수)
	
	/** 고객 최대개수 */
	final int USER_SIZE = 5;
	
	/** 계좌 최대개수 */
	final int ACCOUNT_SIZE = 10;
	
	/** 현재 고객의 개수 */
	int USER_CURRENT_SIZE;
	
	/** 현재 계좌의 개수 */
	int ACCOUNT_CURRENT_SIZE;
	
	/** 고객 및 계좌는 배열로 관리 */
	private UserDto[] userList;
	private AccountDto[] accountList;
	

	/**
	 * 생성자에서 테스트를 위한 고객 및 계좌 객체를 생성하고 배열에 저장한다
	 */
	public BankService() {
		// 배열 생성
		userList = new UserDto[USER_SIZE];
		accountList = new AccountDto[ACCOUNT_SIZE];

		// 각 배열방에 고객을 생성한다. (4개 정도)
		userList[USER_CURRENT_SIZE++] = new UserDto(100, "장희정", "8253jang@daum.net", "010-8875-8253", false);
		userList[USER_CURRENT_SIZE++] = new UserDto(200, "이효리", "lee@daum.net", "010-2222-3333", false);
		userList[USER_CURRENT_SIZE++] = new UserDto(300, "송중기", "song@naver.com", "010-5554-2222", false);
		userList[USER_CURRENT_SIZE++] = new UserDto(400, "삼순이", "sam@daum.com", "010-2222-2222", false);

		// 각 배열방에 계좌를 생성한다. (6개 정도)
		accountList[ACCOUNT_CURRENT_SIZE++] = new AccountDto(1, "1111-11111", 1000000, 100);
		accountList[ACCOUNT_CURRENT_SIZE++] = new AccountDto(2, "2222-22222", 250000, 100);
		accountList[ACCOUNT_CURRENT_SIZE++] = new AccountDto(3, "3333-33333", 350000, 100);
		
		accountList[ACCOUNT_CURRENT_SIZE++] = new AccountDto(4, "4444-44444", 150000, 200);
		accountList[ACCOUNT_CURRENT_SIZE++] = new AccountDto(5, "5555-55555", 250000, 200);
		
		accountList[ACCOUNT_CURRENT_SIZE++] = new AccountDto(6, "6666-66666", 350000, 300);
	}
	
	/**
	 * 특정 사용자의 계좌 목록을 배열로 리턴 하는 메소드
	 */
	public AccountDto[] getAccountList(int userSeq) {
		int count = 0;
		for (int i = 0; i < ACCOUNT_CURRENT_SIZE; i++) {
			if (accountList[i].getUserSeq() == userSeq) count++; 
		}
		
		if (count == 0) return null;
		
		int index = 0;
		AccountDto[] userAccountList = new AccountDto[count];
		for (int i = 0; i < ACCOUNT_CURRENT_SIZE; i++) {
			if (accountList[i].getUserSeq() == userSeq)  {
				userAccountList[index++] = accountList[i]; 
			}
		}
		return userAccountList;
	}

	/**
	 * 특정 사용자의 고객 정보를 리턴 하는 메소드
	 * @param : 고객의 sequence
	 * @return : null 이면 고객 정보 없음
	 */
	public UserDto getUserDetail(int userSeq) {
		for (int i = 0; i < USER_CURRENT_SIZE; i++) {
			if (userList[i].getUserSeq() == userSeq) {
				return userList[i];
			}
		}
		return null;
	}
}
