package Module_1;

import java.util.Scanner;

public class Module_1_10_ascii_val {
	public static void main(String[] args) {
		// ASCII value of character 
		System.out.println("Enter number : ");
		Scanner sc = new Scanner(System.in);
		
		char ch= sc.next().charAt(0);
		// type casting 
		int Ascii = (int) ch;
		System.out.println("Ascii value of character : "+Ascii);
		
	}

}
