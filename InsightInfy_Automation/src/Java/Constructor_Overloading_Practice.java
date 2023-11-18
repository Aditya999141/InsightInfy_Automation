package Java;

public class Constructor_Overloading_Practice
{
	int a=0,b=0;
	double c=0.0;
	double temp;
	
	Constructor_Overloading_Practice()
	{
		 a=10;
		 b=20;
		 c=30.49;
		 temp=a+b+c;
		
	}
	
	Constructor_Overloading_Practice(int x, double y)
	
	{
		a=x;
		c=y;
		double sum=x+y;
		System.out.println(sum);
	}
	Constructor_Overloading_Practice(double y, int x)
	{
		c=y*x;
	}
	
	 void method()
	{
		    System.out.println("a= "+a);
			System.out.println("b= "+b);
			System.out.println("c= "+c);
			double temp=a+b+c;
			System.out.println("Sum is "+temp);
	
	}
	public static void main(String[] args)
	{
		System.out.println("Constructor_Overloading ----------");
		Constructor_Overloading_Practice co = new Constructor_Overloading_Practice();
		co.method();
		System.out.println("________________");
		Constructor_Overloading_Practice co1 = new Constructor_Overloading_Practice(100,205.49);
		co1.method();
		System.out.println("________________");
		Constructor_Overloading_Practice co2 = new Constructor_Overloading_Practice(19.29,35);
		co2.method();
		System.out.println("________________");


		
		
	}

}
