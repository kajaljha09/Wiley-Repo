
public class EmployeeUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Address tempAdd = new Address(27, "Emirates Building", "4721 Taylor Street", "New York");
		Address permAdd = new Address(27, "Emirates Building", "4721 Taylor Street", "New York");
		Address add[] = new Address[] {tempAdd, permAdd}; 
		Employee e = new Employee(1, "Kajal", add);
		e.displayEmployee();
		
		System.out.println("------------");
		
		Address tempAdd2 = new Address(12, "Emerald Housing", "2490 North Avenue", "Elkhorn");
		Address permAdd2 = new Address(21, "Impera Homes", "3479 Hillhaven Drive", "Bellflower");
		Address add2[] = new Address[] {tempAdd2, permAdd2}; 
		Employee e2 = new Employee(2, "Priyanka", add2);
		e2.displayEmployee();
	}

}
