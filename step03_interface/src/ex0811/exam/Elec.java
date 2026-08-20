package ex0811.exam;

public class Elec {
	private String code;
	private int cost;
	
	// Constructor
	public Elec() {
		
	}
	
	public Elec(String code, int cost) {
		this.code = code;
		this.cost = cost;
	}
	
	// Getter
	public String getCode() {
		return code;
	}
	
	public int getCost() {
		return cost;
	}

	// Setter
	public void setCode(String code) {
		this.code = code;
	}
	
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	@Override
	public String toString() {
		return null;
	}
}