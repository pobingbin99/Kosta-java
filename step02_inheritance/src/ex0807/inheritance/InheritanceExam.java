package ex0807.inheritance;

class Car {
	public String carName;
	public int cost;

	protected void printAttributes() {
		System.out.printf("carName = %-15s cost = %d\n", carName, cost);
	}
}

// Car를 상속받는 EfSonata, Excel, Carnival 3개 클래스 작성	
// 각 클래스에 인수를 받지않는 생성자 작성
// 각 클래스의 생성자의 구현부에서 carname과 cost에 적당한 값 할당
class EfSonata extends Car {
	int i = 100;
	
	EfSonata() {
		super();
		carName = "sonata";
		cost  = 10000;
	}
}

class Excel extends Car {
	Excel() {
		super();
		carName = "excel";
		cost  = 20000;
	}
}

class Carnival extends Car {
	Carnival() {
		super();
		carName = "carnival";
		cost  = 30000;
	}
}

public class InheritanceExam {
	// 메인 메소드에서
	public static void main(String[] args) {
		// Car, EfSonata, Excel, Carnival 네개의 객체를 생성
		Car car = new Car();
		EfSonata sonata = new EfSonata();
		Excel excel =  new Excel();
		Carnival carnival = new Carnival();
		
		// 각 클래스에서 Car class에 있는 printAttributes() 메소드를 호출할수있다.
		car.printAttributes();
		sonata.printAttributes();
		excel.printAttributes();
		carnival.printAttributes();
	}
}