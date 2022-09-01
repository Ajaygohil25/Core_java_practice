package Module_2;
class TestMultipriority extends Thread
{
	String name;
	int priority;
	@Override
	public void run() 
	{
		System.out.println("thread is runing...");
	}
	
}

public class Module_2_32_testMultipriority
{
	public static void main (String [] args)
	{
		TestMultipriority t1 = new TestMultipriority();
		TestMultipriority t2 = new TestMultipriority();
		t1.setName("myFirst thread");
		t1.setPriority(Thread.MAX_PRIORITY);
		
		t2.setName("mySecound thread");
		t2.setPriority(Thread.MIN_PRIORITY);
		
		t1.start();
		t2.start();
		
		System.out.println("thread name is : "+t1.getName());
		System.out.println("thread priority is : "+t1.getPriority());
		System.out.println("thread name is : "+t2.getName());
		System.out.println("thread priority is : "+t2.getPriority());
	}
}
