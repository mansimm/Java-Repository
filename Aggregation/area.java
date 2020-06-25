/* Aggregation- represents has a relationship  */

class operation
{
	public int square(int r)
	{
		return (r*r);
	}
}

public class area
{
	operation op;		// object of operation class represented as entity in area class
	double pi=3.14;

	public void Area(int r)
	{
		op = new operation();
		int sq = op.square(r);
		double area = pi*sq;
		System.out.println("Area of circle is :"+area);

	}
	public static void main(String args[])
	{
		area a1 = new area();
		a1.Area(7);

	}
}

/*
	output-

(base) mansi@mansi-Vostro-15-3568:~$ javac area.java
(base) mansi@mansi-Vostro-15-3568:~$ java area
Area of circle is :153.86
(base) mansi@mansi-Vostro-15-3568:~$ 

*/
