package ex0807.enumex;

/*
 * enum 열거형 안에는 모두 static final
 * enum 타입 생성자는 무조건 private(생략 가능)
 */
public enum Grade {
	BASIC("일반", 100, 5),
	SILVER("우수", 200, 10),
	GOLD("최우수", 300, 30);

	private final String kind;
	private final int point;
	private final int role;
	
	Grade(String kind, int point, int role) {
		this.kind = kind;
		this.point = point;
		this.role = role;
	}
	
	public String getKind() {
		return kind;
	}
	public int getPoint() {
		return point;
	}
	public int getRole() {
		return role;
	}
}
