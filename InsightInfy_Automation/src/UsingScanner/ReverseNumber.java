package UsingScanner;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
		int num,a,sum=0;
		
		System.out.println("Enter any digit");
		Scanner Scn= new Scanner(System.in);
		num= Scn.nextInt();
		
		while(num>0)
		
		{
			a=num%10;
			sum=sum*10+a;
			num=num/10;
				
			
		}
		
		System.out.println("Reverse NUmber is "+ sum);
			
		Scn.close();

	}

}
