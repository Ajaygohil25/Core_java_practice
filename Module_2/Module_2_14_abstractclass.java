package Module_2;
abstract class parent
{
	public abstract void message(); // abstract class and abstract method 	
}

class fclass extends parent
{
	public void message()
	{
		System.out.println("this is first class");
	}
	
}
class sclass extends parent
{
     public void message()
     {
    	 System.out.println("this is secound class");
     }
}
public class Module_2_14_abstractclass 
{
	public static void main(String[] args)
	{
		fclass fc = new fclass();
		fc.message();
		sclass sc= new sclass();
		sc.message();
	}

}
