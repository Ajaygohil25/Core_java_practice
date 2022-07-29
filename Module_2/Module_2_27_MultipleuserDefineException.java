package Module_2;
//W.A.J.P to create a class Student with attributes roll no, name, age and course. 
//Initialize values through parameterized constructor. If age of student is not 
//in between 15 and 21 then generate user defined exception "AgeNotWithinRangeException". 
//If name contains numbers or special symbols raise exception "NameNotValidException". Define the two exception classes.
class AgeNotwithinRangeException extends Exception
{
     
     public AgeNotwithinRangeException()
     {
    	 	System.out.println("This Age is not valied  15 and 21");
     }
}
class NameNotValidException extends Exception
{
     public NameNotValidException()
     {
    	 System.out.println("Name is not valied !");
     }
}
class Valied
{
	int rollnum,age;
	String name,cource;
	Valied(int rollnum,int age, String name, String cource) throws NameNotValidException, AgeNotwithinRangeException
	{
		this.rollnum = rollnum;
		this.age= age;
		this.name=name;
		this.cource =cource;
		int lenofname = name.length();
		int temp =0;
		for (int i=0; i<lenofname; i++)
		{
			char c;
			c=name.charAt(i);
			if (c<'A' || c >'Z' && c<'a'|| c>'z')
			{
				temp=1;
				throw new NameNotValidException();
			}	
//			else 
//			{
//				System.out.println("Name is valied");
//			}
				
		}
		 if (age==15 || age==21)
    	{
    		throw new AgeNotwithinRangeException();
    	}

		else
		{
			System.out.println("Roll number : "+rollnum);
			System.out.println("age is :"+age);
			System.out.println("name is : "+name);
			System.out.println("cource name : "+cource);
			
		}
		
	}
}

public class Module_2_27_MultipleuserDefineException 
{
	public static void main(String[] args)
	{
		try
		{
			 Valied s = new  Valied(1,16,"ajay","java");
		}
		catch(AgeNotwithinRangeException a)
		{
			a.printStackTrace();
			System.out.println("age is not valied");
		}
		catch(NameNotValidException n)
		{
			n.printStackTrace();
			System.out.println("name  is not valied");
		}
		
		
	}

}
