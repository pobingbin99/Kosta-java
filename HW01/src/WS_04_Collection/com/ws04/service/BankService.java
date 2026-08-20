package WS_04_Collection.com.ws04.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import WS_04_Collection.com.ws04.dto.AccountDto;
import WS_04_Collection.com.ws04.dto.UserDto;

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

		// 각 배열방에 고객을 생성한다. (4개 정도)
		userList.add(new UserDto(100, "장희정", "8253jang@daum.net", "010-8875-8253", false));
		userList.add(new UserDto(200, "이효리", "lee@daum.net", "010-2222-3333", false));
		userList.add(new UserDto(300, "송중기", "song@naver.com", "010-5554-2222", false));
		userList.add(new UserDto(400, "삼순이", "sam@daum.com", "010-2222-2222", false));

		// 각 배열방에 계좌를 생성한다. (6개 정도)
		accountList.add(new AccountDto(1, "1111-11111", 1000000, 100));
		accountList.add(new AccountDto(2, "2222-22222", 250000, 100));
		accountList.add(new AccountDto(3, "3333-33333", 350000, 100));
		accountList.add(new AccountDto(4, "4444-44444", 150000, 200));
		accountList.add(new AccountDto(5, "5555-55555", 250000, 200));
		accountList.add(new AccountDto(6, "6666-66666", 350000, 300));
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
