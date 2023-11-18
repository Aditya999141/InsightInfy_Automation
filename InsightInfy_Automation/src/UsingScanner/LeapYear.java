package UsingScanner;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		
		int year;

		Scanner y = new Scanner(System.in);
		System.out.println("Please enter the number to check whether is Leap year or not?");

		year=y.nextInt();
		
		if(year%4==0)
		{
			System.out.println("Entered Year is Leap Year");
		}
		
		else
		{
			System.out.println("Enterd YEar in not leap year");
		}
		y.close();
	}

}
