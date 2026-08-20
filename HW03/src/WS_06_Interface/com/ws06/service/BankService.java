package WS_06_Interface.com.ws06.service;
 
import java.util.List;

import WS_06_Interface.com.ws06.dto.AccountDto;
import WS_06_Interface.com.ws06.dto.UserDto;

public interface BankService {
	/**
	 * 특정 사용자의 계좌 목록을 배열로 리턴 하는 메소드
	 */
	public List<AccountDto> getAccountList(int userSeq);

	/**
	 * 특정 사용자의 고객 정보를 리턴 하는 메소드
	 * @param : 고객의 sequence
	 * @return : null 이면 고객 정보 없음
	 */
	public UserDto getUserDetail(int userSeq);

	/**
	 * 모든 사용자의 고객 정보를 리턴 하는 메소드
	 * @return : List<AccountDto>, null이면 고객 없음
	 */
	public List<AccountDto> getAccountList();
		

	/**
	 * 잔고 기준으로 정렬한 모든 계좌를 반환하는 메서드
	 * Comparable 인터페이스 이용함, compareTo
	 * @return : List<AccountDto>, null이면 고객 없음
	 */
	public List<AccountDto> getAccountListSortByBalance();
		
	/**
	 * 유저번호 기준으로 정렬한 모든 계좌를 반환하는 메서드
	 * Comparator 함수형 인터페이스 이용함, compare
	 * @return : List<AccountDto>, null이면 고객 없음
	 */
	public List<AccountDto> getAccountListSortByUserSeq();	
}