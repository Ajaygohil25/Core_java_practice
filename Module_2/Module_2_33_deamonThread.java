package Module_2;
class TestDaemon1 extends Thread
{
	// Daemon thread in Java is a service provider thread that provides services to the user thread
	public void run()
	{
		if(Thread.currentThread().isDaemon()) // use of isDaemon() for check thread is daemon or  not
		{
			System.out.println("this is deamon thread !");
		}
		else
		{
			System.out.println("this is normal thread");
		}
	}
}
class TestDaemon2 extends Thread
{
	public void run()
	{
		System.out.println("this is secound thread !");
	}
}
public class Module_2_33_deamonThread 
{
	public static void main(String[] args) 
	{
		TestDaemon1 t1  = new TestDaemon1();
		t1.setDaemon(true); // setDaemon() method for set current thread as daemon thread and inside argument is true or false
		t1.start();
		
		TestDaemon2 t2 = new TestDaemon2();
		t2.start();
	}
}
