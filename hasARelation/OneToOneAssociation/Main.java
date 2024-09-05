package hasARelation.OneToOneAssociation;

public class Main {

	public static void main(String[] args) {
		Account account = new Account("ABC123" , "Shivani" , "Saving");
		Employee employee = new Employee("IND10 " , " Shivani", "YNR", account);
		
		employee.getEmployeeDetails();
	}

}
