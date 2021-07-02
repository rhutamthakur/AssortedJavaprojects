import java.util.*;
class Square
{
	private float side,area;
	public Square()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter side");
		side = sc.nextFloat();
	}
	public Square(float x)
	{
		side =x;
	}
	public Square(Square x)
	{
		side = x.side;
	}
	public void display()
	{
		System.out.println("AREA :"+area);
	}
	public void calculate()
	{
		area = side*side;
	}
}
public class Question8
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		float s;
		System.out.println("Enter a side");
		s=sc.nextFloat();
		Square s1=new Square(s);
		s1.calculate();
		s1.display();
		Square s2 = new Square(s1);
		s2.calculate();
		s2.display();
		Square s3 = new Square();
		s3.calculate();
		s3.display();
	}
}