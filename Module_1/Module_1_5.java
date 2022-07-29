package Module_1;

import java.util.Scanner;

public class Module_1_5 {
	public static void main(String[] args) {
		int a,sum=0,avg=1;
		for (int i=1; i<=5; i++)
		{
			System.out.println("enter number : ");
		     Scanner sc = new Scanner(System.in);
		      a = sc.nextInt();
		      sum +=a;
		     
		}
		System.out.println("Sum of 5 Number is : "+sum);
		avg = sum/5;
		System.out.println("Average  of 5 number is : "+avg);
		
		
	}

}
