/*
	Chapter 2 Lab 2
	Kyle Gilmore
	9/9/2018
	CurrencyConverter.java
	Converts input currencies
*/

import java.util.Scanner;

public class CurrencyConverter
{
	public static void main (String[] args)
	{
		//Initialize variable
		double cAmount;
		int aSelect;
		String cOut = "Please only enter between 1 and 3";
		//Create scanner
		Scanner input = new Scanner(System.in);
		//Input
		System.out.print("Enter the dollar amount: ");
		cAmount = input.nextDouble();
		System.out.println(" ");
		System.out.println("Enter 1 to convert to Euros");
		System.out.println("Enter 2 to convert to Pounds");
		System.out.println("Enter 3 to convert to Rubles");
		System.out.println(" ");
		System.out.print("Enter your conversion choice: ");
		aSelect = input.nextInt();
		switch(aSelect)
			{
				case 1: cOut = "The dollar amount of $" + cAmount + " is equal to " + cAmount * .81 + " Euros.";
				break;
				case 2: cOut = "The dollar amount of $" + cAmount + " is equal to " + cAmount * .77 + " Pounds.";
				break;
				case 3: cOut = "The dollar amount of $" + cAmount + " is equal to " + cAmount * 70.54 + " Rubles.";
				break;
			}
		System.out.println(" ");
		System.out.println(cOut);
	}
}