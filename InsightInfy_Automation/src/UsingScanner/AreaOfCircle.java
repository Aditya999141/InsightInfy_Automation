package UsingScanner;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		double PI=3.14;
		int r;
		Scanner redius = new Scanner(System.in);
		System.out.println("Enter the value of Radius");
		r=redius.nextInt();
		double Area=(PI*r*r);
		System.out.println("Area of Circle is "+ Area);
		redius.close();
	}

}
