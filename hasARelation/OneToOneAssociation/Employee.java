package hasARelation.OneToOneAssociation;

public class Employee {

	public String eID;
	public String eName;
	public String eAddress;
	
	Account account;
	
	
	//Target object
	public Employee(String eID, String eName, String eAddress, Account account) {
		super();
		this.eID = eID;
		this.eName = eName;
		this.eAddress = eAddress;
		this.account = account;
	}



	public void getEmployeeDetails() {
		System.out.println("Below is the employee Dtails ");
		System.out.println("Employee Id is  " + eID);
		System.out.println("Employee NAME is  " + eName);
		System.out.println("Employee Address is  " + eAddress);
		System.out.println("--------------------------------------------- ");
		System.out.println("Below is the Account Dtails ");
		System.out.println("Account Number is   " + account.accNo);
		System.out.println("Account Name is   " + account.accName );
		System.out.println("Account Type is   " + account.accNType);
	}
		
}
