package Module_2;

import java.util.Scanner;

//91-100 AA
//81-90 AB
//71-80 BB
//61-70 BC
//51-60 CD
//41-50 DD
//<=40 Fail
class grade
{
	public void result(int pr)
	{
		if ( pr>=91 && pr<100)
		{
			System.out.println("Your grade is AA");
		}
		else if (pr>81 && pr<=90)
		{
			System.out.println("Your grade is BB");
		}
		else if (pr>71 && pr<=80)
		{
			System.out.println("Your grade is BC");
		}
		else if (pr>61 && pr<=70)
		{
			System.out.println("Your grade is BC");
		}
		else if (pr>51 && pr<=60)
		{
			System.out.println("Your grade is BC");
		}
		else if (pr>41 && pr<=50)
		{
			System.out.println("Your grade is BC");
		}
		else if (pr<=40)
		{
			System.out.println("Sorry ! , You are fail in exam ");
		}
	}
}
public class Module_2_19_grade 
{
	public static void main(String[] args)  
	{
	   System.out.println("Enter marks for subject : ");
	   Scanner sc = new Scanner(System.in);
	   int pr = sc.nextInt();
	   if (pr>100)
	   {
		   System.out.println("please enter marks in range of 100 ! ");
		   
	   }
	   else 
	   {
		   grade g= new grade();
		   g.result(pr);
	   }
	   sc.close();
			   
		
	}
}
