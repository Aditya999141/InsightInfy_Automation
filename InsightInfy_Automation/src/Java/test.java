package Java;

public class test {
	

	public static void main(String[] args) {
		test m1= new test();
		m1.sum();
		m1.sum(100, 200);
				
		
	}
	public void sum()
	
	{
		int a=10, b=20, c;
		c=a*b;
		System.out.println(c);
		
	}
	
	public void sum(int a, int b)
	{
		int c=a+b;
		System.out.println(c);
		
	}
}
	
	
	/*public static int sum( int x, int y)
	{
		
		return x*y;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Java Program");
		int a=30, b=20;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(test.sum(100, 300));
		
		
		
		

	}

}*/
