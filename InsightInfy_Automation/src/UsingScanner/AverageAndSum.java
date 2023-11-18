package UsingScanner;

import java.util.Scanner;

public class AverageAndSum {

	public static void main(String[] args) {

		double n1,n2,n3,n4,n5;
		Scanner number = new Scanner(System.in);
		System.out.println("Enter the numbers");
		n1= number.nextDouble();
		n2= number.nextDouble();
		n3= number.nextDouble();
		n4= number.nextDouble();
		n5= number.nextDouble();
		double add=(n1+n2+n3+n4+n5);
		System.out.println("Addition of 5 numbers is " + add  + "\n");
		double Average=((n1+n2+n3+n4+n5)/5);
		System.out.println("Average is "+ Average);
		
		number.close();
		
	}

}
