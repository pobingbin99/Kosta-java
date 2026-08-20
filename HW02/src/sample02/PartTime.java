package sample02;

public class PartTime extends Employee {
	private int timePay;
	
	PartTime() {
	}
	
	public PartTime(int empNo, String eName, String job, int mgr,
			String hiredate, String depName, int timePay) {
		super(empNo, eName, job, mgr, hiredate, depName);
		this.timePay = timePay;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(" | ");
		builder.append(timePay);
		return builder.toString();
	}
	
	@Override
	public void message() {
		System.out.printf("%s사원은 비정규직입니다.\n", this.geteName());
	}

	public int getTimePay() {
		return timePay;
	}
	public void setTimePay(int timePay) {
		this.timePay = timePay;
	}
}
