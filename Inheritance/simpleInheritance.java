class Person//parent class
{
	//private data members
	private String name;
	private int age;
	private String DoB;

	//parameterised constructor
	public Person(String name,int age, String DoB)
	{
		this.name=name;
		this.age=age;
		this.DoB=DoB;
	}

	//public getters
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	public String getDoB()
	{
		return DoB;
	}

}

class Employee extends Person//child class
{
	private int emp_id;
	private double salary;
	private String occupation;

	//parameterised constructor
	public Employee(int emp_id,double salary,String occupation,String name,int age, String DoB)
	{
		super(name,age,DoB);//it calls constructor of parent class ie. Person class
		this.emp_id=emp_id;
		this.salary=salary;
		this.occupation=occupation;
	}
	public void show()//method of child class can access members of parent class
	{
		System.out.println(" Employee Id : "+emp_id);
		System.out.println(" Employee Name : "+getName());
		System.out.println(" Employee Occupation : "+occupation);
		System.out.println(" Employee Salary : "+salary);
		System.out.println(" Employee Age : "+getAge());
		System.out.println(" Employee DoB : "+getDoB());
	}

}

public class simpleInheritance
{

	public static void main(String args[])
	{
		Employee emp1=new Employee(1,50000,"Teacher","Harry",25,"05-01-1991");
		Employee emp2=new Employee(2,90000,"Doctor","Ronald",28,"25-03-1988");

		System.out.println("\n	Employee Details");
		emp1.show();
		System.out.println("\n	Employee Details");
		emp2.show();

	}

}

/*
	output

(base) mansi@mansi-Vostro-15-3568:~$ javac simpleInheritance.java
(base) mansi@mansi-Vostro-15-3568:~$ java simpleInheritance

	Employee Details
 Employee Id : 1
 Employee Name : Harry
 Employee Occupation : Teacher
 Employee Salary : 50000.0
 Employee Age : 25
 Employee DoB : 05-01-1991

	Employee Details
 Employee Id : 2
 Employee Name : Ronald
 Employee Occupation : Doctor
 Employee Salary : 90000.0
 Employee Age : 28
 Employee DoB : 25-03-1988
(base) mansi@mansi-Vostro-15-3568:~$ 

*/
