package Module_2;

import java.util.Scanner;



class outOfrangeException  extends Exception
{
	int num; 
	public outOfrangeException(int num)
	{
		this.num = num;
	}
}

class rangeCheck
{
	public void range(int num) throws outOfrangeException
	{
		System.out.println("method is caklled..");
//		//int [] a = new int [10];
//		if(num<=10 && num>=40)
//		{
//			throw new outOfrangeException(num);
//		}
//		else
//		{
////			for (int i=0; i<10 ; i++)
////			{
////				a[i]=num;
////			}
////			for (int i=0; i<10 ; i++)
////			{
////				System.out.println(" "+a[i]);
////			}
//			System.out.println(num);
//		}
		if(num>=10 && num <=40)
		{
			System.out.println("num is,.. "+num);
			
		}
		else
		{
			throw new outOfrangeException(num);
			//System.out.println("your number is,,, "+num);
		
		}
			
		
		
	}
}

public class Module_2_24_userDefineException
{
	public static void main(String[] args) 
	{
		try
		{
			rangeCheck r=  new rangeCheck();
			
			for (int i=0; i<10; i++)
			{
				System.out.println("enter number : ");
				Scanner sc = new Scanner(System.in);
				int num = sc.nextInt();
				r.range(num);
			}
		}
		catch(outOfrangeException e)
		{
			System.out.println("number should be in range greater then 10 and less then 40 this number : "+e.num + " is invalied !");
		
			//e.printStackTrace();
			
		}
	}
}
