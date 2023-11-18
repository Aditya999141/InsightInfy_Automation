package UsingScanner;

import java.util.Scanner;

public class SwappingUsingScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner num= new Scanner(System.in);
		System.out.println("Enter the value for a");
		int a=num.nextInt();
		System.out.println("Value of a before swapping "+ a);
		System.out.println("Enter the value for b");
		int b=num.nextInt();
		System.out.println("Value of b before swapping "+ b);
		System.out.println();
		a=a+b;
		b=a-b;
		a=a-b;
		num.close();
		System.out.println("Value of a after swapping "+ a);
		System.out.println("Value of b after swapping "+ b);
		}
		
	}
	


