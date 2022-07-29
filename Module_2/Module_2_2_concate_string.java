package Module_2;

import java.util.Scanner;
// concat() method
public class Module_2_2_concate_string {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);	
		System.out.print("Enter your name : ");
		String name = sc.next();
		System.out.print("Enter your surname : ");
		String surname = sc.next();
		System.out.println("Full name is : "+name.concat(" "+surname));
	}

}
