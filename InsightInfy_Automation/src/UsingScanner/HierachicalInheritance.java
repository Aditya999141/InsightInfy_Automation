package UsingScanner;

class SuperClass

{
	void superclass()
	{
	
	String strg1="Myself Aditya Bandgar,I born and brought up in Latur.";
	{
		System.out.println(strg1);
		
	}
	
	}
}

class Subclass1 extends SuperClass
{
	void subclass1()
	{
		String strg2="Currently I am living in Pune.";
		System.out.println(strg2);
	}
}

class Subclass2 extends SuperClass
{
	void subclass2()
	{
		String strg3="I have completed my graduation from COCSIT college Latur";
		System.out.println(strg3);
	}
}
public class HierachicalInheritance {

	public static void main(String[] args) {
		
		Subclass1 sp= new Subclass1();
		sp.superclass();
		sp.subclass1();
		System.out.println("-------------------------------");
		Subclass2 sb= new Subclass2();
		sb.superclass();
		sb.subclass2();
		
		
		
		
				
		

	}

}
