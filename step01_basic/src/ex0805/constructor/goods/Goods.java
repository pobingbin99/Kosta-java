package ex0805.constructor.goods;

/**
 * 상품으로 속성을 관리하는 개체
 */
public class Goods{
	private String code;
	private String name;
	private int price;
	private String explain;
	
	/**
	 * 파라미터 4개를 전달 받는 생성자
	 * @param code - String
	 * @param name - String
	 * @param price - int
	 * @param explain - String
	 */
	public Goods(String code, String name, int price, String explain) {
		this(code, price, explain);
		this.name = name;
	}
	
	/**
	 * 파라미터 3개를 전달 받는 생성자
	 * @param code - String
	 * @param price - int
	 * @param explain - String
	 */
	public Goods(String code, int price, String explain) {
		this.code = code;
		this.price = price;
		this.explain = explain;
	}
	
	/*
	 * 지역 변수 Getter
	 */
	public String getCode() {
		return code;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}

	/*
	 * 지역 변수 Setter
	 */
	public void setCode(String code) {
		this.code = code;
	}
	public String getExplain() {
		return explain;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setExplain(String explain) {
		this.explain = explain;
	}
}