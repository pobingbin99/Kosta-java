package ex0811.exam;

//인터페이스 ElecFuntion 구현 객체
public class Audio extends Elec implements ElecFunction {
	private int volumn;
	
	// Constructor
	public Audio() {
	}
	
	public Audio(int volumn) {
		this.volumn = volumn;
	}
	
	public Audio(String code, int cost, int volumn) {
		super(code, cost);
		this.volumn = volumn;
	}
	
	@Override
	public void start() {
		System.out.println("Audio의 start()");
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
		builder.append("의 Audio를 ");
		builder.append(volumn);
		builder.append("으로 듣는다.");
		return builder.toString();
	}
}
