package Java;

public class StaticExample {
	
	static int a=100;
	int b=200;
	
	void NonStaticMethod()
	{
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(a+b);
	}
	
	static void staticmethod()
	
	{
		a=1000;
		System.out.println(a);

	}
	

	public static void main(String[] args) {
		
		staticmethod();
		StaticExample nonstc = new StaticExample();
		nonstc.NonStaticMethod();

	}

}
