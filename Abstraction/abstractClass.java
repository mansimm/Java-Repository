abstract class shape
{
	public shape()//abstract class can have constructors
	{
		System.out.println("	Shape Constructor called !");
	}
	abstract void draw();//abstract method cannot have body
	
	void msg()//abstract class can have non abstract methods
	{
		System.out.println("	This is None Abstract method from abstract class ...");
	}

}
class circle extends shape
{
	void draw()//child class provide implementation of abstract method
	{ 
		System.out.println("	Drawing a Circle");
	}
}
class rectangle extends shape
{
	void draw()//child class provide implementation of abstract method
	{ 
		System.out.println("	Drawing a Rectangle");
	}
}

public class abstractClass
{
	public static void main(String args[])
	{
		shape s1 = new circle();
		s1.draw();
		shape s2 = new rectangle();
		s2.draw();
		//call non abstract method
		s1.msg();
	}
}
/*
	Output-

(base) mansi@mansi-Vostro-15-3568:~$ javac abstractClass.java
(base) mansi@mansi-Vostro-15-3568:~$ java abstractClass
	Shape Constructor called !
	Drawing a Circle
	Shape Constructor called !
	Drawing a Rectangle
	This is None Abstract method from abstract class ...
(base) mansi@mansi-Vostro-15-3568:~$ 



*/
