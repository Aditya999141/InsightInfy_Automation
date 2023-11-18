package UsingScanner;

import java.util.Scanner;

public class EvenOddUsingScanner {

	public static void main(String[] args) {
		
		int num;
		System.out.println("Enter a number to check whether it is Even or Odd");
		Scanner x= new Scanner(System.in);
		num=x.nextInt();
		
		if(num%10==0)
		
		{
			System.out.println("Entered number is Even");
		}
		else
		
		{
			System.out.println("Entered number is Odd");
		}
		x.close();
	}
	}

