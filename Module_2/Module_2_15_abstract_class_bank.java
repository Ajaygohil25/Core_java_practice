package Module_2;
abstract class bank
{
	int a = 100;
	int b = 150;
	int c = 200;
	 public abstract void getBalance(); 
}
class BankA extends bank
{

	@Override
	public void getBalance() {
		System.out.println("Available Balance in bank A is : "+a + " $");
		
	}
	
}
class BankB extends bank
{

	@Override
	public void getBalance() {
		System.out.println("Available Balance in bank B is : "+b + " $");
		
	}
	
}
class BankC extends bank
{

	@Override
	public void getBalance() {
		System.out.println("Available Balance in bank C is : "+c+ " $");
		
	}
	
}
public class Module_2_15_abstract_class_bank
{
	public static void main(String[] args) 
	{
		BankA a= new BankA();
		a.getBalance();
		BankB b= new BankB();
		b.getBalance();
		BankC c= new BankC();
		c.getBalance();
		
 		
	}

}
