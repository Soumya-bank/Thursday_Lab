// Create 3 thread as run according to priority.
package assignment25aug2022;

public class ThreadRunToPriority extends Thread {
	public void run()
	{
		for(int i=1;i<=5;i++)
		  {
			  try {
				  Thread.sleep(900);
			  }catch (InterruptedException e) {
				  System.out.println(e.getMessage());
			  }
			  System.out.println( Thread.currentThread().getName() +" "+ Thread.currentThread().getPriority());
		  }
	}
	public static void main(String[] args) {
		ThreadRunToPriority t1=new ThreadRunToPriority();
		ThreadRunToPriority t2=new ThreadRunToPriority();
		ThreadRunToPriority t3=new ThreadRunToPriority();
		t1.setName("Thread1");
		t2.setName("Thread2");
		t3.setName("Thread3");
		t1.setPriority(Thread.MIN_PRIORITY); // 1
		t2.setPriority(Thread.NORM_PRIORITY); // 5
		t3.setPriority(Thread.MAX_PRIORITY); // 10
		t1.start();
		t2.start();
        t3.start();

	}

}
