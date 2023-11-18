package Inheritance;

import java.util.Scanner;
	class Armstorng
	{
		void armstorng()
		{
			int n;
			int temp;
			int a,sum=0;
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
	
	class ReverseStarPattern extends Armstorng
	{
		void reversestarpattern()
		{
		
			int x,y,z,row;
			Scanner a= new Scanner(System.in);
			row=a.nextInt();
			
						
			for (x=row;x>=1;x--)
			{
				for (z=1;z<=x;z++)
				{
					System.out.print(" ");
				}
				for (y=row;y>=x;y--)
				{
					System.out.print("*");
				}
				
				System.out.println();
			}
			
		}

	}
class Palindrome extends ReverseStarPattern
{
	void palindrome()
	{
		int a,b,temp,sum=0;
		Scanner n =new Scanner(System.in);
		a=n.nextInt();
		temp=a;
		
		while(a>0)
			
		{
		
			b=a%10;
			sum=(sum*10)+b;
			a=a/10;		
	    }
		
		if(sum==temp)
		{
			
			System.out.println("Numnber is Palindrome");
		
		}
		else
		{
			System.out.println("NUmber is a not Palindrome");
		}
		n.close();
	}
}
	
public class MultilevelInheritance {

	public static void main(String[] args) {
		
		ReverseStarPattern r = new ReverseStarPattern();
		System.out.println("Enter Number to check its armstrong or not(4 digit)");
		r.armstorng();
		System.out.println("------------------------");

		Palindrome p = new Palindrome();
		System.out.println("Enter the number for row and column");
		p.reversestarpattern();
		System.out.println("------------------------");
		System.out.println("Enter Number to check whether is is Palimdrome or not");
		p.palindrome();
		
				
	}

}
