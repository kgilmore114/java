/*
	Chapter 6:	Temp Converter
	Programmer: Kyle Gilmore
	Date: 10/22/2018
	Filename:	TempConverter.java
	Purpose:	Converts temperatures.
*/
import java.util.Scanner;

public class TempConverter
{
	public static void main(String[] args)
	{
		//Initalizing Variables
		int totalCon;
		int fahrOrCels;
		int cNum = 1;
		double celsius;
		double fahrenheit;
		Scanner input = new Scanner(System.in);
		//Header

	        System.out.println("         Temparature Converter");
	        System.out.println("--------------------------------------------------");
	        System.out.println();

		//do while loop asking for an input within 3 and 6
		do
			{
				System.out.println("How many conversions would you like to make: ");
				System.out.print("Enter a number between 3 and 6: ");
				totalCon = input.nextInt();
			}
			while(totalCon <= 2 || totalCon >= 7);

			System.out.println();
			System.out.println();
		//for loop to print and request conversions
		for (int i = 0; i < totalCon; i++)
			{
				System.out.println("Conversion # " + cNum);
				cNum++;
				System.out.println();
		//requests 1 or 2 input
				do
					{
						System.out.println("To convert from celsius to fahrenheit type 1");
						System.out.print("To convert from fahrenheit to celsius type 2: ");
						fahrOrCels = input.nextInt();
		//if input 1 ask cels temp, else 2 ask fahr temp
						if (fahrOrCels == 1)
							{
								System.out.println();
								System.out.print("Enter a celsius temperature: ");
								celsius = input.nextInt();
								double cels = celsiusToFahrenheit(celsius);
								System.out.println("The celsius temperature of " + celsius + " degrees is equal to " + cels + " degrees fahrenheit.");
								System.out.println();
							}else if (fahrOrCels == 2)
								{
									System.out.println();
									System.out.print("Enter a fahrenheit temperature: ");
									fahrenheit = input.nextInt();
									double fahr = fahrenheitToCelsius(fahrenheit);
									System.out.println("The fahrenheit temperature of " + fahrenheit + " degrees is equal to " + fahr + " degrees celsius.");
									System.out.println();
								}
					}
					while(fahrOrCels <= 0 || fahrOrCels >= 3);
			}
	}
	public static double celsiusToFahrenheit(double cels)
		{
			double fahrenheit = 9 * (cels / 5) + 32;
			return fahrenheit;
		}
	public static double fahrenheitToCelsius(double fahr)
		{
			double celsius = (fahr - 32) * 5 / 9;
			return celsius;
		}
}