import java.util.*;

public class Fibo {
	
	public void genFibo(int range) {
		int first=0,second=1,third=0,i;
		System.out.print("Fibonacci Series is"+first+" "+second);
		for(i=2;i<=range;i++) {
			third=first+second;
			first=second;
			second=third;
			System.out.print(" "+third);
		}
				
		
	}
	//using memoisation
//	ArrayList<Integer> arr=new ArrayList<Integer>();
//	public int fiboMemo(int n) {
//		if(n<=1) {
//			return n;
//		}
//		if(arr.get(n)!=0) {
//			return arr.get(n);
//		}
//		else {
//			arr.add(n,fiboMemo(n-1) + fiboMemo(n-2));
//			return arr.get(n);
//		}
//	}
	public static void main(String args[]) {
		
		Fibo printFibo=new Fibo();
		
		printFibo.genFibo(5);
//		
//		for (int i = 0; i < 5; i++) {
//			System.out.print(printFibo.fiboMemo(i) + " ");
//		}
	}
	

}
