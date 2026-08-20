package com.ws03.dto;

/**
 *  고객의 정보를 관리할 객체 
 * */
public class UserDto {
	private int userSeq;
	private String name;
	private String email;
	private String phone;
	private boolean isSleep;
	
	/**
	 * 기본 생성자
	 */
	public UserDto() {
	}
	
	/**
	 * 인자 4개를 전달받는 생성자
	 * @param userSeq : int
	 * @param name : String
	 * @param email : String
	 * @param phone : String
	 * @param isSleep : boolean
	 */
	public UserDto(int userSeq, String name, String email, String phone, boolean isSleep) {
		this.userSeq = userSeq;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.isSleep = isSleep;
	}

	// Getter
	public int getUserSeq() {
		return userSeq;
	}
	
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public boolean isSleep() {
		return isSleep;
	}
	
    // Setter
	public void setUserSeq(int userSeq) {
		this.userSeq = userSeq;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setSleep(boolean isSleep) {
		this.isSleep = isSleep;
	}
}