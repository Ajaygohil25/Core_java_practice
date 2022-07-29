package Module_1;

import java.util.Scanner;

// count the letters, spaces, numbers and other characters
public class Module_1_9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input : ");
		String s = sc.nextLine();   
		count(s);
	}
	public static void count(String a)
	{
		char [] c = a.toCharArray();
		int letter=0;
		int space =0;
		int number =0;
		int oth_char=0;
		
	    for (int i=0; i < a.length(); i++)
	    {
	    	if (Character.isLetter(c[i])) // isLetter() = method for check letter in string
	    	{
	    		letter++;
	    	}
	    	else if(Character.isSpaceChar(c[i]))
	    	{
	    		space++;
	    	}
	    	else if(Character.isDigit(c[i]))
	    	{
	    		number++;
	    	}
	    	else
	    	{
	    		oth_char++;
	    	}
	    }
	    	System.out.println("Total letter in string : "+letter);
	    	System.out.println("Total space in string : "+space);
	    	System.out.println("Total number in string : "+number);
	    	System.out.println("Total other character in string : "+oth_char);
	}

}
