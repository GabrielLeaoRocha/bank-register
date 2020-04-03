package Aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;

		// Programa que cadastra um novo cliente de um banco e realiza um deposito
		// inicial opcional

		// cadastro:
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("Enter holder cpf: ");
		long cpf = sc.nextLong();
		System.out.print("Enter holder phone: ");
		long phone = sc.nextLong();
		System.out.print("Enter holder email: ");
		sc.nextLine();
		String email = sc.nextLine();
		System.out.print("Enter the password: ");
		String password = sc.nextLine();
		System.out.println();
		System.out.print("Is there na initial deposit (y/n)? ");
		char resp = sc.next().charAt(0);

		// depósito inicial opcional:
		if (resp == 'y') {
			System.out.print("Enter initial deposit value: R$");
			double value = sc.nextDouble();
			account = new Account(number, name, password, cpf, phone, email, value);
		} else {

			account = new Account(number, name, password, cpf, phone, email);
		}

		System.out.println();
		System.out.println("Account data:\n" + account);
		
		char resp2;
		
		do {
		
			System.out.println();
			System.out.println("========== MENU ===========");
			System.out.println("1 - make deposit");
			System.out.println("2 - make withdraw");
			System.out.println("===========================");
			System.out.print("Select the action: ");
			int resp1 = sc.nextInt();
			
			// validação da senha:
			System.out.println();
			System.out.print("Enter your password: ");
			sc.nextLine();
			password = sc.nextLine();
			if (account.getPassword().equals(password)) {
				
				//ações:
				switch (resp1) {
			
				case 1:
				
					// depósito:
					System.out.println();
					System.out.print("Enter a deposit value: R$");
					double value = sc.nextDouble();
					account.deposit(value);
	
					System.out.println();
					System.out.println("Updated account data:\n" + account);
					System.out.println();
					break;
				
				case 2:
					
					// saque (taxa de R$ 5.00/saque):
					System.out.println();
					System.out.print("Enter a withdraw value: R$");
					value = sc.nextDouble();
					account.withdraw(value);
	
					System.out.println();
					System.out.println("Updated account data:\n" + account);
					System.out.println();
					break;
				
				default:
					// caso ação não existente
					System.out.println("||Unregistered action||");
				}
				// comando de finalização do programa
				System.out.print("You want exit the program?(y/n): ");
				resp2 = sc.next().charAt(0);
			
			}
			// caso senha incorreta
			else {
				System.out.println("ERROR: wrongh password!");
				resp2 = 'n';
			}

		}while(resp2 == 'n');
		
		System.out.println();
		System.out.println("Thank you!");
		
		sc.close();

	}
}
