/*
	Chapter 2 Lab 2
	Kyle Gilmore
	9/9/2018
	CurrencyConverter2.0.java
	Converts input currencies
*/

import java.util.Scanner;

public class CurrencyConverter2.0
{
	public static void main (String[] args)
	{
		//Initialize variable
		double cAmount;
		int aSelect;
		string cOut;
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

	}
}