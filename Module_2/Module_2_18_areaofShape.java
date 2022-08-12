package Module_2;

// area of rectangle --> A=wl
// area of square --> A=a^2
// area of circle --> A = pi r^2
abstract class Shape
{
	abstract public void RectangleArea(float w, float l);
	abstract public void SquareArea(float a);
	abstract public void CircleArea(float r);	
}
class Area extends Shape
{

	@Override
	public void RectangleArea(float w, float l) 
	{
		float area;
		 area  = w*l;
		 System.out.println("Area of Recantangle is : "+area);
		
	}

	@Override
	public void SquareArea(float a)
	{
		float area;
		area = a*a;
		System.out.println("Area of Square is : "+area);
		
	}

	@Override
	public void CircleArea(float r) 
	{
		float area;
		area = (float) ((r*r)* 3.14);
		System.out.println("Area of Circle is : "+area);
	}
	
}
public class Module_2_18_areaofShape
{
	public static void main(String[] args)
	{
		Area a = new Area();
		a.RectangleArea(2f, 3f);
		a.SquareArea(4f);
		a.CircleArea(5f);
		
	}
}
