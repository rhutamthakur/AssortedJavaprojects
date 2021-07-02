import java.util.*;
public class Question6
{
	public static void main(String args[])
	{
		int i,n,large,l;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of elements=");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter elements into array:");
		for(i=0;i<=n-1;i++)
		{
			a[i]=sc.nextInt();
		}
		large=a[0];
		for(i=0;i<=n-1;i++)
		{
			if(a[i]>large)
			large=a[i];
		}
		System.out.println("Largest number is "+large);
		l=a[0];
		for(i=0;i<=n-2;i++)
		{
			if((a[i]>1)&&(a[i]<large))
			l=a[i];
		}
		System.out.println("Second largest is "+l);
	}
}