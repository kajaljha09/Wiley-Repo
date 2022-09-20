import java.util.Scanner;

public class Ques1to6 {
	
	public static void main(String[] args) {  
		
		//first solution of assignment
		//1. Write a program to reverse a String
		System.out.println("...............Question 1 Solution...........");
		System.out.print("Enter your string :");
		Scanner sc=new Scanner(System.in);
		String string=sc.nextLine();
		String str="";
		char ch;
		System.out.println("Original String is " + string);
		for(int i=0;i<string.length();i++) {
			ch=string.charAt(i);
			str=ch+str;
		}
	
		System.out.println("Reversed word is  " + str);
		
		// second solution of assignment
		/*2.Create custom/user defined exception to validate the email. 
		 *  Sample output1: 
		 *  Entered email address : mandarmjog@gmail.com
		 *  Your email address is valid.
		 *  Sample output2:
		 *  Entered email address: wiley@g@.com
		 *  Your email address is invalid
		 *  Sample output3:
		 *  Entered email address: .wi@.gmail@1234
		 *  Your email address is invalid
		*/
		
		System.out.println("...........Question 2 Solution......");
		
		String email1="mandarmjog@gmail.com";
		String email2="wiley@g@.com";
		String email3=".wi@.gmail@1234";
		String regex= "^[a-zA-Z0-9_.]+@[a-zA-Z0-9.]+$";
		boolean result=email1.matches(regex);
		if(result) {
			System.out.println("Your email address is valid");
		}
		else {
			System.out.println("Your email address is not valid");
		}
			
		result= email2.matches(regex);
		if(result) {
			System.out.println("Your email address is valid");
		}
		else {
			System.out.println("Your email address is not valid");
		}
		result= email3.matches(regex);
		if(result) {
			System.out.println("Your email address is valid");
		}
		else {
			System.out.println("Your email address is not valid");
		}
		
		
		System.out.println(".............Question 4 Solution...........");
		//4.Write a program to count the occurance of the character in the given String. 
		System.out.print("Enter a string in which you want to find a particular character");
		String string2=sc.nextLine();
		System.out.print("Enter a character");
		char ch2=sc.next().charAt(0);
		int count=0;
		for(int i=0;i<string2.length();i++) {
			if(string2.charAt(i)==ch2) {
				count++;
			}
		}
		System.out.println(ch2+ " is present "+ count+ " times");
		
		//5.Write a program to test if the first and last element of the array are same. The length of the array must be greater than 5. 
		System.out.println("................Question 5 Solution...........");

		int[] arr = new int[]{1,2,3,3,2,1};
		if(arr[0]==arr[arr.length-1]) System.out.println("Yes 1st and last element of array are equal");
		else System.out.println("No 1st and last element of array are not equal");
		
		
		//6.Write a program if the two given strings are anagram or not
		
		System.out.println("..............Question 6 Solution............");
		String str1="kajal";
		String str2="jakala";
		String res="";
		if(str1.length()!=str2.length()) {
			System.out.println("Not anagram");
				
		}
		else {
			for(int i=0;i<str1.length();i++) {
				for(int j=0;j<str2.length();j++) {
					if(str1.charAt(i)==str2.charAt(j)) {
						res=res+"x";
						break;
					}
				}
			}
		}
		if(res.length()==str2.length()) {
			System.out.println("String is anagram");
		}
		else {
			System.out.println("String is not anagram");
		}
	}
	

}
