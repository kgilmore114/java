/*
	Chapter 6:	Car
	Programmer: Kyle Gilmore
	Date: 11/5/2018
	Filename:	CarDemo.java
	Purpose:
*/

import java.util.Scanner;

public class CarDemo
{
	public static void main (String [] args)
	{

//Creating scanner
		Scanner input = new Scanner(System.in);

//Creating a car object
		Car demoCar = new Car(1942, "redCar");

		System.out.println("       Demonstration of Car Class");
		System.out.println("");

//input for make
		System.out.print("Enter the make of the car: ");
		demoCar.make = input.nextLine();
		demoCar.getInputMake();

//while loop to ask for make until it gets true bool from inputMake
		while(demoCar.iMake == false)
		{
			System.out.println("\nInput error - Enter a car make: ");
			System.out.print("Enter the make of the car: ");
			demoCar.make = input.nextLine();
			demoCar.getInputMake();
		}

//input for year
		System.out.print("Enter the year of the car: ");
		demoCar.yearModel = input.nextInt();
		demoCar.getInputYear();

//while loop to ask for a year until it gets true bool from inputYear
		while(demoCar.iYear == false)
		{
			System.out.println("\nInput error - Enter a year between 1940 and 2016 ");
			System.out.print("Enter the year of the car: ");
			demoCar.yearModel = input.nextInt();
			demoCar.getInputYear();
		}


//displays make, model, year
		System.out.println();
		System.out.println("demoCar");
		System.out.println("Model Year: " + demoCar.getYearModel());
		System.out.println("Make: " + demoCar.make);
		System.out.println("Speed: "+ demoCar.getSpeed());
		System.out.println();

		System.out.println("Speed UP!");
		System.out.println("");

//for loop to call accelerate and print speed
		for( int i = 1; i <= 5; i++ )
		{
			demoCar.accelerate();
			System.out.print("");
			System.out.println( "DemoCar's Speed: " + demoCar.getSpeed());
		}

		System.out.println("");
		System.out.println("Slow down!");
		System.out.println("");

//for loop to call brake and print speed
		for( int i = 1; i <= 5; i++ )
		{
			demoCar.brake();
			System.out.print("");
			System.out.println( "DemoCar's Speed: " + demoCar.getSpeed());
		}

		System.out.println("");
		System.out.println("End of the road for Car Class demonstration.");
	}
}