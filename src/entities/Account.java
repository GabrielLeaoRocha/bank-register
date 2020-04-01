package entities;

public class Account {
	private Integer numberAccount;
	private String name;
	private Double balance = 0.0;
	private Long cpf;
	private Long phone;
	private String email;

	//Construtores
	public Account(int numberCount, String name) {
		this.numberAccount = numberCount;
		this.name = name;
	}
	
	public Account(int numberAccount, String name, double initialDeposit) {
		this.numberAccount = numberAccount;
		this.name = name;
		deposit(initialDeposit);
	}
	
	public Account(Integer numberAccount, String name, Long cpf, Long phone, String email) {
		this.numberAccount = numberAccount;
		this.name = name;
		this.cpf = cpf;
		this.phone = phone;
		this.email = email;
	}
	
	public Account(Integer numberAccount, String name, Long cpf, Long phone, String email, double initialDeposit) {
		this.numberAccount = numberAccount;
		this.name = name;
		this.cpf = cpf;
		this.phone = phone;
		this.email = email;
		deposit(initialDeposit);
	}
	
	//getters and setters
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

	//metodos
	
	public void deposit(double value){
		
		this.balance += value;
	}
	
	public void withdraw(double value){
		
		this.balance -= value + 5.0;
	}
	
	//toString
	public String toString() {
		
		return  "Account "
				+numberAccount
				+", Holder: "
				+name
				+", Balance: R$"
				+String.format("%.2f",balance);
	}

}
