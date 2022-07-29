package Module_2;

class printNumber
{
	void printn(int a)
	{
		System.out.println("This is interger data type : "+a);
	}
	void printn(float a)
	{
		System.out.println("This is float data type : "+a);
	}
	void printn(double a)
	{
		System.out.println("This is double data type : "+a);
	}
	void printn(long a)
	{
		System.out.println("This is float long type : "+a);
	}
	
}

public class Module_2_6_printnumber_class {
	public static void main(String[] args) {
		printNumber p = new printNumber();
		p.printn(5);
		p.printn(1.2f);
		p.printn(1.3);
		p.printn(100000);
		
		
	}
	
}
