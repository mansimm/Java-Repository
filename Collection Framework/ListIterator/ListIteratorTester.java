import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;

class Employee
{
	private String name;
	private String empId;
	private int experience;

	Employee(String name,String empId,int experience)
	{
		this.name = name;
		this.empId = empId;
		this.experience = experience;
	}

	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}

	public void setEmpId(String empId)
	{
		this.empId = empId;
	}
	public String getEmpId()
	{
		return empId;
	}

	public void setExperience(int experience)
	{
		this.experience = experience;
	}
	public int getExperience()
	{
		return experience;
	}
}

public class ListIteratorTester
{
	public static void main(String args[])
	{
		List<Employee> emp = new ArrayList<Employee>();

		emp.add(new Employee("ABC","E101",3));
		emp.add(new Employee("XYZ","E102",2));
		emp.add(new Employee("WSX","E103",1));
		emp.add(new Employee("QAZ","E104",7));

		System.out.println("\nNormal Order :");
		ListIterator<Employee> it1 = emp.listIterator(); 
		while(it1.hasNext())
		{
			Employee e = it1.next();
			System.out.println("\nEmp Name : "+e.getName());
			System.out.println("Emp Number : "+e.getEmpId());
			System.out.println("Emp Experience : "+e.getExperience());

		}
		System.out.println("\n Reverse Order :");
		while(it1.hasPrevious())
		{
			Employee e = it1.previous();
			System.out.println("\nEmp Name : "+e.getName());
			System.out.println("Emp Number : "+e.getEmpId());
			System.out.println("Emp Experience : "+e.getExperience());

		}	
	}

}
/*
Output-

(base) mansi@mansi-Vostro-15-3568:~/Java Collection Framework$ javac ListIteratorTester.java
(base) mansi@mansi-Vostro-15-3568:~/Java Collection Framework$ java ListIteratorTester

Normal Order :

Emp Name : ABC
Emp Number : E101
Emp Experience : 3

Emp Name : XYZ
Emp Number : E102
Emp Experience : 2

Emp Name : WSX
Emp Number : E103
Emp Experience : 1

Emp Name : QAZ
Emp Number : E104
Emp Experience : 7

 Reverse Order :

Emp Name : QAZ
Emp Number : E104
Emp Experience : 7

Emp Name : WSX
Emp Number : E103
Emp Experience : 1

Emp Name : XYZ
Emp Number : E102
Emp Experience : 2

Emp Name : ABC
Emp Number : E101
Emp Experience : 3



*/
