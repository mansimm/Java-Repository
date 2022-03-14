package javap.sycronization.practice;

class Customer
{
	int amt;
	
	public synchronized void deposit(int amt)
	{
		this.amt+=amt;
		System.out.println("Account creadited with "+amt+" rupees");
		notify();
	}
	public synchronized void withdraw(int amt) throws InterruptedException
	{
		if(this.amt<amt)
		{
			System.out.println("Account balance is less than amount...");
			System.out.println("Waiting for deposite");
			wait();
			
			this.amt-=amt;
			System.out.println("Account is debited by "+amt+" rupees");
		}
	}
}
public class InterThreadCommunicationDemo {

	public static void main(String args[])
	{
		Customer c = new Customer();
		
		Thread t1 = new Thread()
		{
			public void run()
			{
				try {
					c.withdraw(10000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		Thread t2 = new Thread()
		{
			public void run()
			{
				c.deposit(15000);
			}
		};
		
		t1.start();
		t2.start();
	}
}
