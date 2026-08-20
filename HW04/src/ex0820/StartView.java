package ex0820;

public class  StartView{
	public static void main(String[] args) {
       MenuView mv  = new MenuView(new ProfileService());
	   mv.printMenu();
	}
} 