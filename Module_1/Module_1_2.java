package Module_1;

import java.util.Scanner;

public class Module_1_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter one character : ");
		 String i = sc.next().toLowerCase();
		 boolean upparcase = i.charAt(0) >=65 && i.charAt(0) <=90;
		 boolean lowercase = i.charAt(0) >=97 && i.charAt(0) <=122;
		boolean vowel = i.equals("a") || i.equals("e") || i.equals("i") || i.equals("o") || i.equals("u"); 
		if (i.length()>1)
		{
			 System.out.println("Error. Not a single character.");
		}
		else if (!(upparcase || lowercase))
		{
			System.out.println("Error. Not a letter. Enter uppercase or lowercase letter.");
		}
		else if (vowel)
		{
			System.out.println("this is vowel character ");
		}
		else
		{
			System.out.println("this is consonant character ");
		}
}
}
