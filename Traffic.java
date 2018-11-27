/*
	Chapter 6:	Traffic Ticket
	Programmer: Kyle Gilmore
	Date: 10/22/2018
	Filename:	Trafic.java
	Purpose:	This program calculates a traffic ticket and court costs.
*/

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Traffic
{
	public static void main(String[] args)
	{
		//declare class variables
		double fine, courtCosts, ticket;
		int speedLimit, offenderSpeed, previousTickets, overLimit;
		DecimalFormat twoDigits = new DecimalFormat("#,###.00");
		System.out.println("       *****Ticket Calculator*****");


		//call methods

				speedLimit = getLimit();
				offenderSpeed = getDriverSpeed();
				if (offenderSpeed <= speedLimit)
				{
					JOptionPane.showMessageDialog(null,"No violation", "Traffic Ticket",JOptionPane.INFORMATION_MESSAGE);

					finish();
				}


				previousTickets = getTickets();
				overLimit = offenderSpeed - speedLimit;
				fine = overLimit * 20.00;
				courtCosts = getCosts(previousTickets);
				ticket = fine + courtCosts;
				output(fine, courtCosts, ticket);
				finish();
			}




	//The getLimit() method asks the user to input a the speed limit.
	public static int getLimit()
	{
		//declare method variables
		int limit = 0;
		String answer;
		do
		{
			answer = JOptionPane.showInputDialog(null, "Enter the speed limit: ", JOptionPane.QUESTION_MESSAGE);
			limit = Integer.parseInt(answer);
			if(answer == null)
				{
					finish();
				}
		}while(limit <= 0);

		return limit;
	}

	//The getDriverSpeed() method asks the user to input the offender's speed.
		public static int getDriverSpeed()
		{
			//declare method variables
			int speed = 0;
			String answer;

			answer = JOptionPane.showInputDialog(null, "Enter the offender's speed: ", JOptionPane.QUESTION_MESSAGE);
			speed = Integer.parseInt(answer);
			if(answer == null)
				{
					finish();
				}


			return speed;
	}

	//The getTickets() method retrieves number of tickets.
	public static int getTickets()
	{
			//declare method variables
			int tickets = 0;
			String answer;

			answer = JOptionPane.showInputDialog(null, "Enter the number of previous tickets: ", JOptionPane.QUESTION_MESSAGE);
			tickets = Integer.parseInt(answer);
			if(answer == null)
				{
					finish();
				}
			return tickets;
	}

	//The getCosts() method returns the court costs.
	public static double getCosts(int tickets)
	{
		double costs = 0.0;
		if(tickets <= 1)
		{
			costs = 74.80;
		}
		else if (tickets <= 2)
			{
				costs = 99.80;
			}
			else if (tickets > 3)
				{
					costs = 124.80;
				}


		return costs;
	}

	//The output() method displays the cost of the ticket.
	public static void output(double dFine, double dCost, double dTicket)
	{
        JOptionPane.showMessageDialog(null, "Your fine of $" + dFine + " plus your court costs of $" + dCost + " is $" + dTicket);


	}

	//The finish() method ends the program.
	public static void finish()
	{
		System.exit(0);
	}
}