package com.java.atminterface;

import java.util.Scanner;

public class AtmMachine
{
	 private UserBankAccount userBankAccount;
	 public AtmMachine(UserBankAccount userBankAccount)
	 {
		 this.userBankAccount = userBankAccount;
	 }

	public void switchCase()
	{
		Scanner scanner=new Scanner(System.in);
		Integer choice;
		//UserBankAccount userBankAccount=new UserBankAccount(50000.0);
		do
		{
			System.out.println("Enter 1 to Withdraw amount");
			System.out.println("Enter 2 to Deposit amount");
			System.out.println("Enter 3 to Check Balence");
			System.out.println("Enter 4 to Exit");
			System.out.println("Enter your choice: ");
			choice=scanner.nextInt();
		
			switch(choice)
			{
				case 1:
					System.out.println("Enter the withdrawal amount: ");
					Double withdrawAmount = scanner.nextDouble();
					userBankAccount.withdraw(withdrawAmount);
					break;
					
				case 2:
					  System.out.print("Enter the deposit amount: ");
	
			          double depositAmount = scanner.nextDouble();
	
			          userBankAccount.deposit(depositAmount);
					break;
					
				case 3:
					userBankAccount.checkBalence();
					break;
				
				case 4:
					System.exit(0);
					
				default:
					System.out.println("Invalid Choice ");
					switchCase();
			}
		}while(choice!=4);
	}
	public static void main(String[] args) 
	{
		UserBankAccount userBankAccount=new UserBankAccount(50000.0);
		AtmMachine atmMachine=new AtmMachine(userBankAccount);
		System.out.println("-------------------------------------");
		System.out.println("\tWELCOME TO ATM");
		System.out.println("-------------------------------------");
		atmMachine.switchCase();
			
	}
}


