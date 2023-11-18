package Java;

public class EvenAndOddPracticeUsingArray
{

	public static void main(String[] args)
	{
		int [] numbers = new int [] {2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		
		System.out.println("Odd numbers are below");
		for( int i =0;i<numbers.length;i++)
		{
			if(numbers[i]%2!=0)
			{
				System.out.println(numbers[i]);
			}
		}
		System.out.println("Even numbers are below");
		for( int i =0;i<numbers.length;i++)
		{
			if(numbers[i]%2==0)
			{
				System.out.println(numbers[i]);
			}
		}
	}

}


