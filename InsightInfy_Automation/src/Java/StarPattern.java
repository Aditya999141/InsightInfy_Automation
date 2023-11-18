package Java;

import java.util.Scanner;

public class StarPattern {

	public static void main(String[] args)
	{
		
		int x,y;
		
		Scanner num= new Scanner(System.in);
		System.out.println("Enter the number for star ( How Much Coloumn & Rows you want) ");
		int row=num.nextInt();		
		
		for(x=1;x<=row;x++) // Outer loop for rows
			
		{
			for(y=1;y<=x;y++) // inner loop for column
			{
				System.out.print("* ");
			}	
		
		System.out.println();
		
	    }
	}
	
    }


/*  1St Iteration 
 * Outer loop for(x=1;x<=row;x++)/ x=1;1<=10 true, x++ new value of x is 2
 * Enter in inner loop
 * for(y=1;y<=x;y++ / y=1;1<=1; true, y++ new value of y is 2
 * will print *
 * for(y=2;y<=x;y++ / y=2;2<=1; false,
 * System.out.println(); jump on new line
 *  
 *  2nd Iteration
 *  
 * Outer loop for(x=2;x<=row;x++)/ x=2;2<=10 true, x++ new value of x is 3
 * Enter in inner loop
 * for(y=1;y<=x;y++ / y=1;1<=2; true, y++ new value of y is 2
 * will print *
 * for(y=2;y<=x;y++ / y=2;2<=2; true, y++ new value of y is 3
 * will print *
 * for(y=3;y<=x;y++ / y=3;3<=2; False,
 * System.out.println(); jump on new line
 * 
 * 
 * 3rd Iteration *
 *   
 * Outer loop for(x=3;x<=row;x++)/ x=3;3<=10 true x++ new value of x is 4
 * Enter in inner loop
 * for(y=1;y<=x;y++ / y=1;1<=3; true, y++ new value of y is 2
 * will print *
 * for(y=2;y<=x;y++ / y=2;2<=2; true, y++ new value of y is 3
 * will print *
 * for(y=3;y<=x;y++ / y=3;3<=3; true, y++ new value of y is 4
 * will print *
 * for(y=4;y<=x;y++ / y=4;4<=3; false,
 * System.out.println(); jump on new line
 * and so on till x=entered number;x<=entered number;x++
 */
 
 