package Java;

public class Method_Overloading {
	
	int a,b;
	
	void sum()
	{
		a=10;
		b=20;
		System.out.println(a+b);
	}
	
	void sum(int x, int y)
	{
		int a=x;
		int b=y;
		System.out.println(a+b);
	}
	void sum(int a, int b, int c)
	{
		
		System.out.println(a+b+c);
	}
	
	void sum(int a, double b)
	{
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		Method_Overloading mo = new Method_Overloading();
		mo.sum();
		mo.sum(100,200);
		mo.sum(100,200,300);
		mo.sum(100, 105.30);
		
	}

}
