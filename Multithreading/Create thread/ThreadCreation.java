

class OpThread extends Thread
{
	public void run()
	{
		for(int i=0;i<3;i++)
		{
			System.out.println(i);
		}
	}
}
class OpRunnable implements Runnable
{
	public void run()
	{
		for(int i=0;i<3;i++)
		{
			System.out.println(i);
		}
	}
}
public class ThreadCreation {

	public static void main(String args[]) 
	{
		try {
			// thread creation by extending thread class
			OpThread t1 = new OpThread();
			OpThread t2 = new OpThread();
			
			System.out.println("thread creation by extending thread class");
			t1.start();
			t2.start();

			//t1.join();
			//t2.join();
			
			// thread creation by implementing runnable interface
			OpThread r1 = new OpThread();
			OpThread r2 = new OpThread();
			
			System.out.println("thread creation by implementing runnable interface");
			Thread tt1 = new Thread(r1);
			Thread tt2 = new Thread(r1);
			
			tt1.start();
			tt2.start();

		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
	}
	
}
