package javap.sycronization.practice;

class Table1
{
	public static synchronized void printTable(int n)
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(i*n);
			try{  
			       Thread.sleep(400);  
			   }catch(Exception e){}  
		}
		
	}
}
public class StaticSynchronization {
	public static void main(String args[])
	{
		Table1 table1 = new Table1();
		Table1 table2 = new Table1();

		Thread t1 = new Thread() {
			public void run()
			{
				table1.printTable(5);
			}
		};
		Thread t2 = new Thread() {
			public void run()
			{
				table1.printTable(10);
			}
		};
		Thread t3 = new Thread() {
			public void run()
			{
				table2.printTable(50);
			}
		};
		Thread t4 = new Thread() {
			public void run()
			{
				table2.printTable(100);
			}
		};
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
