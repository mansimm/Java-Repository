
class ThreadDemo implements Runnable
{
	public void run()
	{
		System.out.println("Thread is running");
	}
}
public class ThreadGroupDemo {

	public static void main(String arggs[]) throws InterruptedException
	{
		ThreadGroup grp = new ThreadGroup("Grp-1");
		Thread t1 = new Thread(grp,new ThreadDemo(), "T1");
		Thread t2 = new Thread(grp,new ThreadDemo(), "T2");
		Thread t3 = new Thread(grp,new ThreadDemo(), "T3");
		
		t1.start();
		t2.start();
		t3.start();

		System.out.println(grp.getName());
		System.out.println("Active threads : "+grp.activeCount());
		System.out.println("Active thread groups count : "+grp.activeGroupCount());

		grp.list();
		t1.join();
		t2.join();
		t3.join();
		//destroying thread group and its sub thread group
		grp.destroy();
	}
}
