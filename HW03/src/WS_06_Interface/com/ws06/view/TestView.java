package WS_06_Interface.com.ws06.view;

import java.util.List;

import WS_06_Interface.com.ws06.dto.AccountDto;
import WS_06_Interface.com.ws06.dto.UserDto;
import WS_06_Interface.com.ws06.service.BankService;
import WS_06_Interface.com.ws06.service.BankServiceImpl;

public class TestView {
	public static void main(String[] args) {
		BankService service = new BankServiceImpl();

		System.out.println("***1. userSeq 100에 해당하는 계좌 정보 검색하기 **********");
		List<AccountDto> accountList = service.getAccountList(111);

		if (accountList.isEmpty()) {
			System.out.println("회원의 계좌정보가 없습니다. ");
		} else {
			System.out.println("회원계좌 개수 : " + accountList.size());
			for (AccountDto dto : accountList) {
				System.out.println(dto.getAccountSeq() + ", " + dto.getAccountNumber() + " , " + dto.getUserSeq());
			}
		}

		System.out.println("\n\n***2. userSeq에 해당하는 고객 정보 검색하기 **********");
		UserDto userDto = service.getUserDetail(111);

		if (userDto != null) {
			System.out.println(userDto.getUserSeq() + " , " + userDto.getName() + " , " + userDto.getEmail() + " , "
					+ userDto.getPhone() + " , " + userDto.isSleep());
		} else {
			System.out.println("회원의 정보가 없습니다.");
		}
	}
}