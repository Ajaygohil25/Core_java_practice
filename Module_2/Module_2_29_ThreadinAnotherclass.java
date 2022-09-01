package Module_2;
class Threadanother extends Thread
{
	public void run()
	{
		for(int i=0; i<5; i++)
		{
			System.out.println("hi , i am thread of another class :)");
		}
	}
}
public class Module_2_29_ThreadinAnotherclass
{
	public static void main(String[] args)
	{
		Threadanother ta = new Threadanother();
		ta.start();
	}
}
