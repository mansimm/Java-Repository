class Address
{
	String city;
	String state;
	int pincode;
	
	public Address(String city,String state,int pincode)
	{
		this.city=city;
		this.state=state;
		this.pincode=pincode;
	}
}

public class Employee
{
	String name;
	int empid;
	Address add;
	
	public Employee(String name,int empid,Address add)
	{
		this.name=name;
		this.empid=empid;
		this.add=add;
	}
	public void show()
	{
		System.out.println();
		System.out.println("	Employee name : "+ name);
		System.out.println("	Employee id : "+ empid);
		System.out.println("	Employee address : "+ add.city+" ,"+add.state+" ,"+add.pincode);
	}
	public static void main(String args[])
	{
		Address add = new Address("Mumbai","Maharashtra",123421);

		Employee emp = new Employee("xyz",608,add);
		emp.show();

	}

}

/*
	output-

(base) mansi@mansi-Vostro-15-3568:~$ javac Employee.java
(base) mansi@mansi-Vostro-15-3568:~$ java Employee

	Employee name : xyz
	Employee id : 608
	Employee address : Mumbai ,Maharashtra ,123421
(base) mansi@mansi-Vostro-15-3568:~$ 


*/
