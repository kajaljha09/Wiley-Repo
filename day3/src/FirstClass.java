
public class FirstClass {
	int studentId;
	String studentName;
	 public FirstClass() {
		 studentId=1;
		 studentName="Kajal Jha";
	 }
     public FirstClass(int studentId,String studentName) {
    	 this.studentId=studentId;
    	 this.studentName=studentName;
     }
     public void attendance() {
    	 System.out.println("student no "+ studentId + " and name " + studentName + " is present");
     }
     
}
