 package UsingScanner;

import java.util.Scanner;

public class PalindromeNumberUsingScannner {

	public static void main(String[] args) {

	int x,y,sum=0;
	int temp;
	System.out.println("Enter number to check whether is is Palindrome or not");
	Scanner a= new Scanner(System.in);
	y=a.nextInt();
	temp=y;
		
	while(y>0)
	{
		
		x=y%10;
		sum=(sum*10)+x;
		y=y/10;
		
	}
		
		if(sum==temp)
		{
			
			System.out.println("Numnber is Palindrome");
		
		}
		else
		{
			System.out.println("NUmber is a not Palindrome");
		}
		a.close();
	}
	
	}


