package day5;

public class Equals {
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
	public Equals(int empId,String empName) {
		super();
		this.empId=empId;
		this.empName=empName;
	}
	public boolean equals(Object obj) {
		Equals e=(Equals)obj;
		if(this.empId==e.empId)
			return true;
		return false;
		
		
		
	}
	public static void main(String args[]) {
		Equals e1=new Equals(100,"Kajal Jha");
		Equals e2=new Equals(100,"Kajal Jha");
		System.out.println(e1.equals(e2));
		
	}

}
