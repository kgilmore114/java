/*
	Chapter 6:	Car
	Programmer: Kyle Gilmore
	Date: 11/5/2018
	Filename:	Car.java
	Purpose:
*/

public class Car
{
//Initializing variables
	public int yearModel;
	public String make;
	private int speed;
	public Boolean iMake = false;
	public Boolean iYear = false;

//Accessor methods to get year, make and speed
	public int getYearModel()
	{
		return yearModel;
	}

	public int getSpeed()
	{
		return speed;
	}

	public String getMake()
	{
		return make;
	}

//Checks for a string input for year and throws a bool to car demo
	public String getInputMake()
	{
		//while loop to repeat asking for make if string is empty
		if (make.isEmpty())
		{
			iMake = false;
		}
		else iMake = true;
		return make;
	}

//Checks for correct input for year and throws a bool to car demo
	public int getInputYear()
	{
		if (yearModel < 1940 || yearModel > 2016)
		{
			iYear = false;
		}
		else iYear = true;
		return yearModel;
	}

//Accelerate and brake method -- Accel adds 5 to speed / Brake subtracts 5 from speed when called
	public void accelerate()
	{
		speed = speed + 5;
	}

	public void brake()
	{
		speed = speed - 5;
	}

// Constructor to accept make and year
	public Car( int yearModelGiven, String makeGiven  )
	{
		yearModel = yearModelGiven;
		make = makeGiven;
		speed = 0;
	}


}