package WS_05_Extends.com.ws05.dto;

/**
 * 고객의 계좌정보 관리하는 객체
 */
public class AccountDto implements Comparable<AccountDto> {
	private int accountSeq;
	private String accountNumber;
	private int balance;
	private int userSeq;
	
	/**
	 * 기본 생성자
	 */
	public AccountDto() {
		
	}
	
	/**
	 * 인자 4개를 전달받는 생성자
	 * @param accountSeq : int
	 * @param accountNumber : String
	 * @param balance : int
	 * @param userSeq : int
	 */
	public AccountDto(int accountSeq, String accountNumber, int balance, int userSeq) {
		this.accountSeq = accountSeq;
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.userSeq = userSeq;
	}

	// Getter
	public int getAccountSeq() {
		return accountSeq;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public int getUserSeq() {
		return userSeq;
	}
	
	// Setter
	public void setAccountSeq(int accountSeq) {
		this.accountSeq = accountSeq;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void setUserSeq(int userSeq) {
		this.userSeq = userSeq;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AccountDto [accountSeq=");
		builder.append(accountSeq);
		builder.append(", accountNumber=");
		builder.append(accountNumber);
		builder.append(", balance=");
		builder.append(balance);
		builder.append(", userSeq=");
		builder.append(userSeq);
		return builder.toString();
	}
	
	@Override
	public int compareTo(AccountDto other) {
		return this.getBalance() - other.getBalance();
	}
}