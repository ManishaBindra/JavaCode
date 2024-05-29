package StaticKeyword;

class Demo{
	
	static int a;
	static int b ;

static {
	System.out.println("Static Block");
	a=10;
	b=50;
}

static void disp() {
	System.out.println("Static Method");
	System.out.println(a);
	System.out.println(b);
}

int x;
int y;
{
	x=10;
	y=20;
	System.out.println("Non-Static Java Block");
}

Demo(){
	System.out.println("Constructor");
}

void disp1() {
	System.out.println("Non-Static Method");
	System.out.println(x);
	System.out.println(y);
}

public class StaticBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo.disp();
		Demo d = new Demo();
		d.disp1();

	}
}
}