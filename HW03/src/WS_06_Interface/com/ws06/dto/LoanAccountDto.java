package WS_06_Interface.com.ws06.dto;

public class LoanAccountDto extends AccountDto {
	private String mortage;
	
	/**
	 * 기본 생성자
	 */
	public LoanAccountDto () {
		
	}
	
	/**
	 * 인자 5개를 전달받는 생성자
	 * @param accountSeq : int
	 * @param accountNumber : String
	 * @param balance : int
	 * @param userSeq : int
	 * @param mortage : String
	 */
	public LoanAccountDto(int accountSeq, String accountNumber, int balance, int userSeq, String mortage) {
		super(accountSeq, accountNumber, balance, userSeq);
		this.mortage = mortage;
	}

	// Getter
	public String getMortage() {
		return mortage;
	}
	// Setter
	public void setMortage(String mortage) {
		this.mortage = mortage;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(", mortage=");
		builder.append(mortage);
		builder.append("]");
		return builder.toString();
	}
}