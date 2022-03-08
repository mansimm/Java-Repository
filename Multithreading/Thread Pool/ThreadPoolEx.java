
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyRunnable implements Runnable
{
	private String msg;
	public MyRunnable(String msg)
	{
		this.msg = msg;
	}

	@Override
	public void run() {
		try {
			System.out.println(this.msg+" Running thread : "+ Thread.currentThread().getName());
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(this.msg+" Completed execution of : "+Thread.currentThread().getName());
	}
	
}
public class ThreadPoolEx {

	public static void main(String args[])
	{
		ExecutorService service = Executors.newFixedThreadPool(3);
		
		for(int i=1;i<=5;i++)
		{
			service.execute(new MyRunnable("Task-"+i));
		}
		service.shutdown();
	}
}
