package WS_07_Exception.com.ws07.service;
 
import java.util.List;

import WS_07_Exception.com.ws07.dto.AccountDto;
import WS_07_Exception.com.ws07.dto.UserDto;
import WS_07_Exception.com.ws07.exception.BalanceLackException;
import WS_07_Exception.com.ws07.exception.UserAccountNotFoundException;

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
	 * @return : List<AccountDto>, null 이면 고객 없음
	 */
	public List<AccountDto> getAccountList();
		

	/**
	 * 잔고 기준으로 정렬한 모든 계좌를 반환하는 메서드
	 * Comparable 인터페이스 이용함, compareTo
	 * @return : List<AccountDto>, null 이면 고객 없음
	 */
	public List<AccountDto> getAccountListSortByBalance();
		
	/**
	 * 유저번호 기준으로 정렬한 모든 계좌를 반환하는 메서드
	 * Comparator 함수형 인터페이스 이용함, compare
	 * @return : List<AccountDto>, null 이면 고객 없음
	 */
	public List<AccountDto> getAccountListSortByUserSeq();

	/**
	 * 고객 일련번호와 계좌 일련번호를 입력받아 계좌 정보를 반환
	 * @return : AccountDto 반환 or UserAccountNotFoundException 발생
	 */
	public AccountDto getUserAccount(int userSeq, int accountSeq) throws UserAccountNotFoundException;

	/**
	 * 고객 일련번호, 계좌 일련번호, 그리고 출금 금액을 입력받아 출금 처리
	 * @return : 잔액 반환 or UserAccountNotFoundException BalanceLackException 발생
	 */
	public int withdraw(int userSeq, int accountSeq, int amount) throws UserAccountNotFoundException, BalanceLackException;	
}