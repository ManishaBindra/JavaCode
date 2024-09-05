package innerJavaClass;

class OuterClass{
	int age;
	public void show() {
		System.out.println("In Show");
	}
	static class InnerClass{
		public void config() {
			System.out.println("InnerClass ");
	}
		
	}
}

	public class InnerClassConcept {

	public static void main(String[] args) {
		OuterClass o = new OuterClass();
		o.show();
		
		//syntax
		OuterClass.InnerClass i = new OuterClass.InnerClass();
		i.config();

	}

}
