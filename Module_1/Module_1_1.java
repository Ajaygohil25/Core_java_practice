package Module_1;

import java.util.Scanner;

public class Module_1_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1,num2,num3;
		System.out.println("Enter 1st number ");
		num1= sc.nextInt();
		System.out.println("Enter 2nd number ");
		num2 = sc.nextInt();
		System.out.println("Enter 3rd number ");
		num3 = sc.nextInt();
		if (num1 > num2 && num1 >num3)
		{
			System.out.println("This number is greater number :"+num1);
		}
		else if (num2 > num1 && num2 >num3)
		{
			System.out.println("This number is greater number :"+num2);
		}
		else if (num3 > num1 && num3 >num2)
		{
			System.out.println("This number is greater number :"+num3);
		}
		else
		{
			System.out.println("No any nunmber is greater ");
		}
	}

}
