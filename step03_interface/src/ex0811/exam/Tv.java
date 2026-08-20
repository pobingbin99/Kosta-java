package ex0811.exam;

// 인터페이스 ElecFuntion 구현 객체
public class Tv extends Elec implements ElecFunction {
	private int chnnel;
	
	// Constructor
	public Tv() {
	}
	
	public Tv(int chnnel) {
		this.chnnel = chnnel;
	}
	
	public Tv(String code, int cost, int chnnel) {
		super(code, cost);
		this.chnnel = chnnel;
	}
	
	@Override
	public void start() {
		System.out.println("Tv의 start()");
	}
	
	@Override
	public void stop() {
		
	}
	
	@Override
	public void display() {
		
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.getCode());
		builder.append("제품의 Tv로 ");
		builder.append(chnnel);
		builder.append("채널을 본다.");
		return builder.toString();
	}
}