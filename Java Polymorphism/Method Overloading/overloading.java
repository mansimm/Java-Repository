/*
	Method overloading :
	method overloading can be done by changing number of parameters, datatypes of parameters.
	overloading is not possible by only changing return type of methods because of ambiguity.
	gives compilation error on trying to overload only by changing return type.
*/

class Adder
{
	void add(int a,int b)
	{
		System.out.println("Addition of integers " +a+ "+" +b+ "=" +(a+b));
	}
	void add(int a,int b,int c)
	{
		System.out.println("Addition of integers "+a+"+"+b+"+"+c+"="+(a+b+c));
	}
	void add(double a, double b)
	{
		System.out.println("Addition of doubles "+a+"+"+b+"="+(a+b));
	}
}

public class overloading
{
	public static void main(String args[])
	{
		Adder a = new Adder();
		a.add(100,200);
		a.add(100,200,300);
		a.add(10.22,20.55);
	}
}

/*

Output :

(base) mansi@mansi-Vostro-15-3568:~$ javac overloading.java
(base) mansi@mansi-Vostro-15-3568:~$ java overloading
Addition of integers 100+200=300
Addition of integers 100+200+300=600
Addition of doubles 10.22+20.55=30.770000000000003
(base) mansi@mansi-Vostro-15-3568:~$ 


*/
