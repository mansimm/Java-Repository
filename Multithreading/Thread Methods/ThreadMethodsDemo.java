
class MyThread extends Thread
{	
	public MyThread(String name)
	{
		super(name);
	}
	public void run()
	{
		System.out.println("Thread Name : "+Thread.currentThread().getName());
		System.out.println("Thread Priority : "+Thread.currentThread().getPriority());
		System.out.println("Thread Group : "+Thread.currentThread().getThreadGroup());
		
		//get state of thread
		System.out.println("Thread state after starting thread : "+Thread.currentThread().getState());

		System.out.println("Thread isDeamon : "+Thread.currentThread().isDaemon());
		System.out.println("Thread is interrupted or not : "+Thread.currentThread().isInterrupted());


		// sleep method
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Thread completed it's execution ");

	}
}
public class ThreadMethodsDemo {

	public static void main(String args[]) throws InterruptedException
	{
		MyThread t1 = new MyThread("MyThread");
		System.out.println("Thread State before starting : "+t1.getState());

		t1.start();
		t1.sleep(5000);
		
		System.out.println("Thread State after running : "+t1.getState());

	}
}
