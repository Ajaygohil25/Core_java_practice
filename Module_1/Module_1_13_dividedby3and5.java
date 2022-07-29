package Module_1;

import java.util.Scanner;

public class Module_1_13_dividedby3and5 {
	public static void main(String[] args) {
		System.out.print("Enter Number : ");
		int num;
		Scanner sc = new Scanner(System.in);
		num= sc.nextInt();
		if (num>=1 && num<=100)
		{
			if (num%3==0 && num%5==0)
			{
				System.out.println("This number is divided by 3 and 5 : "+num);
			}
			else
			{
				System.out.println("This number is not divided by 3 and 5");
			}
		}
		else 
		{
			System.out.println("Invalied number !!");
		}
	}

}
