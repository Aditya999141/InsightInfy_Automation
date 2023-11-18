package Java;

public class Constructor_Overloading {
	
	int a=0;
	int b=0;
	double c=0;
	
	Constructor_Overloading()
	
	{
		a=10;
		b=20;
		c=30.25;
		
	}
	
	Constructor_Overloading(int x, int y, double z)
	{
		a=x;
		b=y;
		c=z;
	}
	Constructor_Overloading(int x,double z)
	{
		a=x;
		c=z;
	}
	Constructor_Overloading(int x, int y)
	
	{
		int temp;
		a=x;
		b=y;
		temp=a+b;
		System.out.println(temp);
		
	}
	
	void method()
	{
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		System.out.println("c= "+c);
		double temp=a+b+c;
		System.out.println("Sum is "+temp);
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("Constructor_Overloading ----------");
		Constructor_Overloading co= new Constructor_Overloading();
		co.method();
		System.out.println("------------");
		Constructor_Overloading co1= new Constructor_Overloading(100,250.50);
		co1.method();
		System.out.println("------------");
		Constructor_Overloading co2= new Constructor_Overloading(200,900,350.45);
		co2.method();
		System.out.println("------------");
		Constructor_Overloading co3= new Constructor_Overloading(300,175);
		co3.method();

		

		


	}

}
