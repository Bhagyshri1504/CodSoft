package com.java.atminterface;

import java.util.Scanner;

public class UserBankAccount 
{
	private double balence;
	
	public UserBankAccount(double balence)
	{
		this.balence = balence;
	}
	
	public void withdraw(double withrawAmount)
	{
		//UserBankAccount userBankAccount=new UserBankAccount();
		if(withrawAmount>=balence)
		{
			System.out.println("Insufficient Balence");
		}
		else
		{
			balence=balence-withrawAmount;
			if(withrawAmount>0)
			{
				System.out.println("Withdraw successfull.");
				System.out.println(balence);
			}
			else
			{
				System.out.println("Invalid Withdraw amount");
			}
			
		}
	}
	public void deposit(double depositAmount)
	{
		if(depositAmount>0)
		{
			balence=balence+depositAmount;
			System.out.println("Deposit successfull.");
		}
		else 
		{

			System.out.println("Invalid deposit amount.");

		}
	}
	
	public void checkBalence()
	{
		System.out.println("Your Account balence is:"+balence);
	}
}
