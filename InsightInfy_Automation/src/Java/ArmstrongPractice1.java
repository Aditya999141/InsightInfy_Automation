package Java;

import java.util.Scanner;

public class ArmstrongPractice1
{
	public static void main(String[] args)
	{
		int a,b,c=0,temp;
		System.out.println("Enter the number to check whether it Armstonr or Not!!!!!!!! ( 4 Digit )");
		Scanner sc = new Scanner(System.in);
		b=sc.nextInt();
		temp=b;
		
		while(b>0)
		{
			a=b%10;
			b=b/10;
			c=c+(a*a*a*a);
		}
		
		if(temp==c)
		{
			System.out.println("Entered number is Armstron:---"+ c);
		}
		else 
		{
			System.out.println("Entered number is not Armstron:---"+ c);

		}
		sc.close();
	}

}
