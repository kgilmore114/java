/*
	Chapter 2 Lab 2
	Kyle Gilmore
	9/9/2018
	ShippingCalculator.java
	Calculates the cost of shipping goods
*/
import java.util.Scanner;

public class ShippingCalculator
{
	public static void main (String[] args)
	{
	//Initalizing Variables
		double sWeight;
		double sCost;
	//Creating Scanner object
		Scanner input =  new Scanner(System.in);
	//First input
		System.out.print("Enter package weight: ");
		sWeight = input.nextDouble ();
			if(sWeight >= 20)
			{
				System.out.println("This package cannot be shipped");
			}
			else
				if(sWeight >= 11)
				{
					System.out.println("The shipping cost is $10.50");
				}
				else
					if (sWeight >=4)
					{
						System.out.println("The shipping cost is $8.50");
					}
					else
						if (sWeight > 1)
						{
							System.out.println("The shipping cost is $5.50");
						}
						else
							if (sWeight > 0)
							{
								System.out.println("The shipping cost is $3.50");
							}
	}
}