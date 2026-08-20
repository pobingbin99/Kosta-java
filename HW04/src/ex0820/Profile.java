package ex0820;

public class Profile {
	private String name;
	private int weight;
	private int password;
	
	/**
	 * 기본 생성자
	 */
	public Profile() { 
	}
	
	/**
	 * 파라미터 3개를 전달 받는 생성자
	 * @param name - String
	 * @param weight - int
	 * @param password - int
	 */
	public Profile(String name, int weight, int password) {
		this.name = name;
		this.weight = weight;
		this.password = password;
	}

	public String getName() {
		return name;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public int getPassword() {
		return password;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public void setPassword(int password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(name);
		builder.append("님 몸무게는 ");
		builder.append(weight);
		builder.append("kg 이고 비번은 ");
		builder.append(password);
		builder.append(" 입니다.");
		return builder.toString();
	}
}