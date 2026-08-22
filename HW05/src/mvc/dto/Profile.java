package mvc.dto;

import java.io.Serializable;

public class Profile implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String name;
	private int weight;
	private String password;
	
	/**
	 * 기본 생성자
	 */
	public Profile() { 
	}
	
	/**
	 * 파라미터 2개를 전달 받는 생성자
	 * @param name - String
	 * @param password - String
	 */
	public Profile(String name, String password) {
		this.name = name;
		this.password = password;
	}
	
	/**
	 * 파라미터 3개를 전달 받는 생성자
	 * @param name - String
	 * @param weight - int
	 * @param password - String
	 */
	public Profile(String name, int weight, String password) {
		this(name, password);
		this.weight = weight;
	}

	public String getName() {
		return name;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public void setPassword(String password) {
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