package Java;

import java.util.Scanner;

public class EvenOddUsingWhileLoop
{

	public static void main(String[] args)
	{
		int even=2, odd=1,n=0;
		System.out.println("Enter the target number ");
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		System.out.println("Even Numbers are below");
		while(even<=n)
		{
			
			System.out.println(even);
			even=even+2;
		}
		System.out.println("Odd Numbers are below");

		while(odd<=n)
		{
			System.out.println(odd);
			odd=odd+2;
		}
		sc.close();
	}
}
	
		

