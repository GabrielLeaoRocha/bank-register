package entities;

public class Account {
	private Integer numberAccount;
	private String name;
	private String password;
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
	
	public Account(Integer numberAccount, String name, String password, Long cpf, Long phone, String email, double initialDeposit) {
		this.numberAccount = numberAccount;
		this.name = name;
		this.password = password;
		this.balance = balance;
		this.cpf = cpf;
		this.phone = phone;
		this.email = email;
		deposit(initialDeposit);
	}
	
	public Account(Integer numberAccount, String name, String password, Long cpf, Long phone, String email) {
		this.numberAccount = numberAccount;
		this.name = name;
		this.password = password;
		this.cpf = cpf;
		this.phone = phone;
		this.email = email;
	}

	//getters and setters
	
	public Integer getNumberAccount() {
		return numberAccount;
	}

	public void setNumberAccount(Integer numberAccount) {
		this.numberAccount = numberAccount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Double getBalance() {
		return balance;
	}

	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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
