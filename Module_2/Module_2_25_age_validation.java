package Module_2;
class ageVal
{
	public void age(int a)
	{
		int age = a;
		if (age<18)
		{
			throw new  ArithmeticException("invalied age");
		}
		else
		{
			System.out.println("welcome to vote");
		}
	}
}
public class Module_2_25_age_validation 
{ 
	public static void main(String[] args)
	{
		try
		{
			ageVal a = new ageVal();
			a.age(16);
		}
		catch (ArithmeticException e)
		{
			e.printStackTrace();
		}
	}

}
