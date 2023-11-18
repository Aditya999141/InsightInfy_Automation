package UsingScanner;
import java.util.Scanner;

public class MaximumNumber {

	public static void main(String[] args) {
		int N1,N2,N3;
		System.out.println(" Enter three numbers");
		Scanner scan = new Scanner(System.in);
		N1=scan.nextInt();
		N2=scan.nextInt();
		N3=scan.nextInt();
		
		if(N1>N2 && N1>N3)
		{
			System.out.println("Number "+N1+ " is greater");
		}
		else if(N2>N1 && N2>N3)

		{
			System.out.println("Number "+N2+ " is greater");
		}
		
		else
			
		{
			System.out.println("Number "+N3+ " is greater");
		}
		scan.close();
	}

}
