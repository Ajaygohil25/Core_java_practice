package Module_1;

import java.util.Scanner;

public class Module_1_8 {
	public static void main(String[] args) {
		long num;
		int total=0;
		long n = 10000000;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : " );
		num= sc.nextLong(); //123
		if (num>0 && n<num ) // 123>0
		{
			while(num != 0)  // 123 
			{
				num=num/10; 
				total++;
			}
			System.out.println("total number is : "+total);
		}
		else
			
		{
			System.out.println("enter valied number");
		}
	}
}
