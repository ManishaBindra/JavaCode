package hasARelation.ManyToOneAssociation;


//Target Obje
public class Student {

	private String sID;
	private String sName;
	private String sAdd;
	
	//Has-A vaeiable 
	Branch branch;

	public String getsID() {
		return sID;
	}

	public void setsID(String sID) {
		this.sID = sID;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getsAdd() {
		return sAdd;
	}

	public void setsAdd(String sAdd) {
		this.sAdd = sAdd;
	}

	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}
	

}
