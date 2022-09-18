package day8;

public class ThreadDemo extends Thread{
	

	public void run() {
		//implicitly invodkd when the thread execures
	
		System.out.println("theread is executed");
		System.out.println(Thread.currentThread().getName()+" "+ Thread.currentThread().getId());
	}
   public static void main(String[] args) {
	   System.out.println(Thread.currentThread().getName()+" "+ Thread.currentThread().getId()); 
	 ThreadDemo demo1=new ThreadDemo();  //created new thread
	 ThreadDemo demo2=new ThreadDemo();
	 ThreadDemo demo3=new ThreadDemo();
	 demo1.start(); //thread-0
	 demo2.start();// thread-1

	 demo3.start();//thread-2
	 demo1.setPriority(10);
	 
     }
 }
 
