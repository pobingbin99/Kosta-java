package WS_05_Extends.com.ws05.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import WS_05_Extends.com.ws05.dto.AccountDto;
import WS_05_Extends.com.ws05.dto.InstallAccountDto;
import WS_05_Extends.com.ws05.dto.LoanAccountDto;
import WS_05_Extends.com.ws05.dto.SavingAccountDto;
import WS_05_Extends.com.ws05.dto.UserDto;

/**
 * 고객과 계좌에 관련된 서비스 (Business Logic 처리 객체)
 */

//자동 import 단축키 = ctrl + shift + 영문o
public class BankService {
	/** 고객 및 계좌는 리스트로 관리 */
	private List<UserDto> userList;
	private List<AccountDto> accountList;
	

	/**
	 * 생성자에서 테스트를 위한 고객 및 계좌 객체를 생성하고 배열에 저장한다
	 */
	public BankService() {
		// 배열 생성
		userList = new ArrayList<UserDto>();
		accountList = new ArrayList<AccountDto>();

		// 각 배열방에 고객을 생성한다.
		userList.add( new UserDto(111, "홍길동", "hong@gildong@com", "010-1111-1111", false) );
		userList.add( new UserDto(222, "이길동", "lee@gildong@com", "010-2222-2222", true) );
		userList.add( new UserDto(333, "삼길동", "sam@gildong@com", "010-3333-3333", false) );
		
		
		accountList.add( new InstallAccountDto(20, "00200202002002", 1000, 111, 12, 10000) );
		accountList.add( new SavingAccountDto(10, "00100101001001", 500, 111, 100) );
		accountList.add( new LoanAccountDto(30, "00300303003003", 0, 111, "Building") );
		
		accountList.add( new LoanAccountDto(50, "00500505005005", 200, 222, "Car") );
		accountList.add( new SavingAccountDto(40, "00400404004004", 1000, 222, 50) );
		
		accountList.add( new LoanAccountDto(60, "00600606006006", 500, 333, "House") );
		accountList.add( new SavingAccountDto(70, "00700707007007", 500, 333, 200) );
	}
	
	/**
	 * 특정 사용자의 계좌 목록을 배열로 리턴 하는 메소드
	 */
	public List<AccountDto> getAccountList(int userSeq) {
		ArrayList<AccountDto> userAccountList = new ArrayList<AccountDto>();
		
		for (AccountDto dto : accountList) {
			if (dto.getUserSeq() == userSeq)  {
				userAccountList.add(dto); 
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
		for (UserDto dto : userList) {
			if (dto.getUserSeq() == userSeq) {
				return dto;
			}
		}
		return null;
	}

	/**
	 * 모든 사용자의 고객 정보를 리턴 하는 메소드
	 * @return : List<AccountDto>, null이면 고객 없음
	 */
	public List<AccountDto> getAccountList() {
		return new ArrayList<AccountDto>(accountList);
	}

	/**
	 * 잔고 기준으로 정렬한 모든 계좌를 반환하는 메서드
	 * Comparable 인터페이스 이용함, compareTo
	 * @return : List<AccountDto>, null이면 고객 없음
	 */
	public List<AccountDto> getAccountListSortByBalance() {
		List<AccountDto> result = new ArrayList<>(accountList);

		Collections.sort(result);

		return result;
	}

	/**
	 * 유저번호 기준으로 정렬한 모든 계좌를 반환하는 메서드
	 * Comparator 함수형 인터페이스 이용함, compare
	 * @return : List<AccountDto>, null이면 고객 없음
	 */
	public List<AccountDto> getAccountListSortByUserSeq() {
		List<AccountDto> result = new ArrayList<>(accountList);

		Collections.sort(result, (a1, a2) -> a1.getUserSeq() - a2.getUserSeq());
		
		return result;
	}
}