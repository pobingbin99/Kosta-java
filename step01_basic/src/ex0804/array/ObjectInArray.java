package ex0804.array;

class ObjectOne {
	public int a;
}

public class ObjectInArray{
	public static void main(String[] args) {
		//메인 메소드에서 ObjectOne 타입을 5개 저장하는 배열을 선언하고
		ObjectOne[] arr = new ObjectOne[5];

		for (int i = 0; i < arr.length; i++) {
			//5개의 ObjectOne객체를 생성하세요.
			arr[i] = new ObjectOne();
			
			//각 객체가 갖고있는 전역변수와 주소값을 출력하세요.
			System.out.println(arr[i]);
			System.out.println(arr[i].a);
			
			//각 ObjectOne객체가 서로 다른 a의 값을 갖도록 변경하세요.	
			arr[i].a = (int)(Math.random() * 10) + 1;
			
			//각 ObjectOne 객체의 a를 출력하세요.
			System.out.println(arr[i].a);
		}
	}
}