package ex0803.array;


class ArrayValue {
	//정수형 10개 저장하는 배열선언(선언과 동시에 임의값 지정)
	int[] arr = new int[] {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
	
	//printArrayValue 메소드작성
	//위에 선언된 배열의 값을 출력한다
	public void printArrayValue() {
		System.out.println("배열 길이: " + arr.length);
		for (int num: arr) {
			System.out.print(num + " ");
		}
	}
}

class ArrayValueExam{
	public static void main(String args []){
		//ArrayValue에 있는 printArrayvalue메소드 호출
		ArrayValue av= new ArrayValue();
		av.printArrayValue();
	}
}