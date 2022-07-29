package Module_2;
// area of triangle float s=((a+b+c)/2.0),A=sqrt(s*(s-a)*(s-b)*(s-c)
// perimeter of triangle =  a+b+c

class triangle
{
	int a,b,c;
	public void area(int s1,int s2,int s3)
	{
		a=s1;
		b=s2;
		c=s3;
		
		float s=(float) ((a+b+c)/2.0);
		float A= (float) Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("Area of triangle : "+A);
 	}
	public void perimeter(int s1,int s2,int s3)
	{
		a=s1;
		b=s2;
		c=s3;
		int p=a+b+c;
		System.out.println("Perimeter of triangle : "+p);
		
	}
}

public class Module_2_12_areaOf_triangle {
	public static void main(String[] args) {
		int s1=3, s2=4,s3=5;
		triangle t= new triangle();
		t.area(s1, s2, s3);
		t.perimeter(s1, s2, s3);
	}

}
