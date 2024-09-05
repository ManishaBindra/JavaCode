package hasARelation.OneToOneAssociation;

public class Account {
	public String accNo;
	public String accName;
	public String accNType;
	
	//Dependent object
	public Account(String accNo, String accName, String accNType) {
		super();
		this.accNo = accNo;
		this.accName = accName;
		this.accNType = accNType;
	}
	
}
