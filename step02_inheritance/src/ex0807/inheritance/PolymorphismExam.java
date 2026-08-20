package ex0807.inheritance;

class CarCenter {
	public void engineer(Car cd){
		System.out.print(cd.carName + " 수리완료!\t");
		System.out.println("청구비용 " + cd.cost+" 원");
		
		// 부모 타입을 자식 타입에 담기
		if (cd instanceof EfSonata) {
			EfSonata casting = (EfSonata) cd;
			System.out.println(casting.i);
		}
	}
}

public class PolymorphismExam{
	public static void main(String[] args) {
		CarCenter cc = new CarCenter();
		
//		Car c= new Car();
//		Carnival ca = new Carnival();
//		Excel ex =new Excel();
		EfSonata ef = new EfSonata();
		
//		cc.engineer(c); 
//		cc.engineer(ca);
//		cc.engineer(ex);
		cc.engineer(ef);
	}
}
