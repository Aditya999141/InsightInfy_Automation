
package Java;

public class AscendingOrder {

	public static void main(String[] args) {
		int[] marksarray = new int[] {20,15,30,10,60,50,25,70,45};
							   // @1 {15,20,30,10,60,50,25,70,45}	
		 					  // @2 {15,20,30,10,60,50,25,70,45} data will be same as condition is false.
							// @3 {15,20,30,10,60,50,25,70,45} data will be same as condition is false.	
							// @4 {10,20,30,15,60,50,25,70,45} data will be change as condition is true.		
		int temp;		
		System.out.println("Length of Array is "+ marksarray.length + "\n" + "Below Ascending orders" );
		for( int i=0;i<marksarray.length;i++) // i 1
		{
			for(int j=i;j<marksarray.length;j++)
			{
				if(marksarray[i]>marksarray[j]) // array i =0 array j=1 (20>15?) and so on no
				{					
					temp=marksarray[i]; //@1 temp = 20
					marksarray[i]=marksarray[j];//@1 15 will be stored in 0th position of i
					//@1 here we are shifting numbers , j  values is 1 (15) into i.
					//@1 i value is 0 ( at 0th position 15 will be store
					marksarray[j]=temp;//@1 20 will be store in at 1th position.
					// control goes to inner loop again, now value of j is 1
					
				}
										
						
			}
		}
		
		for ( int a: marksarray)
		{
			
		System.out.println(a);
		
		}
		
	}
	}
		
