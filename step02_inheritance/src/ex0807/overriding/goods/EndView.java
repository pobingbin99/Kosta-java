package ex0807.overriding.goods;

/**
 * 요청 결과를 출력할 view
 */
public class EndView {
	/**
	 * 성공여부 메시지를 출력하는 메소드
	 */
	public static void printMessage(String message) {
		System.out.println(message + "\n");
	}

	/**
	 * 전체검색 결과를 출력하는 메소드
	 */
	public static void printSelectAll(Goods[] arr, int count) {
		System.out.printf("총 상품 수: %d\n\n", count);
		for (int i = 0; i < count; i++) {
			System.out.println(arr[i]);
		}
	}

	/**
	 * 상품코드에 해당하는 상세정보 출력하는 메소드
	 */
	public static void printSelectByCode(Goods goods) {
		System.out.println(goods);
	}
}