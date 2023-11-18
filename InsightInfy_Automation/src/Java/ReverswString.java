package Java;

public class ReverswString {

	public static void main(String[] args) {
		String Name="Aditya";
		String Rev=" ";
		int len=Name.length();
		System.out.println("Length of string is "+ len +"\n");
		
		for(int i=len-1;i>=0;i--)
		{
			Rev=Rev+Name.charAt(i);
		}
		
		System.out.println("Original String is "+Name +"\n");
		System.out.println("Reverse of Original String is "+Rev +"\n");

	}

}
