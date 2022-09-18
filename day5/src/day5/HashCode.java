package day5;

public class HashCode {
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
	public HashCode(int empId,String empName) {
		super();
		this.empId=empId;
		this.empName=empName;
	}
	public int hashCode() {
		return this.empId*8;
		
		
		
	}
	public static void main(String args[]) {
		HashCode e1=new HashCode(100,"Kajal Jha");
		
		System.out.println(e1.hashCode());
		
	}


}
