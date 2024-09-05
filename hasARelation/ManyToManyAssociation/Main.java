package hasARelation.ManyToManyAssociation;

import hasARelation.ManyToOneAssociation.Student;

public class Main {

	public static void main(String[] args) {

		Course c1 = new Course("A11", "Java", "1000");
		Course c2 = new Course("B11", "Phython", "2000");
		Course c3 = new Course("C11", "Machine Learning", "3000");
		
		Course[] course = new Course[3];
		course[0] = c1;
		course[1] = c2;
		course[2] = c3;
		
		Students s1 = new Students("10", "Shivani", "Java" , course);
		Students s2 = new Students("11", "Shivam", "Phython" , course);
		Students s3 = new Students("12", "Shivani", "MachineLearning" , course);
	
		s1.getStudentDetails();
		s2.getStudentDetails();
		s3.getStudentDetails();
	}
	
}
