import java.util.*;
public class Question2
{
	public static int factorial(int n)
	{	
		int i,fact=1;
		for(i=1;i<=n;i++)
		{
			fact= fact*i;
		}
		return fact;
	}
	public static void main(String arg[])
	{
		int n,r;
		float npr,ncr;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter value of n and r=");
		n=sc.nextInt();
		r=sc.nextInt();
		ncr=(float)(factorial(n)/factorial(n-r));
		npr=(float)(factorial(n)/factorial(n-r)*(factorial(r)));
		System.out.print("nCr= "+ncr+"\nnPr= " +npr);
	}
}
		