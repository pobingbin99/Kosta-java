package ex0814.set;

public class Member {
	private String name;
	private int age;
	private String addr;
	
	public Member() {
	}
	
	public Member(String name, int age, String addr) {
		this.name = name;
		this.age = age;
		this.addr = addr;
	}

	// Getter
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getAddr() {
		return addr;
	}

	// Setter
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	@Override
	public int hashCode() {
		return this.name.hashCode() + age;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member m) {
			return this.name.equals(m.getName()) && this.age == m.getAge();
		}
		return false;
	}
}