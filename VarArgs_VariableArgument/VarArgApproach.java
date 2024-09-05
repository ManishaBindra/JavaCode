package VarArgs_VariableArgument;


class Demo{
	public void add(int... x) {
		System.out.println("Var-Arg Approach");
	}
	
}
public class VarArgApproach {

	public static void main(String[] args) {
		Demo d = new Demo();
		d.add();
		d.add(10);
		d.add(10,20);
		d.add(10,20,30);

	}

}
