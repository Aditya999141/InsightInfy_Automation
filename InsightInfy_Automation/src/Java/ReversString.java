package Java;

public class ReversString
{

	public static void main(String[] args)
	{
		
		String A ="Aditya";
		
		String Rev = " ";
		
		int Len=A.length();
		
		for(int i = Len-1;i>=0;i--)
			
		{
			Rev=Rev+A.charAt(i);
						
		}
		
		System.out.println(Rev);		
		

	}

}
