package WS_06_Interface.com.ws06.dto;

public class SavingAccountDto extends AccountDto {
	private int transferFee;

	/**
	 * 기본 생성자
	 */
	public SavingAccountDto () {
		
	}

	/**
	 * 인자 5개를 전달받는 생성자
	 * @param accountSeq : int
	 * @param accountNumber : String
	 * @param balance : int
	 * @param userSeq : int
	 * @param transferFee : int
	 */
	public SavingAccountDto(int accountSeq, String accountNumber, int balance, int userSeq, int transferFee) {
		super(accountSeq, accountNumber, balance, userSeq);
		this.transferFee = transferFee;
	}

	// Getter
	public int getTransferFee() {
		return transferFee;
	}
	
	// Setter
	public void setPeriod(int transferFee) {
		this.transferFee = transferFee;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(", transferFee=");
		builder.append(transferFee);
		builder.append("]");
		return builder.toString();
	}
}
