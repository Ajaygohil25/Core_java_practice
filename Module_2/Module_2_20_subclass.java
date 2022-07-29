package Module_2;
class Shape1
{
	public void printshape()
	{
		System.out.println("This is shape ");
	}
}
class Rectangle1 extends Shape1
{
	public void printrectangle()
	{
		System.out.println("This is rectangle shape");
	}
}
class circle1 extends Shape1
{
	public void printcircle()
	{
		System.out.println("This is circle shape");
	}
}
class Square1 extends Rectangle1
{
	public void printSquare()
	{
		System.out.println("Square is a rectangle");
	}
}
public class Module_2_20_subclass
{
	public static void main(String [] args )
	{
		Square1 s = new Square1();
		s.printshape();
		s.printrectangle();
		s.printSquare();
		
	}
	
}
