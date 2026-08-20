package com.ws03.view;

import com.ws03.dto.AccountDto;
import com.ws03.dto.UserDto;
import com.ws03.service.BankService;

public class TestView {
	public static void main(String[] args) {
		// BankService 객체 생성
		BankService service = new BankService();
		
		System.out.println("***1. userSeq 100에 해당하는 계좌 정보 검색하기 **********");
		AccountDto[] accountList = service.getAccountList(100);

		if (accountList == null) {
			System.out.println("회원의 계좌정보가 없습니다. ");
		} else {
			System.out.println("회원계좌 개수 : " + accountList.length);
			for (AccountDto dto : accountList) {
				System.out.println(dto.getAccountSeq() + ", " + dto.getAccountNumber() + " , " + dto.getUserSeq());
			}
		}

		System.out.println("\n\n***2. userSeq에 해당하는 고객 정보 검색하기 **********");
		UserDto userDto = service.getUserDetail(300);
		if (userDto != null) {
			System.out.print(userDto.getUserSeq() + " , " + userDto.getName() + " , " + userDto.getEmail() + " , ");
			System.out.println(userDto.getPhone() + " , " + userDto.isSleep()); 
		} else {
			System.out.println("회원의 정보가 없습니다.");
		}
	}
}