package day8;

public class THreadDemo3 {
	public static void voud(String[] args)
	{
		Thread thread= new Thread()
				{
			public void run() {
				System.out.println("run is invoked");
			}
				};
				thread.start();
				
				Runnable thread2=new Runnable() {
					@Override
					public void run() {
						System.out.println("run method from rnnable invokded");
					}
				};
				Thread t1=new Thread(thread2);
				t1.start();
				
		
		
	}
}
