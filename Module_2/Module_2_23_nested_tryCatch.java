package Module_2;

import java.util.Scanner;

public class Module_2_23_nested_tryCatch 
{
	public static void main(String[] args)
	{
		try
		{
			int []a = new int[5];
			
			for (int i=0; i<5; i++)
			{
				Scanner sc =new Scanner(System.in);
				System.out.println("Enter array element");
				a[i]=sc.nextInt();
			}
			for (int i=0; i<6; i++)
			{
				System.out.println(a[i]);
			}
			a[4]=30/0;
			
			
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
	}

}
