package Module_2;

// area of square         :   A= a^2 ; a= side
// perimeter of square    :   P = 4 a
// area of rectangle      :   A = l * w ; l=length , w=width 
// perimeter of rectangle :  P = 2(l+w) 

class rectangle 
{
	int length,breadth;
	rectangle(int l,int b)
	{
		this.length = l;
		this.breadth = b;
	}
  
  
	
	void area()
	{
		int A = length * breadth;
		System.out.println("Area of rectangle is : "+A);
		
	}
	void perimeter()
	{
		int P;
		P= 2 * (length + breadth);
		System.out.println("Perimeter of rectangle is : "+P);
	}
}
class square extends rectangle
{

	public square(int s) {
		super(s,s);
	}
	
}
	

public class Module_2_11_areaOF_rectangle_square 
{
	public static void main(String[] args)
	{
		rectangle r =  new rectangle(2,3);
		r.area();
		r.perimeter();
		System.out.println("---------------------------");
		//rectangle s = new square(10);
		square s = new square(10);
		s.area();
		s.perimeter();
		
	}

}
