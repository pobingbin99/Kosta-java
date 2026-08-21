package mvc.view;

import java.util.Scanner;

import mvc.dto.Profile;
import mvc.exception.DuplicateUserException;
import mvc.exception.InvalidPasswordException;
import mvc.exception.UserNotFoundException;
import mvc.service.ProfileService;

public class MenuView {
	private Scanner sc = new Scanner(System.in);
	
	private ProfileService service;
	
	public MenuView(ProfileService service) {
		this.service = service;
	}
	
	public void printMenu() {
		outer:
		while (true) {
			try {
				System.out.println("1.프로필 저장    2.프로필 불러오기    3.종료");
				int menuChoice = Integer.parseInt(sc.nextLine());

				switch (menuChoice) {
				case 1:
					insert();
					break;
				case 2:
					search();
					break;
				case 3:
					break outer;
				default:
					System.out.println("메뉴는 1~3만 입력해주세요.");
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

	public void insert() throws DuplicateUserException {
		System.out.print("이름 > ");
		String name = sc.nextLine();

		System.out.print("몸무게 > ");
		int weight = Integer.parseInt(sc.nextLine());
		
		System.out.print("비밀번호 > ");
		int password = Integer.parseInt(sc.nextLine());

		Profile profile = new Profile(name, weight, password);
		service.insert(profile);
		System.out.println("프로필 저장완료");
	}

	public void search() throws UserNotFoundException, InvalidPasswordException {
		System.out.print("이름 > ");
		String name = sc.nextLine();
		
		System.out.print("비밀번호 > ");
		int password = Integer.parseInt(sc.nextLine());
		
		Profile profile = new Profile(name, password);

		Profile resultProfile = service.search(profile);
		System.out.println(resultProfile);
	}
}