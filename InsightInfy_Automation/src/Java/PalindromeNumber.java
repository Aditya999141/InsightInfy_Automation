package Java;

public class PalindromeNumber {

	public static void main(String[] args) {
    int x, sum=0, temp;
    int y=413;
    temp=y; // In temp veriable we have saved 919//
    
     while(y>0)//@1 414>0 true,@2 41>0 true, @3 4>0 true
    
    {
    	
    	x=y%10;// @1 414%10=4 @2 41%10=1, @3 4%10=4
    	sum=(sum*10)+x;//@1 0*10=0+4=4 @2 4*10+1=41,@3 41*10+4=414
    	y=y/10;//@1 141/10=41,@2 41/10=4 @3 4/10=0+
    	
    }
    
    if(temp==sum)
    	
    { 
    	System.out.println(" It is a palindrome Number");
    }
    
    else
    
    {
    	System.out.println(" It is not a palindrome Number");
    }
    
    
    	
    }
    
	}


