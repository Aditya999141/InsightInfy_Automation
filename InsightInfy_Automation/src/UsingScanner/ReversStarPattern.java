package UsingScanner;

import java.util.Scanner;

public class ReversStarPattern
{

	public static void main(String[] args) 
	{
		int x,y, row;
		Scanner z=new Scanner(System.in);
		System.out.println("Enter the number for star ( How Much Coloumn & Rows you want) ");
		
		row=z.nextInt();
		
		for(x=row;x>=0;x--)
		{
					
		
			for(y=1;y<=x;y++)
			
			{
				System.out.print("*");
						
			}
			
			System.out.println();
			
		}
	}

}
