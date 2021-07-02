import java.util.*;
class Employee
{
	private String name;
	private String dep;
	private int ID,sal;
	public void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter details for employee=");
		System.out.print("Name =");
		name=sc.nextLine();
		System.out.print("Department =");
		dep=sc.nextLine();
		System.out.print("ID =");
		ID=sc.nextInt();
		System.out.print("Salary =");
		sal=sc.nextInt();
	}
	public void display()
	{
		System.out.println("Name\tDepartment\tID\tSalary");
		System.out.println(name+"\t"+dep+"\t"+ID+"\t"+sal);
	}
}
public class Question5
{
	public static void main(String args[])
	{
		int n,i;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of employees=");
		n=sc.nextInt();
		Employee e[]=new Employee[n];
		for(i=0;i<=n-1;i++)
		{
			e[i]=new Employee();
		}
		for(i=0;i<=n-1;i++)
		{
			e[i].accept();
		}
		for(i=0;i<=n-1;i++)
		{	
			System.out.println("Details of employee "+(i+1));
			e[i].display();
		}
	}
}

		


	