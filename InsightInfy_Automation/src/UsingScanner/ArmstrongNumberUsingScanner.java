package UsingScanner;

import java.util.Scanner;
public class ArmstrongNumberUsingScanner {

	public static void main(String[] args) {
				
		int n;
		int temp;
		int a,sum=0;
		System.out.println("Enter the number to check whether is an Amrstrong or not (4 dgit ) ");
		Scanner num= new Scanner(System.in);
		n=num.nextInt();
		temp=n;
		
		while(n>0)
		{
			a=n%10;
			n=n/10;
			sum= sum+ a*a*a*a;
		}
		
		if(temp==sum)
			
		{
			System.out.println("Entered number ia an Armstrong number ");
		}
	
	else
	{
		System.out.println("Entered number is not an Arstrong number");
	}
		num.close();
}
}