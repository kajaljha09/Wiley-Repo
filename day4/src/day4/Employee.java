package day4;

public class Employee {
	int empId;
	String empName;
	static int counter;
	public Employee(int empId,String empName) {
		this.empId=empId;
		this.empName=empName;
		counter++;
		
	}
	

}
