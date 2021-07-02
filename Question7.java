import java.util.*;
public class Question7
{
	public static void main(String arg[])
	{
		int sum=0,number=0;
		Scanner sc= new Scanner(System.in);
		while(number != 999)
		{
			System.out.println("Enter a number=");
			number=sc.nextInt();
			sum=sum+number;
		}
		System.out.println("The sum of all numbers is "+sum);
	}	
}