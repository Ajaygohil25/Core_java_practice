package Module_1;

import java.util.Scanner;

public class Module_1_3 {
	public static void main(String[] args) {
		System.out.println("Enter your year : ");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		if (year %4==0)
		{
			if (year %100 ==0)
			{
				if(year%400==0)
				{
					System.out.println("This is leap year ");
				}
				else
				{
					System.out.println("This is not Leap year");
				}
			}
			else 	
			{
				System.out.println("This is leap year");
			}
			
		}
		else 
		{
			System.out.println("This is not leap year");
		}
	}

}
