package WS_06_Interface.com.ws06.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import WS_06_Interface.com.ws06.dto.AccountDto;
import WS_06_Interface.com.ws06.dto.InstallAccountDto;
import WS_06_Interface.com.ws06.dto.LoanAccountDto;
import WS_06_Interface.com.ws06.dto.SavingAccountDto;
import WS_06_Interface.com.ws06.dto.UserDto;

/**
 * 고객과 계좌에 관련된 서비스 (Business Logic 처리 객체)
 */

//자동 import 단축키 = ctrl + shift + 영문o
public class BankServiceImpl implements BankService {
	/** 고객 및 계좌는 리스트로 관리 */
	private List<UserDto> userList;
	private List<AccountDto> accountList;
	

	/**
	 * 생성자에서 테스트를 위한 고객 및 계좌 객체를 생성하고 배열에 저장한다
	 */
	public BankServiceImpl() {
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
	
	@Override
	public List<AccountDto> getAccountList(int userSeq) {
		ArrayList<AccountDto> userAccountList = new ArrayList<AccountDto>();
		
		for (AccountDto dto : accountList) {
			if (dto.getUserSeq() == userSeq)  {
				userAccountList.add(dto); 
			}
		}
		
		return userAccountList;
	}

	@Override
	public UserDto getUserDetail(int userSeq) {
		for (UserDto dto : userList) {
			if (dto.getUserSeq() == userSeq) {
				return dto;
			}
		}
		return null;
	}

	@Override
	public List<AccountDto> getAccountList() {
		return new ArrayList<AccountDto>(accountList);
	}

	@Override
	public List<AccountDto> getAccountListSortByBalance() {
		List<AccountDto> result = new ArrayList<>(accountList);

		Collections.sort(result);

		return result;
	}

	@Override
	public List<AccountDto> getAccountListSortByUserSeq() {
		List<AccountDto> result = new ArrayList<>(accountList);

		Collections.sort(result, (a1, a2) -> a1.getUserSeq() - a2.getUserSeq());
		
		return result;
	}
}
