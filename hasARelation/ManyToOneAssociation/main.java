package hasARelation.ManyToOneAssociation;

public class main {

	public static void main(String[] args) {
		
		Branch branch = new Branch();
		branch.setbId("ABD123");
		branch.setbName("Ineuron");
		
		Student s1 = new Student();
		s1.setsID("10");
		s1.setsName("Rahul");
		s1.setsAdd("CHD");
		s1.setBranch(branch);
		
		Student s2 = new Student();
		s2.setsID("11");
		s2.setsName("Kunal");
		s2.setsAdd("CHD");
		s2.setBranch(branch);
		
		Student s3 = new Student();
		s3.setsID("12");
		s3.setsName("Kamal");
		s3.setsAdd("CHD");
		s3.setBranch(branch);
	
		System.out.println("First Student details ");
		System.out.println("Id :: " + s1.getsID());
		System.out.println("Name :: " + s1.getsName());
		System.out.println("Address :: " + s1.getsAdd());
		
		System.out.println("Second Student details ");
		System.out.println("Id :: " + s2.getsID());
		System.out.println("Name :: " + s2.getsName());
		System.out.println("Address :: " + s2.getsAdd());
		
		
		System.out.println("Third Student details ");
		System.out.println("Id :: " + s3.getsID());
		System.out.println("Name :: " + s3.getsName());
		System.out.println("Address :: " + s3.getsAdd());
		
		System.out.println("Branch Details ");
		System.out.println("Branch Details : " + branch.getbName());
		System.out.println("Branch Details : " + branch.getbId());
		
		
		
	}
	
}
	
