package Java;

public class ArrayAscending1
{

	public static void main(String[] args)
	{
		int [] marks = new int [] {90,80,30,15,75,60,58,19};
		int temp;
		
		for( int i=0;i<marks.length;i++)
		{
			for( int j=i;j>marks.length;j++)
			{
				if(marks[i]>marks[j])
					
				{
					temp=marks[i];
					marks[i]=marks[j];
					marks[j]=temp;
					
				}
			}
		}
		
		for( int a:marks)
		{
			System.out.println(a);
		}
	}

}
