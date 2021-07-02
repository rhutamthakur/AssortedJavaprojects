import java.util.*;
public class Question4
{
	public static void main(String args[])
	{
		String sen;
		int i,upp=0,low=0,num=0,spec=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence:");
		sen=sc.nextLine();
		for(i = 0; i < sen.length(); i++) 
       		{ 
           		if(sen.charAt(i)>='A' && sen.charAt(i)<='Z') 
               		upp++; 
           		else if(sen.charAt(i)>='a' && sen.charAt(i)<='z') 
               		low++; 
           		else if(sen.charAt(i)>='0' && sen.charAt(i)<='9') 
               		num++; 
           		else
                	spec++; 
       		} 
		System.out.println("Lower case letters : " + low); 
        	System.out.println("Upper case letters : " + upp); 
        	System.out.println("Number : " + num); 
        	System.out.println("Special characters : " + spec); 
	}
}
