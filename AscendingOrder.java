/*
	Chapter 3 Lab 3
	Kyle Gilmore
	9/17/2018
	AscendingOrder.java
	Orders cities alphabetically
*/

import java.util.Scanner;

public class AscendingOrder
{
	public static void main (String[] args)
	{
		//initializing variables
			int cNum = 1;
	        int tNum = 3;
	        String temp;
	    //create scanner
	        Scanner s = new Scanner(System.in);
	        String cities[] = new String[tNum];
	        Scanner s1 = new Scanner(System.in);
		//header
			System.out.println("       Ascending Order");
			System.out.println();
		//input city loop
	        for(int i = 0; i < tNum; i++)
	        {
				System.out.print("Enter city number " + cNum + " ");
	            cities[i] = s1.nextLine();
	            cNum++;
	            System.out.println();
	        }
	    //sort cities
	        for (int i = 0; i < tNum; i++)
	        {
	            for (int j = i + 1; j < tNum; j++)
	            {
	                if (cities[i].compareTo(cities[j])>0)
	                {
	                    temp = cities[i];
	                    cities[i] = cities[j];
	                    cities[j] = temp;
	                }
	            }
	        }
	        System.out.print("The three cities in alphabetical order are ");
	        for (int i = 0; i < tNum - 1; i++)
	        {
	            System.out.print(cities[i] + ", ");
	        }
        System.out.print(cities[tNum - 1]);
        System.out.println("");
        System.out.println("");
	}
}