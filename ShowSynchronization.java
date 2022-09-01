// Create a program to show synchronization.
package assignment25aug2022;

public class ShowSynchronization {
	class A1
	{
	static synchronized void multiplication(int n) { 
	synchronized(A1.class){
		
			System.out.println(" outside of synchronized block");
			for(int i=1;i<=5;i++)
			{
				System.out.println(n*i);
				try {
					Thread.sleep(400);
				    }
					catch(Exception e)
					{
						System.out.println(e);
					}
				} 
			System.out.println(" rest of code which not to synchronized");
			} 
		}
	}
	public static void main(String[] args) {
		Thread t1=new Thread()
		   {
	   public void run()
	    {
			A1.multiplication(10);
		}
		   };
 Thread t2=new Thread()
 {
 	public void run()
 	{
 		A1.multiplication(200);
 	}
 };
 t1.start();
 t2.start();
	}

}
