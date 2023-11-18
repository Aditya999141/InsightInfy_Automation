
package Java;

import java.util.Scanner;

public class PalindromeNumberPractice
{

	public static void main(String[] args)
	{
		int a,b=0,c,temp=0;
		System.out.println("Enter the number to check whether it Palinfrome or Not!!!!!!");//141
		Scanner sc = new Scanner(System.in);
		c=sc.nextInt();
		temp=c;
		
		while(c>0)
		{
			a=c%10; //1
			b=(b*10)+a;//0*10=0+1
			c=c/10; //	141/10=14	
			
		}
		
		if(temp==b)
		{
			System.out.println("Enterd number is Palindromr");
		}
		else
		{
			System.out.println("Entered number is not Palindrome");
		}
		sc.close();
	}

}
