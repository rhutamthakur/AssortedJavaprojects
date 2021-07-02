import java.util.*;
public class Question3
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Vector v = new Vector();
		String city,rem;
		int choice,i;
		do{
			System.out.print("1.Add city\n2.Remove city\n3.Display cities\n4.Exit\nEnter your choice:");
			choice = sc.nextInt();
			switch(choice)
			{
				case 1 :     System.out.print("Enter a city name:");
					city = sc.next();
					if(v.contains(city))
					{
						System.out.println("City already exists");
					}
					else v.addElement(city);
					break; 
				case 2 :	
					System.out.print("Name city to be removed:");
					rem = sc.next();
					if(v.contains(rem))
					{
						v.removeElement(rem);
					}
					else System.out.println("No such city added");
					break;
				case 3:	
					for(i=0;i<=v.size()-1;i++)
					{
						System.out.println(v.elementAt(i));
					}	
					break;
				case 4: break;
				default: System.out.print("Not a valid choice");
			}
		}while(choice!=4);
	}
}		