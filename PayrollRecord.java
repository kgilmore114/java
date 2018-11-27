/*
	Chapter 3 Lab 3
	Kyle Gilmore
	9/17/2018
	PayrollRecord.java
	Calculates Payroll
*/

import java.util.Scanner;

public class PayrollRecord
{
	public static void main (String[] args)
	{
		//Initialize Variables
		String eName;
		double eHours;
		double payRate;
		double fTax;
		double sTax;
		//Create Scanner
		Scanner input = new Scanner(System.in);
		//Display requests and handle input
		System.out.println("         Payroll Record");
		System.out.println("");
		System.out.print("Enter employee's name: ");
		eName = input.nextLine();
		System.out.print("Enter hours worked in a week: ");
		eHours = input.nextDouble();
		System.out.print("Enter pay rate: ");
		payRate = input.nextDouble();
		System.out.print("Enter Federal tax witholding rate: ");
		fTax = input.nextDouble();
		System.out.print("Enter State tax withholding rate: ");
		sTax = input.nextDouble();
		System.out.println("");
		System.out.println("Employee Name: " + eName);
		System.out.println("Hours Worked: " + eHours);
		System.out.println("Pay Rate: $" + payRate);
				//Calculation variables
				double gPay = eHours * payRate;
				double fHold = fTax * gPay;
				double sHold = sTax * gPay;
				double tDeduct = fHold + sHold;
		//Print final results
		System.out.println("Gross Pay: $" + (gPay));
		System.out.println("Deductions: ");
		System.out.println("   Federal Witholding " + fTax + "%: " + fHold);
		System.out.println("   State Witholding " + sTax + "%: " + sHold);
		System.out.println("   Total Deduction: $" + tDeduct);
		System.out.println("Net Pay: $" + (gPay - tDeduct));
		System.out.println("");
	}
}