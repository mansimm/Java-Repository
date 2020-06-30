interface Interface
{
	void PythonCoarse();
	void CPPCoarse();
	void JavaCoarse();
	void PythonListCoarse();
}

abstract class Coarse implements Interface
{
	public void PythonCoarse()
	{
		System.out.println("	You are enrolled in python coarse !");
	}
	public void CPPCoarse()
	{
		System.out.println("	You are enrolled in cpp coarse !");
	}
	public void JavaCoarse()
	{
		System.out.println("	You are enrolled in java coarse !");
	}

}
class subCoarse extends Coarse
{
	public void PythonListCoarse()
	{
		System.out.println("	You are enrolled in python list subcoarse !");
	}

}
public class testInterface
{
	public static void main(String args[])
	{
		Interface I = new subCoarse();

		I.PythonCoarse();
		I.CPPCoarse();
		I.JavaCoarse();
		I.PythonListCoarse();
	}
}
/*
	Output-

(base) mansi@mansi-Vostro-15-3568:~$ javac testInterface.java
(base) mansi@mansi-Vostro-15-3568:~$ java testInterface
	You are enrolled in python coarse !
	You are enrolled in cpp coarse !
	You are enrolled in java coarse !
	You are enrolled in python list subcoarse !
(base) mansi@mansi-Vostro-15-3568:~$ 

*/
