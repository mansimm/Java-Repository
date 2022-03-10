
class Thread2 extends Thread
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName() +" is running");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
public class ThreadGroupDemo2 {

	public static void main(String args[]) throws InterruptedException
	{
		ThreadGroup tg1 = new ThreadGroup("Parent");
		ThreadGroup tg2 = new ThreadGroup(tg1,"Child");
		
		Thread t1 = new Thread(tg1,"T1");
		Thread t2 = new Thread(tg1,"T2");
		Thread t3 = new Thread(tg1,"T3");
		
		t1.start();
		t2.start();
		
		System.out.println("Active Count of threads : "+tg1.activeCount());
		System.out.println("Active Count of thread group : "+tg1.activeGroupCount());
		System.out.println("isDeamon Thread : "+tg1.isDaemon());
		System.out.println("\nListing threads :");
		tg1.list();

		System.out.println("\n get parent thread of child tg:"+tg2.getParent());
		System.out.println("\n get max priority :"+tg2.getMaxPriority());
		System.out.println("\n is destroyrd :"+tg1.isDestroyed());
		
		t1.join();
		t2.join();
		t3.join();
		
		tg1.destroy();
		System.out.println("\n is destroyed:"+tg1.isDestroyed());




	}
}
