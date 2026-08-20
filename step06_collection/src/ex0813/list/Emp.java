package ex0813.list;

public class Emp implements Comparable<Emp> {
	private int eno;
	private String ename;
	private int age;
	private String addr;
	
	@Override
    public int compareTo(Emp other) {
        return this.eno - other.eno;
    }
	
	public Emp() {
	}

	public Emp(int eno, String ename, int age, String addr) {
		this.eno = eno;
		this.ename = ename;
		this.age = age;
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "Emp [eno=" + eno + ", ename=" + ename + ", age=" + age + ", addr=" + addr + "]";
	}

	public int getEno() {
		return eno;
	}
	
	public String getEname() {
		return ename;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getAddr() {
		return addr;
	}
	
	public void setEno(int eno) {
		this.eno = eno;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
}