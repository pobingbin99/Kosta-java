package ex0806.ch06;

public class Account {
    private String account;
    private String name;
    private int balance;

    public Account(String account, String name, int balance) {
        this.account = account;
        this.name = name;
        this.balance = balance;
    }

    public String getAccount() {
        return account;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    // 입금
    public void deposit(int money) {
        balance += money;
    }

    // 출금
    public void withdraw(int money) {
        balance -= money;
    }
}