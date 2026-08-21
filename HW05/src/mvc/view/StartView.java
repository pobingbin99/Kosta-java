package mvc.view;

import mvc.service.ProfileServiceImpl;

public class  StartView{
	public static void main(String[] args) {
       MenuView mv  = new MenuView(new ProfileServiceImpl());
	   mv.printMenu();
	}
} 