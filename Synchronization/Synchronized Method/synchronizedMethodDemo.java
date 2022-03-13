package javap.sycronization.practice;

class Table
{
	public synchronized void printTable(int n)
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(i*n);
		}
	}
}
public class synchronizedMethodDemo {
	public static void main(String args[])
	{
		Table table = new Table();
		Thread t1 = new Thread() {
			public void run()
			{
				table.printTable(5);
			}
		};
		Thread t2 = new Thread() {
			public void run()
			{
				table.printTable(100);
			}
		};
		
		t1.start();
		t2.start();
	}

}
