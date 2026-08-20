package ex0820;

import java.util.Scanner;

public class MenuView {
	private Scanner sc = new Scanner(System.in);
	
	private ProfileService service;

	/**
	 * ProfileService 객체를 생성하는 생성자
	 */
	public MenuView(ProfileService service) {
		this.service = service;
	}
	
	public void printMenu() {
		outer:
		while (true) {
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
		}
	}

	/**
	 * 프로필 저장 입력
	 */
	public void insert() {
		// 키보드입력 4개 받기
		System.out.print("이름 > ");
		String name = sc.nextLine();

		System.out.print("몸무게 > ");
		int weight = Integer.parseInt(sc.nextLine());
		
		System.out.print("비밀번호 > ");
		int password = Integer.parseInt(sc.nextLine());

		Profile profile = new Profile(name, weight, password);
		int result = service.insert(profile);

		if (result == -1)
			System.out.println("이미 존재하므로 다시 입력하세요.");
		else if (result == 1)
			System.out.println("프로필 저장완료");
		else if (result == 0)
			System.out.println("프로필 저장실패");
	}

	/**
	 * 프로필 가져오기 입력
	 */
	public void search() {
		System.out.print("이름 > ");
		String name = sc.nextLine();

		Profile profile = service.search(name);
		
		if (profile != null) System.out.println(profile);
		else System.out.println(name + "에 해당하는 정보는 없습니다.");
	}
}
