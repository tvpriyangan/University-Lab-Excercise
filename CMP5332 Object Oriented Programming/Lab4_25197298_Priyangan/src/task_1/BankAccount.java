package task_1;

public class BankAccount {
	
	private final String accountNumber;
	private final String accountHolder;
	private double balance;
	
	public BankAccount (String accountNumber, String accountHolder) {
		this.accountNumber=accountNumber;
		this.accountHolder=accountHolder;
		this.balance=0;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public String getAccountHolder() {
		return accountHolder;

	}
	
	public double getBlancew() {
		return balance;
	}
	
	public void deposit(double amount) {
		if (amount>0) {
			balance=balance+amount;
			System.out.println("Deposit successful");
			
		}
		else {
			System.out.println("Error");
		}
	}
	
	public void withraw (double amount) {
		if(amount>0 && amount<=balance){
			balance=balance-amount;
			System.out.println("Withraw Successful");
								
		}
		else {
			System.out.println("Error: insuffient balance");
		}
	}

}
