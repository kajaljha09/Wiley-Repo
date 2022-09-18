package day8;


public class ThreadDemo2 implements Runnable{
	
	
	
	public Static void main(String[] args) {
		ThreadDemo2 demo2=new ThreadDemo2();
		Thread t1=new Thread(demo2);
		
		//new therad(RUnnable ref
	
		t1.start(); //start is not availble in runnable
	}

	

}
