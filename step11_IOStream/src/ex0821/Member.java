package ex0821;

import java.io.Serializable;

/*
 * Serializable 구현 객체는 직렬화 대상이 왼다.
 * 즉, 파일에 직렬화해서 객체를 저장할 수 있다.
 */
public class Member implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String id;
	private int age;
	private transient String addr;
	
	public Member(String id, int age, String addr) {
		this.id = id;
		this.age = age;
		this.addr = addr;
	}
	
	public String getId() {
		return id;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getAddr() {
		return addr;
	}
	
	public void setId(String id) {
		this.id = id;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Member [id=");
		builder.append(id);
		builder.append(", age=");
		builder.append(age);
		builder.append(", addr=");
		builder.append(addr);
		builder.append("]");
		return builder.toString();
	}
}