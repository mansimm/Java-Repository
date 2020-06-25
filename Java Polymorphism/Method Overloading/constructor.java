/*
	Constructor Overloading
*/

class Person
{
	private String name;
	private String dob;
	private String address;
	private double salary;
	private String department;

	public Person()
	{
		System.out.println("Default constructor is called ");
	}
	public Person(String name,String dob)
	{
		this.name=name;
		this.dob=dob;
		System.out.println("First Parameterised constructor is called");
	}
	public Person(String address,double salary,String department)
	{
		this.address=address;
		this.salary=salary;
		this.department=department;
		System.out.println("Second Parameterised constructor is called");
	}
}
public class constructor
{
	public static void main(String args[])
	{
		Person p1 = new Person();
		Person p2 = new Person("xyz","01-01-1882");
		Person p3 = new Person("Pune, Maharashtra",20000,"IT");
	}
}
/*
	output-

(base) mansi@mansi-Vostro-15-3568:~$ javac constructor.java
(base) mansi@mansi-Vostro-15-3568:~$ java constructor
Default constructor is called 
First Parameterised constructor is called
Second Parameterised constructor is called
(base) mansi@mansi-Vostro-15-3568:~$ 

*/
