package day5;

public class ToString {
	private int empId;
	private String empName;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public ToString(int empId,String empName) {
		super();
		this.empId=empId;
		this.empName=empName;
	}
	public String toString() {
		return this.empId +" " + this.empName;
	}
	public static void main(String args[]) {
		ToString e1=new ToString(100,"Kajal Jha");
		System.out.println(e1.toString());
		
	}
	

}
