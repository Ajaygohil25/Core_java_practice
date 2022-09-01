package Module_2;

class Threadcheck extends Thread
{
	  
	public void run() 
	{
		// TODO Auto-generated method stub
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
			System.out.println("test thread twice here");
		}
		
		
	}
}
public class Module_2_31_testThreadTwice 
{
	public static void main(String[] args)
	{
		Threadcheck t = new Threadcheck();
		t.start();
		t.start();
		// After starting a thread, it can never be started again.
		//If you does so, an IllegalThreadStateException is thrown.
		//In such case, thread will run once but for second time, it will throw exception.
	}
}
