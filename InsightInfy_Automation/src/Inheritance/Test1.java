package Inheritance;

public class Test1 {

	public static void main(String[] args) {
			int r,sum=0,n=153,temp;
			temp=n;
			while(n>0)
			{
				r=n%10;
				sum=sum+(r*r*r);
				n=n/10;
				
			}
			
			if(temp==sum)
					{
				System.out.println( sum + " "+ "is Armstrong number");
					}
			else
			{
				System.out.println(sum+ " "+"is not an Armstrong numberr");
			}
	}

}
