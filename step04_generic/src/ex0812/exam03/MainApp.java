package ex0812.exam03;

public class MainApp {
	public static void main(String[] args) {
		Rentable<Car> rt1 = new CarAgency();
		Car car = rt1.rent();
		car.run();
		
		Rentable<Home> rt2 = new HomeAgency();
		Home home = rt2.rent();
		home.room();
	}
}