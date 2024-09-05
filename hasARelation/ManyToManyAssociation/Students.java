package hasARelation.ManyToManyAssociation;

import hasARelation.ManyToOneAssociation.Branch;
//Target Obj
public class Students {
	private String sID;
	private String sName;
	private String sAdd;
	
	//Has-A vaeiable 
	private Course[] course;

	//Constructor
	public Students(String sID, String sName, String sAdd, Course[] course) {
		super();
		this.sID = sID;
		this.sName = sName;
		this.sAdd = sAdd;
		this.course = course;
	}
	
	public void getStudentDetails() {
		System.out.println("SID is :: " +sID);
		System.out.println("SName is :: " +sName);
		System.out.println("SID is :: " +sID);
	
		System.out.println("Couse Details" );
		for(Course c : course) {
			System.out.println("CID is :: " + c.cId);
			System.out.println("CName is :: " +c.cName);
			System.out.println("CCost is :: " +c.cCost);
		}
		System.out.println("========================");
	}

	
	


}
