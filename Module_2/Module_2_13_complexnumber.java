//Print the sum, difference and product of two complex numbers by creating a 
//class named 'Complex' with separate methods for each operation whose real
//and imaginary parts are entered by user.

package Module_2;

import java.util.Scanner;

class complex
{
	private final double real;
	private final double img;
	
	public complex(double real, double img)
	{
		this.real= real;
		this.img=img;
	}
	public complex sum (complex other)
	{
		double r = this.real + other.real;
		double i = this.img +other.real;
		return new complex(r,i);
	}
	public complex differance(complex other)
	{
		double r = this.real - other.real;
		double i = this.img - other.real;
		return new complex(r,i);
	}
	public double getreal()
	{
		return real;
	}
	public double getimg()
	{
		return img;
	}
	
	public String toString()
	{
	    return real + " + " + img + "i";
	}

}
public class Module_2_13_complexnumber 
{
	public static void main(String[] args)
	{
		System.out.println("Enter Number for 1st complex number : ");
		Scanner sc = new Scanner(System.in);
		double a= sc.nextDouble();
		double b= sc.nextDouble();
		complex c1 = new complex(a,b);
		
		System.out.println("Enter Number for 2nd complex number : ");
		double c= sc.nextDouble();
		double d= sc.nextDouble();
		complex c2 = new complex (c,d);
		
	     complex sum =c1.sum(c2);
	     complex differance =c1.differance(c2);
	     
	     System.out.println("First complex number is : "+c1);
	     System.out.println("Secound complex number is : "+c2);
	     System.out.println("Sum is : "+sum);
	     System.out.println("Differance is : "+differance);
		
	}

}
