class Bank
{
	public int RateOfInterest(){	return 0;}
}
class ICIC extends Bank
{
	public int RateOfInterest(){	return 3;}
}
class HDFC extends Bank
{
	public int RateOfInterest(){	return 5;}
}
class StateBank extends Bank
{
	public int RateOfInterest(){	return 11;}
}
class SBI extends Bank
{
	public int RateOfInterest(){	return 10;}
}


public class Overriding
{
	public static void main(String args[])
	{
		ICIC obj1 = new ICIC();
		HDFC obj2 = new HDFC();
		SBI  obj3 = new SBI();
		StateBank obj4 = new StateBank();

		System.out.println("	Rate of Interest in ICIC bank : "+obj1.RateOfInterest());
		System.out.println("	Rate of Interest in HDFC bank : "+obj2.RateOfInterest());
		System.out.println("	Rate of Interest in StateBank bank : "+obj4.RateOfInterest());
		System.out.println("	Rate of Interest in SBI bank : "+obj3.RateOfInterest());
	}	

}

/*
Output- 

(base) mansi@mansi-Vostro-15-3568:~$ javac Overriding.java
(base) mansi@mansi-Vostro-15-3568:~$ java Overriding
	Rate of Interest in ICIC bank : 3
	Rate of Interest in HDFC bank : 5
	Rate of Interest in StateBank bank : 11
	Rate of Interest in SBI bank : 10
(base) mansi@mansi-Vostro-15-3568:~$ 





*/
