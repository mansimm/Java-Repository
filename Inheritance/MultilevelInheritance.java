import java.util.*;

class Person
{
	String name;
	String dob;
	String address;

	public Person(String name,String dob,String address)
	{
		this.name = name;
		this.dob  = dob;
		this.address = address;
	}

}
class Employee extends Person
{
	double salary;
	String department;
	int emp_id;

	public Employee(double salary,String department,int emp_id,String name,String dob,String address)
	{
		super(name,dob,address);
		this.salary = salary;
		this.department = department;
		this.emp_id = emp_id;
	}

}
class Information extends Employee
{
	String contact;

	public Information(String contact,double salary,String department,int emp_id,String name,String dob,String address)
	{
		super(salary,department,emp_id,name,dob,address);
		this.contact = contact;
	}

	void show()
	{
		System.out.println("		\n Info\n");
		System.out.println("Employee id :"+emp_id);
		System.out.println("Employee Name :"+name);
		System.out.println("Employee DOB :"+dob);
		System.out.println("Employee address :"+address);
		System.out.println("Employee department :"+department);
		System.out.println("Employee salary :"+salary);
		System.out.println("Employee contact :"+contact);
	}


}
public class MultilevelInheritance
{
	public static void main(String args[])
	{
		Information info = new Information("1234567890",30000,"IT & services",101,"Jerry watson","03-01-1997","Los Vegas");
		info.show();
	}

}

/*

output-

(base) mansi@mansi-Vostro-15-3568:~$ javac MultilevelInheritance.java
(base) mansi@mansi-Vostro-15-3568:~$ java MultilevelInheritance
		
 Info

Employee id :101
Employee Name :Jerry watson
Employee DOB :03-01-1997
Employee address :Los Vegas
Employee department :IT & services
Employee salary :30000.0
Employee contact :1234567890
(base) mansi@mansi-Vostro-15-3568:~$ 
*/
