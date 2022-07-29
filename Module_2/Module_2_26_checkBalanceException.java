package Module_2;
//W.A.J.P to create a custom exception if Customer withdraw amount which is greater than account balance then program will
//show custom exception otherwise amount will deduct from account balance.
//Account balance is: 2000 Enter withdraw amount: 2500
//Sorry, insufficient balance, you need more 500 Rs. To perform this transaction.
class lowamountException extends Exception
{
	double amount;
	public lowamountException(double amount)
	{
		this.amount = amount;
	}
}
class balanceCheck
{
	double amount;
	public void deposite(double damount)
	{
	    amount+=damount;
	    System.out.println("Total amount is : "+amount);
	}
	public void withdraw(double wamount) throws lowamountException
	{
		if(wamount<amount)
		{
			amount-=wamount;
			System.out.println("You withdraw : "+wamount);
			System.out.println("remaining amount is : "+amount);
		}
		else
		{
			double need=wamount -amount;
			throw new lowamountException(need);
		}
	}
	
}

public class Module_2_26_checkBalanceException
{
	public static void main(String [] args)
	{
		try
		{
		balanceCheck b = new balanceCheck();
		b.deposite(75000);
		b.withdraw(100000);
		}
		catch(lowamountException e)
		{
			e.printStackTrace();
			System.out.println("Insuficient balance please add : "+e.amount + " rs");
		}
	}

}
