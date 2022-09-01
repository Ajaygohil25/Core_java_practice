package Module_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Module_2_37_RetriveElement_Arraylist 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter index number for get element from arraylist : ");
		int n = sc.nextInt();
		ArrayList a1 = new ArrayList();
		a1.add("c++");
		a1.add(0, "java"); // add element at first position
		a1.add("c");
		
		// arraylist.size() for length of arraylist and arraylistname.get()  for retrieve specific element
		
		if(a1.size()>n)
		{
			System.out.println("item at index number : "+a1.get(n));
		}
		else
		{
			System.out.println("enter index number within size");
		}
		
	}
}
