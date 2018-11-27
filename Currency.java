/*
	Chapter : 5
	Programmer: Kyle Gilmore
	Date: 10/15/2018
	Filename:	 Currency.java
	Purpose:	 Converts currencies
*/


import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Currency
{
	public static void main(String[] args)
	{
		//Declarations
		String input;
		Double dollars, euros, pounds, rubles;
		DecimalFormat twoDigits = new DecimalFormat("#,###.00");

		//Prompt and Input
		input = JOptionPane.showInputDialog(null, "Enter your dollar amount: ");
		if (input == null) System.exit(0);
		dollars = Double.parseDouble(input);

		//Calculations
		euros = dollars * .91;
		pounds = dollars * .64;
		rubles = dollars * 61.73;

		//Output
		JOptionPane.showMessageDialog(null, "Your dollar amount of " + twoDigits.format(dollars) + " is equal to " + twoDigits.format(euros) + " euros, " + twoDigits.format(pounds) + " pounds and " + twoDigits.format(rubles) + " rubles.");
	}
}