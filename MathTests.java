/*
	Chapter 1 Lab 1
	Kyle Gilmore
	8/29/2018
	MathTests.java
	The purpose is to test integers and real numbers
*/

import java.util.Scanner;

public class MathTests
{
	public static void main(String[] args)
	{
		//Initalizing Variables
		int int1, int2;
		double real1, real2;
		Scanner input = new Scanner(System.in);
		// Display header information
		System.out.println("**************************************");
		System.out.println("* This is my first java program      *");
		System.out.println("**************************************");
		System.out.println(" ");
		System.out.println("**    Integer arithmetic tests    **");
		System.out.println(" ");
		// Display first and second integer requests
		System.out.print("Enter the first integer to test: ");
		int1 = input.nextInt();
		System.out.print("Enter the second integer to test: ");
		int2 = input.nextInt();
		// Display integer mathmatical outputs
		System.out.println(int1 + " + " + int2 + " = " + (int1 + int2));
		System.out.println(int1 + " - " + int2 + " = " + (int1 - int2));
		System.out.println(int1 + " * " + int2 + " = " + (int1 * int2));
		System.out.println(int1 + " / " + int2 + " = " + (int1 / int2));
		System.out.println(int1 + " % " + int2 + " = " + (int1 % int2));
		System.out.println(" ");
		System.out.println("**     Real arithmetic tests      **");
		System.out.println(" ");
		// Real number request and input
		System.out.print("Enter the first real to test: ");
		real1 = input.nextDouble();
		System.out.print("Enter the second real to test: ");
		real2 = input.nextDouble();
		// Display real mathmatical outputs
		System.out.println(real1 + " + " + real2 + " = " + (real1 + real2));
		System.out.println(real1 + " - " + real2 + " = " + (real1 - real2));
		System.out.println(real1 + " * " + real2 + " = " + (real1 * real2));
		System.out.println(real1 + " / " + real2 + " = " + (real1 / real2));
		System.out.println(" ");
	}
}