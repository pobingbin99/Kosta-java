package WS_06_Interface.com.ws06.dto;

public class InstallAccountDto extends AccountDto {
	private int period;
	private int amount;

	/**
	 * 기본 생성자
	 */
	public InstallAccountDto () {
		
	}

	/**
	 * 인자 6개를 전달받는 생성자
	 * @param accountSeq : int
	 * @param accountNumber : String
	 * @param balance : int
	 * @param userSeq : int
	 * @param period : int
	 * @param amount : int
	 */
	public InstallAccountDto(int accountSeq, String accountNumber, int balance, int userSeq, int period, int amount) {
		super(accountSeq, accountNumber, balance, userSeq);
		this.period = period;
		this.amount = amount;
	}

	// Getter
	public int getPeriod() {
		return period;
	}
	
	public int getAmount() {
		return amount;
	}

	// Setter
	public void setPeriod(int period) {
		this.period = period;
	}
	
	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(", period=");
		builder.append(period);
		builder.append(", amount=");
		builder.append(amount);
		builder.append("]");
		return builder.toString();
	}
}