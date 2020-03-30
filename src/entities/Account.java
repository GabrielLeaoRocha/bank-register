package entities;

public class Account {
	private int numberAccount;
	private String name;
	private double balance;

	public Account(int numberCount, String name) {

		this.numberAccount = numberCount;
		this.name = name;
	}
	
	

	public Account(int numberAccount, String name, double initialDeposit) {
		this.numberAccount = numberAccount;
		this.name = name;
		deposit(initialDeposit);
	}



	public int getNumberCount() {
		return numberAccount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public double getBalance() {
		return balance;
	}

	public void deposit(double value){
		
		this.balance += value;
	}
	
	public void withdraw(double value){
		
		this.balance -= value + 5.0;
	}
	
	public String toString() {
		
		return  "Account "
				+numberAccount
				+", Holder: "
				+name
				+", Balance: R$"
				+String.format("%.2f",balance);
	}

}
