package WS_05_Extends.com.ws05.dto;

public class LoanAccountDto extends AccountDto {
	private String mortgage;
	
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
	public LoanAccountDto(int accountSeq, String accountNumber, int balance, int userSeq, String mortgage) {
		super(accountSeq, accountNumber, balance, userSeq);
		this.mortgage = mortgage;
	}

	// Getter
	public String getMortgage() {
		return mortgage;
	}
	// Setter
	public void setMortgage(String mortage) {
		this.mortgage = mortage;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(", mortage=");
		builder.append(mortgage);
		builder.append("]");
		return builder.toString();
	}
}