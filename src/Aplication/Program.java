package Aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {
	
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;
		
		//Programa que cadastra um novo cliente de um banco e realiza um deposito inicial opcional
		
		//cadastro:
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: "); 
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("Is there na initial deposit (y/n)? ");
		
		//depósito inicial opcional:
		char resp = sc.next().charAt(0);
		if(resp == 'y') {
			System.out.print("Enter initial deposit value: R$");
			double value = sc.nextDouble();
			account = new Account(number, name, value);
		}
		else {
			
			account = new Account(number, name);
		}
		
		System.out.println();
		System.out.println("Account data:\n" + account);
		System.out.println();
		
		//depósitos: 
		System.out.print("Enter a deposit value: R$");
		double value = sc.nextDouble();
		account.deposit(value);
		
		System.out.println();
		System.out.println("Updated account data:\n" + account);
		System.out.println();
		
		//saque (taixa de R$ 5.00/saque):
		System.out.print("Enter a withdraw value: R$");
		value = sc.nextDouble();
		account.withdraw(value);
		
		System.out.println();
		System.out.println("Updated account data:\n" + account);
		System.out.println();
		
		sc.close();
		
	}
}
