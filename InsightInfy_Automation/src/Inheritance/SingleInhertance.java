package Inheritance;

import java.util.Scanner;

 	class Armstrong
 	{
 		void armstrong()
 		{
 			int n;
 			int temp;
 			int a,sum=0;
 			Scanner num= new Scanner(System.in);
 			
 			n=num.nextInt();
 			temp=n;
 			
 			while(n>0)
 			{
 				a=n%10;
 				n=n/10;
 				sum= sum+ a*a*a;
 			}
 			
 			if(temp==sum)
 				
 			{
 				System.out.println("Entered number ia an Armstrong number ");
 			}
 			
 		else
 		{
 			System.out.println("Entered number is not an Arstrong number");
 		}
 			num.close();
 	}
 	}
 	
 	class Reverse extends Armstrong
 	{
		void reversenumber()
		{
			int n;
			int a,sum=0;
			Scanner num1= new Scanner(System.in);
			
			n=num1.nextInt();
			
						
			while(n>0)
			{
				a=n%10;
				sum= sum*10+a;
				n=n/10;
				

			}
				
			System.out.println(sum);
									
			}

	}


public class SingleInhertance {

	public static void main(String[] args) {
		
		Reverse r=new Reverse();
		System.out.println("Enter the to print it reverse ( 3 Digit )!");
		r.reversenumber();
			
		System.out.println("------------------------------");
		System.out.println("Enter the numner to check whether it is Armstorng ot not!-----");
		r.armstrong();
		

		
	
				
	}

}
