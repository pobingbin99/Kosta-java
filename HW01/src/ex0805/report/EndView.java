package ex0805.report;

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
	public static void printSelectAll(Goods[] arr, int count) {// service에 있는 주소가 전달되었다.
		System.out.printf("총 상품 수: %d\n\n", count);
		for (int i = 0; i < count; i++) {
			printSelectByCode(arr[i]);
		}
	}

	/**
	 * 상품코드에 해당하는 상세정보 출력하는 메소드
	 */
	public static void printSelectByCode(Goods goods) {
		System.out.printf("코드: %s, 상품명: %s, 가격: %d, 설명: %s\n\n",
				goods.getCode(), goods.getName(), goods.getPrice(), goods.getExplain());
	}
}