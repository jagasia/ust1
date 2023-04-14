
public class One {
	public synchronized void method1()
	{
		final int MARKS=100;
		
		System.out.println("Method 1 started executing by "+Thread.currentThread().getName());

//		synchronized (this) {
			for(int i=0;i<10;i++)
			{
				System.out.println(Thread.currentThread().getName()+"is printing : "+i);			
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
//		}
		
		
			for(int i=100;i<110;i++)
			{
				System.out.println("Another loop of "+Thread.currentThread().getName()+" : "+i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		
		System.out.println("End of method 1");
	}
}
