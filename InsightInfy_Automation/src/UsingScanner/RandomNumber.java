package UsingScanner;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
 
		Random rand = new Random();
		int n1=rand.nextInt();
		int n2=rand.nextInt();
		int n3=rand.nextInt();
		int n4=rand.nextInt();
		
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);
		
		System.out.println("-----------------------------");	
		
		double r1=rand.nextDouble();
		double r2=rand.nextDouble();
		
		System.out.println(r1);
		System.out.println(r2);
		
		
	}

}
