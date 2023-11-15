package com.java.game;

import java.util.Random;
import java.util.Scanner;

public class NumberGame
{
	static Integer gameCount=1,winCount=0;
	
	public static void switchCase()
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Do you want to play again press 'y' \nif you want to exit press 'n'");
		char choice=scanner.next().charAt(0);
		do
		{
			switch(choice)
			{
				case 'y':
					gameCount++;
					numberGuess();
					break;
					
				case 'n':
					System.out.println("You won game "+winCount+" out of "+gameCount);
					System.exit(0);
					break;
					
				default:
					System.out.println("You have Enter wrong choice press 'y' or 'n'");
					switchCase();
			}
		}while(true);
	}
	
	public static void numberGuess()
	{
		Scanner scanner=new Scanner(System.in);
		Random random=new Random();
		Integer randomNumber=random.nextInt(1,101);
		
		Integer attempt=5,i=0;
		for(i=1;i<=attempt;i++)
		{
			System.out.println("Enter the number that you want to guess(number between 1-100)");
			Integer guessNumber=scanner.nextInt();
			if(randomNumber==guessNumber)
			{
				System.out.println("-------------------------------------------");
				System.out.println("Congratulations...!!!");
				
				winCount++;
				
				//System.out.println("You guess the right number in "+i+" attempt..\n Your score is:"+(12-(20*attempt)));
				if(i==1)
					System.out.println("You guess the right number in "+i+"st attempt..\nYour score is:50");
				if(i==2)
					System.out.println("You guess the right number in "+i+"nd attempt..\nYour score is:30");
				if(i==3)
					System.out.println("You guess the right number in "+i+"rd attempt..\nYour score is:25");
				if(i==4)
					System.out.println("You guess the right number in "+i+"th attempt..\nYour score is:15");
				if(i==5)
					System.out.println("You guess the right number in "+i+"th attempt..\nYour score is:10");
				System.out.println("-------------------------------------------");
				switchCase();
			}
			else if(randomNumber>guessNumber)
			{
				System.out.println("Number you are entering is small");
			}
			else
			{
				System.out.println("Number you are entering is large");
			}
		}
		if(i==6)
		{
			System.out.println("---------------------------------------");
			System.out.println("You loose the game\nThe Number was: "+randomNumber);
			System.out.println("---------------------------------------\n");
			switchCase();
		}
	}
	public static void main(String[] args)
	{
		System.out.println("		----------------------------------------------			");
		System.out.println("			Welcome to Number Guessing Game				");
		System.out.println("		----------------------------------------------\n"			);
		numberGuess();
	}

}
