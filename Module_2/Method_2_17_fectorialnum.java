package Module_2;

import java.util.Scanner;

// 5= 5*4*3*2*1
class fact
{
	public void factorial (int n)
	{
		int sum =1;
		for (int i=1; i<=n; i++)
		{
			sum = sum *i;
			
		}
		System.out.println("fectorial number is " + sum);
	}
}
public class Method_2_17_fectorialnum 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();
		fact fc= new fact();
		fc.factorial(n);
	}
}
