import java.util.*;

class Animal
{
	public void move()
	{
		System.out.println("Animal is running !");
	}
}
class Tortoise extends Animal
{
	public void walk()
	{
		System.out.println("Tortoise walks slowely....");
	}

}

class Rabbit extends Animal
{
	public void Run()
	{
		System.out.println("Rabbit is running fastly .");
	}
}

public class HierarchicalInheritance
{
	public static void main(String argc[])
	{
		Rabbit r = new Rabbit();
		r.Run();
		r.move();
	}

}
/*
	OUTPUT:

(base) mansi@mansi-Vostro-15-3568:~$ javac HierarchicalInheritance.java
(base) mansi@mansi-Vostro-15-3568:~$ java HierarchicalInheritance
Rabbit is running fastly .
Animal is running !
(base) mansi@mansi-Vostro-15-3568:~$ 


*/
