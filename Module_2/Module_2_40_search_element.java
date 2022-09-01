package Module_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Module_2_40_search_element 
{
	public static void main(String[] args)
	{
		ArrayList<String> a = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		a.add("russia");
		a.add("canada");
		a.add("india");
		a.add("peris");
		a.add("china");
		System.out.println("arraylist collection is : "+a);
		System.out.println("Enter element to be search : ");
		String e = sc.next();
		if (a.contains(e)) // contains(e) method for check whether given element is present in list or not
		{
			System.out.println("this element is present at collection : "+a.indexOf(e)+e );
		}
		else
		{
			System.out.println("this element is not present at collection ");
		}
		
	}
}
