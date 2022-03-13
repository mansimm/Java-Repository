package javap.sycronization.practice;

class Message
{
	public void send(String msg)
	{
		synchronized(this)
		{
			try
			{
				Thread.sleep(2000);
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
			System.out.println("Message sent : "+msg);
		}
	}
}
public class SynchronizedBlockDemo {

	public static void main(String args[]) throws InterruptedException
	{
		Message m = new Message();
		Thread t1 = new Thread()
				{
					public void run()
					{
						m.send("Hello there...");
					}
				};
				
		Thread t2 = new Thread()
				{
					public void run()
					{
						m.send("Goodbye...");
					}
				};
		t1.start();
		t2.start();
				
		t1.join();
		t2.join();
	}
}
