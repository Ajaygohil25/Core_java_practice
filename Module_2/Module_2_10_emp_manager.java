package Module_2;

class member 
{ 
	// name,age,ph.no, address, salary
	String name,address;
	int age,salary;
	long ph_no;
	void printsalary(String name, int age, int salary, long ph_no,String address)
	{
//		this.name =  name;
//		this.age=  age;
//	    this.salary= salary;
//	    this.ph_no= ph_no;
//	    this.address= address;
	    System.out.println("Name is : "+name);
	    System.out.println("Age is  : "+age);
	    System.out.println("Salary is : "+salary);
	    System.out.println("Phone number is : "+ph_no);
	    System.out.println("Address is : "+address);
	}
}
class employee extends member
{
	String spealization;
	employee()
	{
		System.out.println("I am employee");
	}
	void printspe(String spealization)
	{
		this.spealization = spealization;
		System.out.println("My spealization is : "+spealization);
	}
}
class manager extends member 
{
	String department;
	manager()
	{
		System.out.println("I am manager");
	}
	void printdep(String department)
	{
		this.department= department;
		System.out.println("MY Department is : "+department);
	}
}
public class Module_2_10_emp_manager
{
	public static void main(String[] args) 
	{
		employee e = new employee();	
		e.printsalary("ajay", 22, 45000,999934344,"Ahemdabad");
		e.printspe("Java devloper");
		System.out.println("------------------------------------------");
		manager m = new manager();
		m.printsalary("Ruhan", 30, 55000, 888887777, "Rajkot");
		m.printdep("HR");
		
		
	}

}
