
public class Employee {
	private int empId;
	private String empName;
	private Address empAddress[];
	Employee(int empId,String empName,Address [] empAddress){
		this.empId=empId;
		this.empName=empName;
		this.empAddress=empAddress;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpAddress(Address[] empAddress) {
		this.empAddress = empAddress;
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
	public void displayEmployee() {
		System.out.println("Employee ID: " + empId + " | Employee Name: " + empName + " | Employee Address: ");
		getEmpAddress();
	}
	public void getEmpAddress() {
		for(Address e: empAddress) {
			System.out.println(e.getFlatNumber() + "/" + e.getFlatName() + ", " + e.getRoadName() + ", " + e.getCityName());
		}
	}
	
	
	

}
