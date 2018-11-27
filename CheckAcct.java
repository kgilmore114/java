/*
	Chapter 10:	Account program
	Programmer: Kyle Gilmore
	Date:	11/12/2018
	Filename:	CheckAcct.java
	Purpose: to create, instantiate and calculate account variables
*/

public class CheckAcct
{
	//Private data fields
    private int id;
    private double balance;
    private static double annualInterestRate;
    private java.util.Date dateCreated;
	//stores date
    public CheckAcct()
    {
        dateCreated = new java.util.Date();
    }
	//Constructor for id and balance
    public CheckAcct(int id, double balance)
    {
        this();
        this.id = id;
        this.balance = balance;
    }
	//Accessor methods
    public int getId()
    {
        return this.id;
    }

    public double getBalance()
    {
        return this.balance;
    }

    public static double getAnnualInterestRate()
	{
		return annualInterestRate;
    }
	//Mutator for annualInterestRate
    public void setAnnualInterestRate(double annualInterestRate)
    {
        this.annualInterestRate = annualInterestRate;
    }
	//Accessor for dateCreated
    public String getDateCreated()
	{
	    return this.dateCreated.toString();
	}
	//Converts annual to monthly interest
    public double CalcMonthlyInterest()
    {
        return (annualInterestRate / 100) / 12 ;
    }
	//calculates monthly interest
    public double getMonthlyInterest()
    {
        return balance * CalcMonthlyInterest();
    }
	//subtracts withdraws from account
    public void withdraw(double amount)
    {
        this.balance -= amount;
    }
	//adds deposits to account
    public void deposit(double amount)
    {
        this.balance += amount;
    }
}