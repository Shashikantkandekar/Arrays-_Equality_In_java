import java.util.Arrays;
public class Equals
{
	public static void main(String[] args)
	{
		int a [] = {10,20,40,50,60};
		int b [] = {10,20,40,50,60};	
		
		Boolean status= Arrays.equals(a,b);
		if(status==true)
		{
			System.out.println("Arrays are Equal.....");
		} 
		else
		{
			System.out.println("Arrays are Not Equal.....");
		}
	}
}