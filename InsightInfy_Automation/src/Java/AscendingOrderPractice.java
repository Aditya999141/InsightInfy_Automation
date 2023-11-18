package Java;

public class AscendingOrderPractice
{

	public static void main(String[] args)
	{
		int[] marks = new int[] {90,70,50,60,40,35,80};
		int temp;
		System.out.println("Length of array is :---" + marks.length + "\n" + "Below the Ascending order");
		for(int i =0;i<marks.length;i++)
		{
			for(int j=i;j<marks.length;j++)
			{
				if(marks[i]>marks[j])
				{
					temp=marks[i];
					marks[i]=marks[j];
					marks[j]=temp;
				}
			}
		}
		
		
		for(int a:marks)
		{
			System.out.println(a);
		}
	}

}
