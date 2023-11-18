package Java;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x, temp,y=1630;
		int z=0; // Taking one number to check whether it Armstrong number or not//
		temp=y;     // Assign a value of z into temp//
		
		while(z>0)
		{
			
		x=y%10; // in x 4 value will be store//
		y=y/10; // in y 163 value will be store//
		z=z+(x*x*x*x); // Y= 0+4*4*4=64, 256 value will be store in y//
			
		}
		if(temp==y) // if temp=y ( 1634=1634 )//
			
		{
		 System.out.println("Number is Armstrong Number");
		 
	
		   
		}
		
		 
		// 1 Iteration, 
		// while z>0.(1634>0) Condition is true, will execute while loop body.
		// x=z%10; (x=1634%10) in x 4 value will be store in x.
		// z=z/10; // (z=1634/10) in z 163 value will be store.
		//y=y+(x*x*x*x); // (y=0+4*4*4*4) Y= 0+4*4*4=64, 256 value will be store in y
	
		// 2 Iteration, 
		// while z>0.(163>0) Condition is true, will execute while loop body.
		// x=z%10; (x=163%10) in x 3 value will be store in x.
		// z=z/10; // (z=163/10) in z 16 value will be store.
		//y=y+(x*x*x*x); // (y=256+3*3*3*3) Y= 256+3*3*3*3=64, 337 value will be store in y
	
		// 3 Iteration, 
		// while z>0.(16>0) Condition is true, will execute while loop body.
		// x=z%10; (x=16%10) in x 6 value will be store in x.
		// z=z/10; // (z=16/10) in z 1 value will be store.
		//y=y+(x*x*x*x); // (y=337+6*6*6*6) Y= 337+1*1*1*1=337, 1633 value will be store in y
		
		// 4 Iteration, 
		// while z>0.(1>0) Condition is true, will execute while loop body.
		// x=z%10; (x=6%10) in x 6 value will be store in x.
		// z=z/10; // (z=6/10) in z 0 value will be store.
		//y=y+(x*x*x*x); // (y=337+0*0*0*0) Y= 337+0*0*0*0=337, 337 value will be store in y
		
		// 5 Iteration, 
				// while z>0.(0>0) Condition is false, will jump in else body.
				// x=z%10; (x=6%10) in x 6 value will be store in x.
				// z=z/10; // (z=6/10) in z 0 value will be store.
		
		
		else
		{
			 System.out.println("Numnber is not Armstrong Number");
		}
	}

}
