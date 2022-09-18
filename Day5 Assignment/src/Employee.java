
 class Employee implements Comparable<Employee> {
	private int empId;
	private String empName;
	private String empDept;
	private int empBasicSalary;
	private int empGrossSalary;

	public Employee(int empId, String empName, String empDept, int empBasicSalary) {
		this.empId = empId;
		this.empName = empName;
		this.empDept = empDept;
		this.empBasicSalary = empBasicSalary;
	}

	public int getEmpBasicSalary() {
		return empBasicSalary;
	}

	public void setEmpBasicSalary(int empBasicSalary) {
		this.empBasicSalary = empBasicSalary;
	}

	public  void calculateGrossSalary() {
       int DA=(8/100)*getEmpBasicSalary();
       int HRA=(12/100)*getEmpBasicSalary();
       int gross=getEmpBasicSalary()+HRA+DA;
       setEmpGrossSalary(gross);
	}

	public int getEmpId() {
		return empId;
	}

	public int getEmpGrossSalary() {
		return empGrossSalary;
	}

	public void setEmpGrossSalary(int empGrossSalary) {
		this.empGrossSalary = empGrossSalary;
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

	public String getEmpDept() {
		return empDept;
	}

	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empDept=" + empDept + ", empBasicSalary="
				+ empBasicSalary + ", empGrossSalary=" + empGrossSalary + "]";
	}
	
	

	public static void dispDeptWiseEmployee(Employee[] employee, String department) {
		for (Employee emp : employee) {
			if (emp.getEmpDept().equals(department))
				System.out.println(emp.toString());
		}
	}

	public static boolean equals(Object emp1, Object emp2) {
		// TODO Auto-generated method stub
		if (((Employee) emp1).getEmpId() == ((Employee) emp2).getEmpId()
				&& ((Employee) emp1).getEmpName() == ((Employee) emp2).getEmpName())
			return true;
		return false;
	}

	@Override
	public int compareTo(Employee arg0) {
		// TODO Auto-generated method stub
		return 0;
	}


	
	
}
