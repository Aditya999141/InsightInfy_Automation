package UsingScanner;

import java.util.Scanner;

public class FloydsTriangle {

	public static void main(String[] args) {
			int n,i,j,k=1;
			
			System.out.println("Enter the number for Rows");
			Scanner row = new Scanner(System.in);
			n=row.nextInt();
			
			for(i=0;i<=n;i++)
			{
				for(j=0;j<i;j++)
				{
					System.out.print(k+" ");
					k++;
				}
				
				System.out.println();
			}
			
	}

}
