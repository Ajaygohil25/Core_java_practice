package Module_2;

import java.util.Scanner;

abstract class Marks
{
   //int a1,a2,a3;
   //int b1,b2,b3,b4;
    public abstract float getPercentage();	
}
class A extends Marks 
{ 
	int s1,s2,s3;
   A(int a1,int a2, int a3)
   {
	  s1=a1;
	  s2=a2;
	  s3=a3;
   }
       @Override
		public float getPercentage()
   		{ 
    	   float total = s1 +s2+s3;
    	   float pr =  (total *100)/300;
	   	   return pr;
   		}
}

class B extends Marks 
{
	int s1,s2,s3,s4;
	B(int b1,int b2,int b3,int b4)
	{
		s1=b1;
		s2=b2;
		s3=b3;
		s4=b4;
	}
	@Override
	public float getPercentage() 
	{
		float total = s1 +s2+s3+s4;
 	    float pr =  (total *100)/400;
	   	return pr;
	}
}
public class Module_2_16_pr_A_B 
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		int a1,a2,a3;
		int b1,b2,b3,b4;
		System.out.println("Enter marks of student A : ");
		System.out.print("subject 1 : ");
		a1=sc.nextInt();
		System.out.print("subject 2 : ");
		a2=sc.nextInt();
		System.out.print("subject 3 : ");
		a3=sc.nextInt();
		
		
		System.out.println("Enter marks of student B : ");
		System.out.print("subject 1 : ");
		b1=sc.nextInt();
		System.out.print("subject 2 : ");
		b2=sc.nextInt();
		System.out.print("subject 3 : ");
		b3=sc.nextInt();
		System.out.print("subject 4 : ");
		b4=sc.nextInt();
		
		A a = new A(a1,a2,a3);
		System.out.println("Persentage of Student of A is  : "+a.getPercentage());
		
		B b = new B(b1,b2,b3,b4);
		System.out.println("Persentage of Student of B is  : "+b.getPercentage());
		
	}

}
