package Module_2;

class printArea
{
	int area(int a)
	{
		return a*a;
	}
	int area(int l,int w)
	{
		return l*w;
	}
}

public class Module_2_8_AreaofRectangleSquare 
{
	public static void main(String[] args)  
	{
		printArea pa = new printArea();
		// another way to call method 
		int a = pa.area(12);
		System.out.println("Area of square is : "+a);
		//----------------------------------------------
		
		System.out.println("Area of square is : "+pa.area(12));
		System.out.println("Area of rectangle is : "+pa.area(3, 5));
	}
}
