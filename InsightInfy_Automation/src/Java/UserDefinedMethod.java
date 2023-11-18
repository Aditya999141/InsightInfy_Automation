package Java;

public class UserDefinedMethod {
	
	int a=20;
	public static void cat()
	
	{
	System.out.println(" I am a Cat....!!");
	}
	public static void dog()
	{
		
		System.out.println(" I am a Dog....!!");
	}
	
	public void aMethod()
	
	{ System.out.println(" aMethod");
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		cat();
		dog();	
	UserDefinedMethod chicken = new UserDefinedMethod();
	System.out.println(chicken.a);
	chicken.aMethod();
	}

}
