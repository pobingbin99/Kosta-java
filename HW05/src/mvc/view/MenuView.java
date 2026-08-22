package mvc.view;

import java.util.Scanner;

import mvc.controller.ProfileController;
import mvc.dto.Profile;
import mvc.dto.ResultType;
import mvc.dto.SearchResult;

public class MenuView {
	private Scanner sc = new Scanner(System.in);

	private ProfileController controller = new ProfileController();

	public void printMenu() {
		while (true) {
			System.out.println("다음 사항에 맞게 입력하여 주십시요");
			System.out.println("\t몸무게 입력은 1 번");
			System.out.println("\t몸무게 검색은 2 번");
			System.out.println("\t몸무게 변경은 3 번");
			System.out.println("\t비밀먼호 변경은 4 번");
			System.out.println("\t프로그램 종료는 5 번");
			System.out.println("을 입력후 Enter을 눌러 주십시요.");
			System.out.print("메뉴 선택: ");
			
			int menuChoice = Integer.parseInt(sc.nextLine());

			switch (menuChoice) {
			case 1:
				insert();
				break;
			case 2:
				searchWeight();
				break;
			case 3:
				updateWeight();
				break;
			case 4:
				updatePassword();
				break;
			case 5:
				System.exit(0);
			default:
				System.out.println("메뉴는 1~5만 입력해주세요.");
			}
		}
	}

	private void insert() {
		System.out.println("\n이름을 입력하여 주십시요.");
		System.out.print("이름: ");
		String name = sc.nextLine();

		System.out.println("\n몸무게를 입력하여 주십시요.");
		System.out.print("몸무게: ");
		int weight = Integer.parseInt(sc.nextLine());

		System.out.println("\n비밀번호를 입력하여 주십시요.");
		System.out.print("비밀번호: ");
		String password = sc.nextLine();

		Profile profile = new Profile(name, weight, password);
		controller.register(profile);
	}
	
	private Profile inputProfile() {
	    System.out.println("\n이름을 입력하여 주십시오.");
	    System.out.print("이름: ");
	    String name = sc.nextLine();

	    System.out.println("\n비밀번호를 입력하여 주십시오.");
	    System.out.print("비밀번호: ");
	    String password = sc.nextLine();

	    return new Profile(name, password);
	}
	
	private void searchWeight() {
	    Profile profile = inputProfile();

	    for (int i = 0; i < 2; i++) {
	        SearchResult sr = controller.searchWeight(profile);

	        if (sr.getResultType() == ResultType.INVALID_PASSWORD) {
	        	System.out.println("비밀번호를 다시 입력하여 주십시오. (남은기회: " + (2-i) + ")");
	    	    System.out.print("비밀번호: ");
	    	    String password = sc.nextLine();
	    	    
	    	    profile.setPassword(password);
	        
	        } else {
	        	break;
	        }
	    }
	}

	private void updateWeight() {
	    Profile profile = inputProfile();
	    Profile findProfile = controller.searchWeight(profile).getProfile();
	    
	    if (findProfile != null) {
	    	System.out.println("\t변경할 몸무게를 입력하여 주십시요.");
			System.out.print("\t변경할 몸무게: ");
			int weight = Integer.parseInt(sc.nextLine());
			
			findProfile.setWeight(weight);
			controller.updateWeight(findProfile);
	    }
	}

	private void updatePassword() {
	    Profile profile = inputProfile();
	    Profile findProfile = controller.searchPassword(profile).getProfile();
	    
	    if (findProfile != null) {
	    	System.out.println("\t변경할 비밀번호를 입력하여 주십시요.");
			System.out.print("\t변경할 비밀번호: ");
			String password = sc.nextLine();
			
			findProfile.setPassword(password);
			controller.updatePassword(findProfile);
	    }
	}
}