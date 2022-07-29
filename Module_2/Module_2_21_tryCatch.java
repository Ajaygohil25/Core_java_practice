package Module_2;

import java.util.Scanner;

public class Module_2_21_tryCatch
{
	public static void main(String[] args) 
	{
		try
		{
			System.out.println("Enter 2 number for division");
			Scanner sc = new Scanner(System.in);
			int num1,num2,sum;
			num1=sc.nextInt();
			num2=sc.nextInt();
			sum = num1/num2;
			System.out.println("Multiplication is : "+sum);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}
