/*
	Chapter : 11
	Programmer:  Kyle Gilmore
	Date:	11/26/2018
	Filename:	 TravelCommission.java
	Purpose:	Calculate Commission
*/

import javax.swing.JOptionPane;
import java.text.DecimalFormat;
import java.util.*;

public class TravelCommission
{
			public static void main(String[] args)
			{
				// declare and construct variables
				double dollars, answer;
				int empCode;

				dollars = getSales();
				empCode = getCode();
				answer = getComm(dollars,empCode);
				output(dollars,answer);
				finish();
			}
			//End main

			public static double getSales()
			{
				double myDollars = 0;
				boolean done = false;
				String answer;

				while(!done)
				{
					try
					{
						answer = JOptionPane.showInputDialog(null, "Enter the sales amount \n(do not use commas or dollar signs \nor click Cancel to exit):");
						if (answer == null) System.exit(0);

						myDollars = Integer.parseInt(answer);
						if(myDollars <= 0) throw new InputMismatchException();
						done = true;
					}
					catch(InputMismatchException e)
					{
						JOptionPane.showMessageDialog(null, "Error enter a number greater than 0");
					}
				}
 				return myDollars;
			}
			//End getSales

			public static int getCode()
			{
				String answer;
				int myCode = 0;
				boolean done = false;

				while(!done)
				{
					try
					{
						answer = JOptionPane.showInputDialog(null, "Enter the commission code: \n\n1) Telephone sales \n2) In-Store sales \n3) Outside sales");
						if (answer == null) System.exit(0);

						myCode = Integer.parseInt(answer);
						if(myCode <= 0 || myCode > 3) throw new InputMismatchException();
						done = true;
					}
					catch(InputMismatchException e)
					{
						JOptionPane.showMessageDialog(null, "Please enter a 1, 2 or 3.");
					}
				}
				return myCode;
			}
			//End getCode

			public static double getComm(double myDollars, int myEmpCode)
			{
				double myAnswer = 0;
				if(myEmpCode == 1)
				{
					myAnswer = myDollars * 0.10;
				}
				else if (myEmpCode == 2)
					{
						myAnswer = myDollars * 0.14;
					}
					else
						{
							myAnswer = myDollars * 0.18;
						}
				return myAnswer;
			}
			//End getComm

			public static void output(double myDollars, double myAnswer)
			{
				DecimalFormat twoDigits = new DecimalFormat("$#,###.00");
				JOptionPane.showMessageDialog(null, "Your commission sales of " + twoDigits.format(myDollars) + " is " + twoDigits.format(myAnswer));
			}

			public static void finish()
			{
				System.exit(0);
			}
}