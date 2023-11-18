package Java;

public class Test1 
{

	public static void main(String[] args) 
	{
				int a[]= {1,2,3,4,5,6,7,8,9,10};
				//int len=a.length;
				System.out.println("Lenght of Array is "+ a.length);
				System.out.println("Even numbers are-----");
				for(int i=0;i<a.length;i++)
				{
					if(a[i]%2==0)
					{
						System.out.println(a[i]);
					}
				}
				System.out.println("Odd numbers are-----");

				for(int i=0;i<a.length;i++)
		        {
		        	if(a[i]%2!=0)
		        	{
		        		System.out.println(a[i]);
		        	}
		        }
		        	
		        
		        
	}
}

	
				
		



