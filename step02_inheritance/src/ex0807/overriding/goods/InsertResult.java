package ex0807.overriding.goods;

public enum InsertResult {
	INSERT_DUPLICATE("중복이므로 등록할수 없습니다.", 0),
	INSERT_OUTINDEX("더이상 등록할 수 없습니다.", -1),
	INSERT_SUCCESS("상품이 등록되었습니다.", 1);
	
	private final String message;
	private final int code;
	
	InsertResult(String message, int code) {
		this.message = message;
		this.code = code;
	}

	public String getMessage() {
		return message;
	}
	public int getCode() {
		return code;
	}
}