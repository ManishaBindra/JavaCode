package hasARelation.OneToManyAssociation;

//Target Object
public class Department {

	public String dID ;
	public String dName;
	
	//many employees so keep that in array
	Employees[] emps;

	
	
	public Department(String dID, String dName, Employees[] emps) {
		super();
		this.dID = dID;
		this.dName = dName;
		this.emps = emps;
	}



	public void getDepartmentDetails() {
		System.out.println("Below is the Department Dtails ");
		System.out.println("Name of the Department  " +dName);
		System.out.println("Id of the Department is  "+ dID);
		System.out.println("====================================== ");
		
		System.out.println("Below is the employee Dtails ");
	//	because Emp is in arrray format that's why used loop 
		for(Employees employee : emps) {
			System.out.println("Employee Id is  " + employee.eID);
			System.out.println("Employee NAME is  " + employee. eName);
			System.out.println("Employee Address is  " + employee.eAddress);
			}
		System.out.println();

	}
}
