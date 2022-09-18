import java.util.Arrays;
import java.util.Scanner;

public class EmployeeUse {
	public static void main(String args[]) {
		Employee emp1=new Employee(1,"Kajal Jha","SDE",20000);
		Employee emp2=new Employee(2,"Vinay Jha","HR",30000);
		Employee emp3=new Employee(3,"Shubham Jha","SDE",40000);
		Employee emp4=new Employee(4,"Shivam Jha","DM",10000);
		Employee emp5=new Employee(5,"Priyanka Jha","SDE",50000);
		
		Employee[] arrayEmp=new Employee[] {emp1,emp2,emp3,emp4,emp5};

		Arrays.sort(arrayEmp); // sorting array

		System.out.println("\n---------Sorted Array-----------\n");

		for (Employee emp : arrayEmp) {
			System.out.println(emp.toString());
		}
		System.out.println("\n---------Employee according to required Department-----------\n");

		Scanner s = new Scanner(System.in);
		System.out.println("enter Reqired department name: ");
		String department = s.nextLine();

		Employee.dispDeptWiseEmployee(arrayEmp, department); // department wise display
		
		System.out.println(emp1.equals(emp2)); 
		System.out.println(emp2.equals(emp3)); 
		System.out.println(emp3.equals(emp4)); 
		
	}

}
