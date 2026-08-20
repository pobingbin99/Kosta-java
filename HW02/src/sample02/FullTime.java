package sample02;

public class FullTime extends Employee {
	private int salary;
	private int bonus;
	
	FullTime() {
	}
	
	public FullTime(int empNo, String eName, String job, int mgr,
			String hiredate, String depName, int salary, int bonus) {
		super(empNo, eName, job, mgr, hiredate, depName);
		this.salary = salary;
		this.bonus = bonus;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(" | ");
		builder.append(salary);
		builder.append(" | ");
		builder.append(bonus);
		return builder.toString();
	}
	
	@Override
	public void message() {
		System.out.printf("%s사원은 정규직입니다.\n", this.geteName());
	}
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
}