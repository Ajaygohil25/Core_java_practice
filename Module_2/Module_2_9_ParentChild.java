package Module_2;
class parentcls
{
    void pmethod ()
    {
    	System.out.println("This is parent class");
    }
}
class childcls extends parentcls
{
	void cmethod()
	{
		System.out.println("This is child class");
	}
}
public class Module_2_9_ParentChild {
	public static void main(String[] args) { 
		parentcls  p = new parentcls();
		childcls c =new childcls();
		
		System.out.println("calling parent class by parent class object   ");
		p.pmethod();
		System.out.println("------------------------------------------------------");
		System.out.println("calling child  class by child class object   ");
		c.cmethod();
		System.out.println("------------------------------------------------------");
		System.out.println("calling parent class by child class object   ");
		c.pmethod();
	}

}
