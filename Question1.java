import java.util.*;
class Armstrong
{
	private int n,d,sum=0,copy;
	public void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number=");		
		n=sc.nextInt();
		copy=n;
	}
	public void arms()
	{
		while(n>0)
		{
			d=n%10;
			sum=sum+d*d*d;
			n=n/10;
		}
		if(copy==sum)
		System.out.println("Armstrong Number");	
		else
		System.out.println("Not an Armstrong Number");
	}
}
public class Question1
{
	public static void main(String args[])
	{
		Armstrong a=new Armstrong();
		a.accept();
		a.arms();
	}
}
		