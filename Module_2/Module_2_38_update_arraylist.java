package Module_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Module_2_38_update_arraylist
{
	public static void main(String[] args) 
	{
		ArrayList <String> a1 = new ArrayList <String>();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of arraylist : ");
		int s = sc.nextInt();
		while(s>0)
		{
			System.out.println("Enter arraylist element to add : ");
		    String e = sc.next();
		    a1.add(e);
		    s--;
		}		
	    System.out.println("arraylist collection is : "+a1);
	    System.out.println("-----------------------------------------------");
	    System.out.println("enter index and element value for update ");
	    System.out.print("enter index number");
	    int  i = sc.nextInt();
	    System.out.print("enter value of element");
	    String u =sc.next();
	    a1.set(i, u);
	    System.out.println("updated arraylist collection is : "+a1);
	    
	    
	}

}
