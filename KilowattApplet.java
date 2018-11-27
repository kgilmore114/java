/*
	Chapter :  5
	Programmer: Kyle Gilmore
	Date: 10/15/2018
	Filename:	 KilowattApplet.java
	Purpose:	 Create an Applet that will calculate the monthly cost of using an appliance.
*/

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class KilowattApplet extends Applet implements ActionListener
{
	//Declare variables
	Double costPerKilowatt, kilowattHours;
	DecimalFormat twoDigits = new DecimalFormat("#,###.00");

	//Print prompts and receive input
	Label welcome = new Label ("Welcome to the Appliance Energy Calculator");
	Label costLabel = new Label ("Please enter the cost per kilowatt-hour: ");
	TextField costField = new TextField(10);
	Label kHourLabel = new Label ("Please enter the Kilowatt-hours consumed: ");
	TextField kHourField = new TextField(10);
	Button calcButton = new Button("Calculate");
	Label outputLabel = new Label("Click the Calculate button to see the monthly energy cost.");

	public void init()
	{
		setForeground(Color.red);
		setBackground(Color.yellow);
		add(welcome);
		add(costLabel);
		add(costField);
		add(kHourLabel);
		add(kHourField);
		add(calcButton);
		calcButton.addActionListener(this);
		add(outputLabel);
	}

	public void actionPerformed(ActionEvent e)
	{
		costPerKilowatt = Double.parseDouble(costField.getText());
		kilowattHours = Double.parseDouble(kHourField.getText());
		outputLabel.setText("The monthly cost is $" + twoDigits.format(costPerKilowatt * kilowattHours) );
	}
}
