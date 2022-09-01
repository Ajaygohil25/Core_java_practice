package Module_2;
class mulThread extends Thread
{
	public void run()
	{
		for(int i=0; i<6; i++)
		{
			try 
			{
				Thread.sleep(2000);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
			System.out.println("hi i am ajay gohil !");
		}
		
	}
}
public class Module_2_30_multiThreadSleep 
{
	public static void main(String[] args) 
	{
		mulThread m = new mulThread();
		m.start();
		// m.setPriority(Thread.MAX_PRIORITY);
		for (int i =0; i<6; i++)
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
			System.out.println("I am java devloper !");
		}
	}

}
