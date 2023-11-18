package UsingScanner;

import java.util.Scanner;

public class Palindrome_1 {

	public static void main(String[] args) {
		
				
		int r,temp,n;
		int sum=0;
		
		System.out.println("Enter any number to check whether is Palinfdrome or not!");
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
			
		temp=n;
		
		while(n>0)
		{
			r=n%10;//@1 141%10=1 r=1 @2 14%10=4 r=4 @3 4%10=4
			sum=(sum*10)+r;//@1 0*10=0 + r (0+1)=1 sum=1 @2 1*10=10 +r 10+4=14 @3 14*10=140+r 140+1=141
			n=n/10;//@1 141/10=14 n=14 @2 14/10=1 @3 1/10=0
			
		}
		
		if(sum==temp)
		{
			System.out.println(temp +" "+"Entered Number is Palindrome");
		}
		
		else
		{
			System.out.println("Ented Number is not Palindrome");
		}
		
		sc.close();

	}

}
