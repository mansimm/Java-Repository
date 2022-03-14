package javap.multithreding.practice;

class SimpleThread extends Thread
{
	public void run()
	{
		for(int i=1;i<=2;i++)
		{
			System.out.println(i);
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println("Thread interrupted..");
		}
	}
}
public class InterruptDemo {

	public static void main(String args[])
	{
		SimpleThread s = new SimpleThread();
		s.start();
		System.out.println("is interrupted before: "+s.isInterrupted());
		s.interrupt();
		System.out.println("is interrupted after: "+s.isInterrupted());

		System.out.println("interrupted : "+s.interrupted());

	}
}
