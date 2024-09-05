package hasARelation.OneToManyAssociation;

public class Main {

	public static void main(String[] args) {
		Employees e1 = new Employees("10", "Manisha", "Ynr");
		Employees e2 = new Employees("11", "Shivani", "Karnal");
		Employees e3 = new Employees("12", "Shweta", "AMBALA");
		
		Employees[] emps = new Employees[3];
		emps[0] = e1;
		emps[1] = e2;
		emps[2] = e3;
		
		Department department = new Department("ABCD1234", "Apna Store", emps);
		

		department.getDepartmentDetails();
		

	}

}
