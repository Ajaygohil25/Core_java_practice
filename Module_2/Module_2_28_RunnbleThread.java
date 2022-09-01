package Module_2;
class RunnableThread implements Runnable
{
	public void run() 
	{
		for (int i =0; i<5; i++)
		{
		try
		{
			Thread.sleep(2000);
		} 
		catch (InterruptedException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("hi i am java devloper !");
		}
	}
	
}
public class Module_2_28_RunnbleThread
{
	public static void main(String[] args)
	{
		RunnableThread rn = new RunnableThread();
		Thread t  = new Thread(rn);
		t.start();
	}


}
