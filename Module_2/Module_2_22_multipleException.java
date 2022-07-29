package Module_2;

import java.util.Scanner;

public class Module_2_22_multipleException
{
	public static void main(String[] args)
	{
		try
		{
			int [] a = new int[5];
			
			System.out.println("divide zero");
			a[5]=30/0;
			
			
			for(int i=0; i<6; i++)
			{
				Scanner sc = new Scanner(System.in);
				System.out.println("enter array element ");
				a[i]=sc.nextInt();
			}
			for(int i=0; i<5; i++)
			{
				System.out.println(a[i]+" ");
			}
			
			
			
		}
		catch(Exception e)
		{
			System.out.println(e);
			e.printStackTrace();
		}
		
		
	}
}
