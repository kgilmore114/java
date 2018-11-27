/*
	Chapter 3 Lab 3
	Kyle Gilmore
	9/17/2018
	AcendingOrder.java
	Orders cities alphabetically
*/

import java.util.Scanner;

public class Sort
{
	public static void main (String[] args)
	{
			int cNum = 1;
	        int n = 3;
	        String temp;
	        Scanner s = new Scanner(System.in);
	        String cities[] = new String[n];
	        Scanner s1 = new Scanner(System.in);

	        for(int i = 0; i < n; i++)
	        {
				System.out.print("Enter city number " + cNum + " ");
	            cities[i] = s1.nextLine();
	            cNum++;
	            System.out.println();
	        }
	        for (int i = 0; i < n; i++)
	        {
	            for (int j = i + 1; j < n; j++)
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
	        for (int i = 0; i < n - 1; i++)
	        {
	            System.out.print(cities[i] + ", ");
	        }
        System.out.print(cities[n - 1]);
        System.out.println("");
        System.out.println("");
	}
}