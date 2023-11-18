package UsingScanner;

import java.util.Scanner;

public class ReversStarPattern1 {

	public static void main(String[] args) 
	
	{

		int x,y,z;
		System.out.println("Enter the number for row");
		Scanner a= new Scanner(System.in);
		int row=a.nextInt();
		
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
